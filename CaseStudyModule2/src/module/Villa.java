package module;

import common.ReadAndWrite;

import java.util.List;

public class Villa extends Services {
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private String dienTichHoBoi;
    private String soTang;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, String moTaTienNghiKhac, String dienTichHoBoi, String soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String id,String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, String dienTichHoBoi, String soTang) {
        super(id,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + tieuChuanPhong +
                "," + moTaTienNghiKhac +
                "," + dienTichHoBoi +
                "," + soTang;
    }

    @Override
    public void showInfo() {
            System.out.println("Villa{" +
                    "id = '"+ getId()+'\''+
                    "tenDichVu='" + getTenDichVu() + '\'' +
                    ", dienTichSuDung='" + getDienTichSuDung() + '\'' +
                    ", chiPhiThue='" + getChiPhiThue() + '\'' +
                    ", soLuongNguoiToiDa='" + getSoLuongNguoiToiDa() + '\'' +
                    ", kieuThue='" + getKieuThue() + '\'' +
                    "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                    ", moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                    ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                    ", soTang='" + soTang + '\'' +
                    '}');
    }

    @Override
    public String showIndex() {
        return "Villa{" +
                "id = '"+ getId()+'\''+
                "tenDichVu='" + getTenDichVu() + '\'' +
                ", dienTichSuDung='" + getDienTichSuDung() + '\'' +
                ", chiPhiThue='" + getChiPhiThue() + '\'' +
                ", soLuongNguoiToiDa='" + getSoLuongNguoiToiDa() + '\'' +
                ", kieuThue='" + getKieuThue() + '\'' +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                ", soTang='" + soTang + '\'' +
                '}';
    }
}
