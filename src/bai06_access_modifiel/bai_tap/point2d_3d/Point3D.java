package bai06_access_modifiel.bai_tap.point2d_3d;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z){
        this.z=z;
    }
    public float[] getXYZ(){
        float arr[]={this.getX(),this.getY(),this.getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + this.z +
                "x and y is o subclass of "+
                super.toString()+
                '}';
    }
}
