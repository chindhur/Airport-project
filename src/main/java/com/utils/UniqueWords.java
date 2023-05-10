package com.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWords {
    public Set<String> findUniqueWords(String inputFile) throws IOException {

        //open the file with stream and get all lines
        try (Stream<String> lines = Files.lines(Path.of(inputFile))) {
            //filter each line into words ,splitting by space
            Set<String> words = lines
                    .flatMap(line -> Stream.of(line.split("\\W+")))
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());
            Printer.debug("The unique words count is :" + words.size());
            return words;
        }
    }
}


