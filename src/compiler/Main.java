package compiler;

import compiler.grammar.JavaParser;
import compiler.grammar.JavaScanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;


/**
 * Created by devinmorgan on 12/24/16.
 */



class Main {

    private static void runScannerTests() {
        System.out.print("Running scanner tests...\n");
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
        System.out.println("Passed " + passedTestsCount + "/" + numTests + " scanner tests");
        System.out.println(testData);
    }

    private static void runParserTests() {
        System.out.print("Running illegal parser tests...\n");
        StringBuilder testData = new StringBuilder();

        // run the illegal parser tests
        String illegalParserTestsDirectory = "tests/parser/input/illegal/";
        File illegalRoot = new File(illegalParserTestsDirectory);
        File[] illegalTestFiles = illegalRoot.listFiles(new NoHiddenFilesFilter());
        int illegalTestsPassed = 0;

        for (File file : illegalTestFiles) {
            try {
                // create the parser
                CharStream stream = new ANTLRFileStream(file.getPath());
                JavaScanner scanner = new JavaScanner(stream);
                CommonTokenStream tokenStream = new CommonTokenStream(scanner);
                JavaParser parser = new JavaParser(tokenStream);

                // capture syntax errors (this is from 6.035 code)
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                PrintStream p = new PrintStream(bytes, true, "UTF-8");
                System.setErr(p);

                // capture parser error
                parser.program();
                String testResults = bytes.toString("UTF-8");
                StringBuilder outputBuilder = new StringBuilder();
                outputBuilder.append(testResults);

//                System.out.println(testResults); // uncomment to debug

                // load the expected output file
                String illegalParserTestsOutputDirectory = "tests/parser/output/illegal/";
                String parserTestExtension = ".out";
                StringBuilder expectedOuput
                        = Main.readFile(illegalParserTestsOutputDirectory + file.getName() + parserTestExtension);

                // compare the actual output with the expected output
                boolean passTest = outputBuilder.toString().equals(expectedOuput.toString());
                if (passTest) {
                    illegalTestsPassed++;
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
        System.out.println("Passed " + illegalTestsPassed + "/" + illegalTestFiles.length + " parser tests\n");

        // run the legal parser tests
        System.out.print("Running legal parser tests...\n");
        String legalParserTestsDirectory = "tests/parser/input/legal/";
        File legalRoot = new File(legalParserTestsDirectory);
        File[] legalTestFiles = legalRoot.listFiles(new NoHiddenFilesFilter());
        int legalTestsPassed = 0;

        for (File file : legalTestFiles) {
            try {
                // create the parser
                CharStream stream = new ANTLRFileStream(file.getPath());
                JavaScanner scanner = new JavaScanner(stream);
                CommonTokenStream tokenStream = new CommonTokenStream(scanner);
                JavaParser parser = new JavaParser(tokenStream);

                // capture syntax errors (this is from 6.035 code)
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                PrintStream p = new PrintStream(bytes, true, "UTF-8");
                System.setErr(p);

                // capture parser error
                parser.program();
                String testResults = bytes.toString("UTF-8");
                StringBuilder outputBuilder = new StringBuilder();
                outputBuilder.append(testResults);

//                System.out.println(testResults); // uncomment to debug

                // compare the actual output with the expected output
                boolean passTest = outputBuilder.toString().equals("");
                if (passTest) {
                    legalTestsPassed++;
                } else {
                    testData.append("Testing " + file.getPath() + ":\n");
                    testData.append("Failed.\n");
                    testData.append(outputBuilder);
                    testData.append("\n\n");
                }
            } catch (IOException e) {
                System.err.println("There was an error: " + file.toString() + " " + e);
                System.exit(1);
            }
        }
        System.out.println("Passed " + legalTestsPassed + "/" + legalTestFiles.length + " parser tests\n");
        System.out.println(testData);
    }

    public static void main(String[] args) {
        Main.runScannerTests();
        Main.runParserTests();
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
