package bai_tap_tu_hoc;

class Couser {

        int count = 0;
        /*se lay bo nho (memory) khi bien instance duoc tao*/

        /*Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong*/
        Couser() {
            count++;
            System.out.println(count);
        }

        public static void main(String args[]) {
            Couser c1 = new Couser();
            Couser c2 = new Couser();
            Couser c3 = new Couser();
        }

}
