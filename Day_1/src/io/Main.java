package io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static List<String> readFileInList(String fileName) {
        List<String> lines = List.of();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) {
        List<String> lines = readFileInList("input");

        Iterator<String> itr = lines.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        int total = 0;
        for (String line : lines) {
                    for (int i = 0; i < line.length(); i++) {
                        char firstChar = line.charAt(0);
                        
                        char lastChar = line.charAt(line.length() - 1);

                        if (Character.isDigit(firstChar) && Character.isDigit(lastChar)) {
                            total += Integer.parseInt("" + firstChar + lastChar);
                        }


            }
        }
        System.out.println("Total Value: " + total);
    }
}
