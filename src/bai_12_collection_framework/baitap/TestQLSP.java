package bai_12_collection_framework.baitap;

import java.util.Scanner;

public class TestQLSP {
    public static void main(String[] args) throws Exception {
        QLSP_ArrayList listSP=new QLSP_ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("chon menu");
        int num = -1;
        while (num != 0) {
            System.out.println("1: addSP " +
                    " 2: showSP" +
                    " 3: sua"+
                    " 4: xoa"+
                    " 5: tim kiem theo ten"+
                    " 0: thoat");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    listSP.addSP();
                    continue;
                case 2:
                    listSP.showSP();
                    continue;
                case 3:
                    listSP.repairSP();
                    continue;
                case 4:
                    listSP.erase();
                    continue;
                case 5:
                    listSP.search();
                    continue;
                case 0:
            }
        }
    }
}
