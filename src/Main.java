import grammar.scanner.JavaScanner;
import org.antlr.v4.runtime.*;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.BitSet;
import java.util.Scanner;


/**
 * Created by devinmorgan on 12/24/16.
 */



class Main {

    private static void runScannerTests() {

        // get all the tests for the scanner
        String scannerTestsDirectory = "tests/scanner/input";

        // run each scanner test
        File root = new File(scannerTestsDirectory);
        File[] files = root.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return !file.isHidden();
            }
        });


        for (File file : files) {

            // print file name
            System.out.println(file.getPath());

            try {
                CharStream stream = new ANTLRFileStream(file.getPath());
                JavaScanner scanner = new JavaScanner(stream);
                PrintStream outputStream = System.out;

                // use the custom ErrorListener to detect syntax errors from Scanner
                ANTLRErrorListener errorListener = new ScannerErrorListener(outputStream);
                scanner.removeErrorListeners();
                scanner.addErrorListener(errorListener);

                // iterate over every token from the stream
                for (Token token = scanner.nextToken(); token.getType() != JavaScanner.EOF; token = scanner.nextToken()) {
                    String type = "";
                    String text = token.getText();

                    // collect relevant data about the token in a human readable format
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
                    else if (token.getType() >= JavaScanner.RES_CLASS && token.getType() <= JavaScanner.RES_NEW) {
                        type = "RES_WORD";
                    }

                    // aggregate this data in the outputStream to help debugging
                    outputStream.println("line " + token.getLine() + ":" + token.getCharPositionInLine() +
                            " " + type + " " + text);
                }
            }
            catch (IOException e) {
                System.err.println("There was an error: " + file.toString() + " " + e);
                System.exit(1);
            }
            catch (NoViableAltException e) {
                System.err.println("There was an error: " + file.toString() + " " + e);
                System.exit(1);
            }

            System.out.println("\n\n");
        }
    }

    public static void main(String[] args) {
        Main.runScannerTests();
    }

    private static class ScannerErrorListener implements ANTLRErrorListener {

        private final PrintStream printStream;

        public ScannerErrorListener(PrintStream printStream) {
            this.printStream = printStream;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
            this.printStream.println("line " + i + ":" + i1 + "  " + s);
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
}


// we need to make a function that runs the semantics tests
