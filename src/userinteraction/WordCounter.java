package userinteraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // java WordCounter {"vancouver.txt", ...}
        //                       args[0]
        if (args.length != 1) {
            System.out.println("Invalid number of arguments...");
        } else {
            int wordCounter = 0;
            // 1. read the file (Scanner)
            //    - line by line
            //    - word by word
            try {
                String  filename = args[0];
                File    file     = new File(filename);
                Scanner in       = new Scanner(file);
                // 2. count each word
                while (in.hasNextLine()) {
                    String      line = in.nextLine();
                    String[]    words = line.split(" ");
                    wordCounter += words.length;
                }
                System.out.println("The " + filename + " file contains " + wordCounter + " words.");
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }
    }
}
