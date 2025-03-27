package com.advanced.date_formatter;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public String formatDate(String inputDate){
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate inputLocalDate = LocalDate.parse(inputDate, inputFormatter);

        return inputLocalDate.format(outputFormatter);
    }
}
