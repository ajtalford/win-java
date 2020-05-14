package com.tts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;


public class Utils {
//    private ArrayList<String> titles;
//    BookStore store1 = new BookStore();
    public static void loadStringsToArray(ArrayList<String> arrList) throws IOException {
//        Path path = Paths.get("BookTitles.txt");
        Path path = Paths.get("com/tts/BookFile.txt");
        arrList.clear();

        // The stream file will also be closed here
        try (Stream<String> lines = Files.lines(path)) {
            Object[] arr = lines.toArray();

            for(Object t: arr) {
                arrList.add(t.toString());
            }
        }
    }
}
//    NOTHING IN THIS FILE EXCEPT ABOVE









