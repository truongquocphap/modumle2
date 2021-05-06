package bai4_oop_object.bai_tap;

public class MayQuat {
    private static final int CHAM = 1;
    private static final int TRUNG_BINH = 2;
    private static final int NHANH = 3;
    private int tocDo = 1;
    private boolean trangThai = false;
    private double banKinh = 5;
    private String mauQuat = "blue";
    public MayQuat() {

    }
    public MayQuat(int tocDo, boolean trangThai, double banKinh, String mauQuat) {
        this.tocDo = tocDo;
        this.trangThai = trangThai;
        this.banKinh = banKinh;
        this.mauQuat = mauQuat;
    }
    public static int getCham() {
        return CHAM;
    }

    public static int getTrungBinh() {
        return TRUNG_BINH;
    }

    public static int getNhanh() {
        return NHANH;
    }

    public int getTocDo() {
        return tocDo;
    }

    public void setTocDo(int tocDo) {
        this.tocDo = tocDo;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauQuat() {
        return mauQuat;
    }

    public void setMauQuat(String mauQuat) {
        this.mauQuat = mauQuat;
    }

    public void trangThaiBat() {
        trangThai = true;
    }

    public void trangThaiTat() {
        trangThai = false;
    }

    @Override
    public String toString() {
        if (this.trangThai==true){
            return "MayQuat{" +
                    "tocDo=" + tocDo +
                    ", hoatDong=" + trangThai +
                    ", banKinh=" + banKinh +
                    ", mauQuat='" + mauQuat + '\'' +
                    '}';
        }

        return "Máy Quạt{"+
                ", mauQuat: "+mauQuat+
                ", banKinh: "+banKinh+
                ", máy quạt đang tắt }\n";
    }

    public static void main(String[] args) {
        MayQuat mayQuat1=new MayQuat();
        mayQuat1.trangThaiBat();
        System.out.println(mayQuat1.toString());
        MayQuat mayQuat2=new MayQuat();
        mayQuat2.trangThaiTat();
        System.out.println(mayQuat2.toString());
        System.out.println("------thay doi gia tri--------");
        MayQuat mayQuat3=new MayQuat();
        mayQuat3.setTocDo(3);
        mayQuat3.setBanKinh(10);
        mayQuat3.setMauQuat("yellow");
        mayQuat3.setTrangThai(true);
        mayQuat3.getTocDo();
        mayQuat3.getMauQuat();
        mayQuat3.getBanKinh();
        System.out.println(mayQuat3.toString());
        System.out.println("------thay doi gia tri--------");
        MayQuat mayQuat4=new MayQuat();
        mayQuat4.setTocDo(2);
        mayQuat4.setBanKinh(5);
        mayQuat4.setMauQuat("blue");
        mayQuat4.getTocDo();
        mayQuat4.getBanKinh();
        mayQuat4.getMauQuat();
        System.out.println(mayQuat4.toString());
    }
}
