package bai_tap_tu_hoc;

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Mời bạn nhập mật khẩu: ");
        String password = scanner.nextLine();
        while (!password.equals("vung oi mo ra")) {
            System.out.println("Không đúng! Mời bạn nhập lại mật khẩu: ");
            password = scanner.nextLine();
        }
    }
}
