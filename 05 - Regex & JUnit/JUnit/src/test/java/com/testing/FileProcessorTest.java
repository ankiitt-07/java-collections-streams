package com.testing;

import com.testing.file_handling.FileProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FileProcessorTest {
    private String fileName = "D:\\Dev\\Capgemini\\04 - Java Collections & Streams\\05 - Regex & JUnit\\JUnit\\src\\main\\java\\com\\testing\\file_handling\\content\\info.txt";

    @Test
    public void testReadWrite() {
        String content = "hello there! how are you?";
        FileProcessor.writeToFile(fileName, content);

        Assertions.assertEquals(content, FileProcessor.readFromFile(fileName));
    }

    @Test
    public void testThrow(){
        Assertions.assertThrows(RuntimeException.class, () -> FileProcessor.readFromFile(""));
    }
}
