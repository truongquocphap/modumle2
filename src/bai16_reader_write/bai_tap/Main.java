package bai16_reader_write.bai_tap;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String[]> str= ReadCountriesFile.readFile("countries.csv");
        for (String[] strings: str) {
            System.out.println(strings[2]);
        }
    }
}
