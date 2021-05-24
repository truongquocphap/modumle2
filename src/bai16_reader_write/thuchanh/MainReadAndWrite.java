package bai16_reader_write.thuchanh;

import java.io.IOException;
import java.util.List;

public class MainReadAndWrite {
    public static void main(String[] args) throws IOException {
//        Scanner scanner=new Scanner(System.in);
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> number=readAndWriteFile.readFile("textWrite.txt");
           int maxValue=readAndWriteFile.findMax(number);
        System.out.println(maxValue);
            String str=String.valueOf(maxValue);
           readAndWriteFile.writeFile("result.txt",true,str);
    }
}
