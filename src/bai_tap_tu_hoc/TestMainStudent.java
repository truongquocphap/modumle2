package bai_tap_tu_hoc;

import bai_12_collection_framework.baitap.Managerstudent;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class TestMainStudent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      ManagerStudent student=new ManagerStudent();
        int choose;
        do {
            showMenu();
            choose=scanner.nextInt();
            switch (choose){
                case 1:
                   student.input();
                    break;
                case 2:
                   student.edit();
                   break;
                case 3:
                   student.delete();
                   break;
                case 4:
                    student.sortGpa();
                    break;
                case 5:
                    student.sortName();
                   break;
                case 6:
                   student.display();
                    break;
                case 7:
//                    ghi du lieu
                  student.outputStream();
                  break;
                case 8:
                    student.inputStream();
                    break;
            }
        }while (choose!=9);

    }
    static void showMenu(){
        System.out.println("1. add student \n" +
                "2. edit student by ID \n" +
                "3. Delete student by ID \n" +
                "4. sort student by GPA \n" +
                "5. sort student by name \n" +
                "6. show student \n" +
                "7. save \n" +
                "8. read \n" +
                "9.exit \n" +
                "choose");
    }
}
