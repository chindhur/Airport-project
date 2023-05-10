package com.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWordsUtil {

        public void findUniqueWords() throws IOException {

            //open the file with stream and get all lines
            try (Stream<String> lines = Files.lines(
                    Path.of("C:\\Documents\\solvd\\intellij\\Airport-project\\src\\main\\resources\\filereader.txt.txt")))
            {
                //filter each line into words ,splitting by space
                Set<String> words = lines
                        .flatMap(line -> Stream.of(line.split("\\W+")))
                        .map(String::toLowerCase)
                        .collect(Collectors.toSet());
                Printer.print("The unique words count is :"+words.size());

                FileWriter fileWriter = new FileWriter
                        ("C:\\Documents\\solvd\\intellij\\Airport-project\\src\\main\\resources\\uniqwords.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.print(words);
                printWriter.close();
            }
        }
    }

