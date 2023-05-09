package com.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWords {

        public void findUniqueWords() throws IOException {

            //open the file with stream and get all lines
            try (Stream<String> lines = Files.lines(
                    Path.of("C:\\Documents\\solvd\\intellij\\filereader.txt.txt")))
            {
                //filter each line into words ,splitting by space
                Stream<String> words = lines
                        .flatMap(line -> Stream.of(line.split("\\W+")));

                Set<String> wordSet = words.collect(Collectors.toSet());
                FileWriter fileWriter = new FileWriter("C:\\Documents\\solvd\\intellij\\uniqwords.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.print(wordSet);
                printWriter.close();
            }
        }
    }

