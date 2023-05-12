package com.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

interface IFindItem<T> {
    // a method that calculates the number of occurrences
    // of a given element in an array of numbers
    int search(T item, List<T> items);
}

public class UniqueWords {
    IFindItem<String> ref = (item, items) -> {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (item.equalsIgnoreCase(items.get(i)))
                count++;
        }
        return count;
    };

    public int getWordCount(String inputFile, String wordToCount) throws IOException {
        //open the file with stream and get all lines
        try (Stream<String> lines = Files.lines(Path.of(inputFile))) {
            //filter each line into words ,splitting by space
            List<String> words = lines
                    .flatMap(line -> Stream.of(line.split("\\W+")))
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());
            Printer.debug("The words count is :" + words.size());
            int count = ref.search(wordToCount, words);
            return count;
        }
    }

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


