package com.file_handler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
   public static void readFile(String fileName) {
       try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }

       } catch (IOException e) {
           System.out.println("File not found");
       }
   }
}
