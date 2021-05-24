package bai16_reader_write.baitap;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String[]> str= ReadCountriesFile.readFile("countries.csv");
        for (String[] strings: str) {
            System.out.println(strings[2]);
        }
    }
}
