import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import autogen.src.grammar.*;
import java.io.*;
import java.util.BitSet;


/**
 * Created by devinmorgan on 12/24/16.
 */



class Main {

    private static void runScannerTests() {
        String scannerTestsInputDirectory = "tests/scanner/input/";
        File root = new File(scannerTestsInputDirectory);
        File[] files = root.listFiles(new NoHiddenFilesFilter());

        StringBuilder testData = new StringBuilder();
        int numTests = files.length;
        int passedTestsCount = 0;

        for (File file : files) {
            try {
                CharStream stream = new ANTLRFileStream(file.getPath());
                JavaScanner scanner = new JavaScanner(stream);
                StringBuilder outputBuilder = new StringBuilder();

                // use the custom ErrorListener to detect syntax errors from Scanner
                ANTLRErrorListener errorListener = new ScannerErrorListener(outputBuilder);
                scanner.removeErrorListeners();
                scanner.addErrorListener(errorListener);

                // iterate over every token from the stream
                for (Token token = scanner.nextToken(); token.getType() != JavaScanner.EOF; token = scanner.nextToken()) {
                    String type = "";
                    String text = token.getText();

                    // collect relevant data in a human readable format
                    if (token.getType() == JavaScanner.INT) {
                        type = " INT";
                    }
                    else if (token.getType() == JavaScanner.STRING) {
                        type = " STRING";
                    }
                    else if (token.getType() == JavaScanner.BOOL) {
                        type = " BOOL";
                    }
                    else if (token.getType() == JavaScanner.ID) {
                        type = " IDENT";
                    }
                    outputBuilder.append("line " + token.getLine() + ":" + token.getCharPositionInLine()
                            + " " + type + " " + text + "\n");
                }

//                System.out.println(outputBuilder.toString()); // uncomment to debug

                // load the expected output file
                String scannerTestsOutputDirectory = "tests/scanner/output/";
                String scannerTestExtension = ".out";
                StringBuilder expectedOuput
                        = Main.readFile(scannerTestsOutputDirectory + file.getName() + scannerTestExtension);

                // compare the actual output with the expected output
                boolean passTest = outputBuilder.toString().equals(expectedOuput.toString());
                if (passTest) {
                    passedTestsCount++;
                }
                else {
                    testData.append("Testing " + file.getPath() + ":\n");
                    testData.append("Failed.\n");
                    testData.append(outputBuilder);
                    testData.append("\n");
                    testData.append(expectedOuput);
                    testData.append("\n\n");
                }
            }
            catch (IOException e) {
                System.err.println("There was an error: " + file.toString() + " " + e);
                System.exit(1);
            }
        }
        System.out.println("Passed " + passedTestsCount + "/" + numTests + " scanner tests\n");
        System.out.println(testData);
    }

    private static void runParserTests() {
        String scannerTestsInputDirectory = "tests/scanner/input/";
        File root = new File(scannerTestsInputDirectory);
        File[] files = root.listFiles(new NoHiddenFilesFilter());

        StringBuilder testData = new StringBuilder();
        int numTests = files.length;
        int passedTestsCount = 0;

        for (File file : files) {
            try {
                CharStream stream = new ANTLRFileStream(file.getPath());
                JavaScanner scanner = new JavaScanner(stream);
                StringBuilder outputBuilder = new StringBuilder();
                CommonTokenStream tokenStream = new CommonTokenStream(scanner); // added for Antlr4
                DecafParser parser = new DecafParser(tokenStream);

                // Semantic/token recognition error capture mechanism
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                PrintStream p = new PrintStream(bytes, true, "UTF-8");
                System.setErr(p);

                parser.setTrace(CLI.debug);
                parser.program();
                String printedSoFar = bytes.toString("UTF-8");
                System.out.print(printedSoFar);

                if (parser.getNumberOfSyntaxErrors() > 0 || printedSoFar.length() > 0) {
                    System.exit(1);
                }

//                System.out.println(outputBuilder.toString()); // uncomment to debug

                // load the expected output file
                String scannerTestsOutputDirectory = "tests/scanner/output/";
                String scannerTestExtension = ".out";
                StringBuilder expectedOuput
                        = Main.readFile(scannerTestsOutputDirectory + file.getName() + scannerTestExtension);

                // compare the actual output with the expected output
                boolean passTest = outputBuilder.toString().equals(expectedOuput.toString());
                if (passTest) {
                    passedTestsCount++;
                }
                else {
                    testData.append("Testing " + file.getPath() + ":\n");
                    testData.append("Failed.\n");
                    testData.append(outputBuilder);
                    testData.append("\n");
                    testData.append(expectedOuput);
                    testData.append("\n\n");
                }
            }
            catch (IOException e) {
                System.err.println("There was an error: " + file.toString() + " " + e);
                System.exit(1);
            }
        }
        System.out.println("Passed " + passedTestsCount + "/" + numTests + " scanner tests\n");
        System.out.println(testData);
















    }

    public static void main(String[] args) {
        Main.runScannerTests();
    }

    private static class ScannerErrorListener implements ANTLRErrorListener {

        private StringBuilder stringBuilder;

        public ScannerErrorListener(StringBuilder stringBuilder) {
            this.stringBuilder = stringBuilder;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
            this.stringBuilder.append("line " + i + ":" + i1 + "  " + s + "\n");
        }

        @Override
        public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

        }

        @Override
        public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

        }

        @Override
        public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

        }

    }

    private static class NoHiddenFilesFilter implements FileFilter {
        @Override
        public boolean accept(File file) {
            return !file.isHidden();
        }
    }

    private static StringBuilder readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb;
        } finally {
            br.close();
        }
    }

}
