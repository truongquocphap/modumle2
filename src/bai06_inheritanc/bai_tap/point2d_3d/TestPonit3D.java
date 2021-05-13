package bai06_inheritanc.bai_tap.point2d_3d;

public class TestPonit3D {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        System.out.println(point3D);

        point3D=new Point3D(10.4f,23.1f,5.4f);
        System.out.println(point3D);



        point3D.setXYZ(3.4f,4.5f,6.7f);
        float arr[]=point3D.getXYZ();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        System.out.println(point3D.getXYZ());
        Point2D point2D=new Point2D();
        System.out.println(point2D);

        point2D=new Point2D(6.5f,10.5f);
        System.out.println(point2D);
    }
}
