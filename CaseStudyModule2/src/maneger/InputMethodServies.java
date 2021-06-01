package maneger;

import common.ReadAndWrite;
import module.House;
import module.Room;
import module.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputMethodServies {
    static Scanner scanner=new Scanner(System.in);
    public static void addNewVilla(){
        String id= InputPropetiesServies.nhapIDVilla();
        String tenDichVu= InputPropetiesServies.tenDichVu();
        String dienTichSuDung= InputPropetiesServies.dienTichSuDung();
        String phiChoThue= InputPropetiesServies.costsForRent();
        String soLuongnguoi= InputPropetiesServies.amountPeople();
        String kieuThue= InputPropetiesServies.modelRent();
        String tieuChuan= InputPropetiesServies.standard();
        System.out.println("mời nhập mô tả tiện nghi của phòng.");
        String moTaTienNghi=scanner.nextLine();
        String dienTichHoBoi= InputPropetiesServies.dienTichHoBoi();
        String soTang= InputPropetiesServies.floorNumber();

        Villa villa=new Villa(id,tenDichVu,dienTichSuDung,phiChoThue,soLuongnguoi,kieuThue,tieuChuan,moTaTienNghi,dienTichHoBoi,soTang);
        List<Villa> villaList=new ArrayList<>();
        villaList.add(villa);
        ReadAndWrite.fileWriterVilla("villa.txt",true, villaList);
    }
    public static void addNewHouse(){
        String id= InputPropetiesServies.nhapIDHouse();
        String tenDichVu= InputPropetiesServies.tenDichVu();
        String dienTichSuDung= InputPropetiesServies.dienTichSuDung();
        String phiChoThue= InputPropetiesServies.costsForRent();
        String soLuongnguoi= InputPropetiesServies.amountPeople();
        String kieuThue= InputPropetiesServies.modelRent();
        String tieuChuan= InputPropetiesServies.standard();
        System.out.println("mời nhập mô tả tiện nghi của phòng.");
        String moTaTienNghi=scanner.nextLine();
        String soTang= InputPropetiesServies.floorNumber();
        House house=new House(id,tenDichVu,dienTichSuDung,phiChoThue,soLuongnguoi,kieuThue,tieuChuan,moTaTienNghi,soTang);
        List<House> houseList=new ArrayList<>();
        houseList.add(house);
        ReadAndWrite.fileWriterHouse("house.txt",true, houseList);
    }
    public static void addNewRoom(){
        String id= InputPropetiesServies.nhapIDRoom();
        String tenDichVu= InputPropetiesServies.tenDichVu();
        String dienTichSuDung= InputPropetiesServies.dienTichSuDung();
        String phiChoThue= InputPropetiesServies.costsForRent();
        String soLuongnguoi= InputPropetiesServies.amountPeople();
        String kieuThue= InputPropetiesServies.modelRent();
        String mienPhiDiKem= InputPropetiesServies.mienPhiDiKem();
        Room room=new Room(id,tenDichVu,dienTichSuDung,phiChoThue,soLuongnguoi,kieuThue,mienPhiDiKem);
        List<Room> roomList=new ArrayList<>();
        roomList.add(room);
        ReadAndWrite.fileWriterRoom("room.txt",true, roomList);
    }
}
