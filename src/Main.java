import grammar.scanner.JavaScanner;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


/**
 * Created by devinmorgan on 12/24/16.
 */



class Main {

//    private static void runFile(String filePath) {
//        // get the fileExtension
//        String fileExtension = "none";
//        int i = filePath.lastIndexOf('.');
//        if (i > 0) {
//            fileExtension = filePath.substring(i+1);
//        }
//
//        // run the test in the file
//        if (fileExtension.equals("dcf")) {
//            try {
//                System.out.println("\n\n" + filePath);
//                CharStream stream = new ANTLRFileStream(filePath);
//                Scanner lexer = new Scanner(stream);
//                TokenStream tokens = new CommonTokenStream(lexer);
//                DecafParser parser = new DecafParser(tokens);
//                ParseTree tree = parser.program();
//                ParseTreeWalker walker = new ParseTreeWalker();
//                DecafListener listener = new DecafListener();
//                walker.walk(listener, tree);
////            Trees.inspect(tree, parser);
//            }
//            catch (IOException e) {
//                System.out.println("There was an error:\n" + e);
//            }
//        }
//    }

    private static void runScannerTests() {
        /*
            Get each of the input files from tests/scanner/input
            for file in directory:
                run the file on the Antlr Scanner
                collect the output from the Antlr Scanner
                print the output
        */

        // get all the tests for the scanner
        String scannerTestsDirectory = "tests/scanner/input";

        // run each scanner test
        File[] files = new File(scannerTestsDirectory).listFiles();
        for (File file : files) {

            try {
                CharStream stream = new ANTLRFileStream(file.getPath());
                JavaScanner scanner = new JavaScanner(stream);
                PrintStream outputStream = System.out;

                // iterate over every token from the stream
                for (Token token = scanner.nextToken(); token.getType() != JavaScanner.EOF; token = scanner.nextToken()) {
                    String type = "";
                    String text = token.getText();

                    // collect relevant data about the token in a human readable format
                    switch (token.getType()) {
                        case JavaScanner.INT:
                            type = " INTLITERAL";
                            break;
                        case JavaScanner.STRING:
                            type = " STRINGLITERAL";
                            break;
                        case JavaScanner.BOOL:
                            type = " BOOLEANLITERAL";
                            break;
                        case JavaScanner.ID:
                            type = " IDENTIFIER";
                            break;
                    }

                    // aggregate this data in the outputStream to help debugging
                    outputStream.println(token.getLine()  + type + " " + text);
                }
            }
            catch (IOException e) {
                System.out.println("There was an error:\n" + e);
                // print the error:
                System.err.println(file.toString() + " " + e);
                //scanner.skip(); // replaces
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        Main.runScannerTests();
    }
}


// we need to make a function that runs the semantics tests
