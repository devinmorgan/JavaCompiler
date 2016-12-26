/**
 * Created by devinmorgan on 12/24/16.
 */

import org.antlr.v4.gui.SystemFontMetrics;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.gui.Trees;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


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
//                DecafScanner lexer = new DecafScanner(stream);
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


    public static void main(String[] args) {

    }
}