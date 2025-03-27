package com.testing.file_handling;

import java.io.*;

public class FileProcessor {
    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static String readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.readLine();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
