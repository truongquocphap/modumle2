package maneger;

import common.ReadAndWrite;
import module.House;
import module.Room;
import module.Villa;
import TreeSet.TreeSetHouse;
import TreeSet.TreeSetRoom;
import TreeSet.TreeSetVilla;

import java.util.*;

public class ShowServices {
    public static void showVilla(){
        List<Villa> villaList= ReadAndWrite.readFileVilla("villa.txt");
        for (Villa villa: villaList){
            villa.showInfo();
        }
    }
    public static void showHouse(){
        List<House> houseList=ReadAndWrite.readFileHouse("house.txt");
        for (House house: houseList){
            house.showInfo();
        }
    }
    public static void showRoom(){
        List<Room> roomList=ReadAndWrite.readFileRoom("room.txt");

        for (Room room: roomList){
            room.showInfo();
        }
    }
    public static void showNameHouse(){
        List<House> houseList=ReadAndWrite.readFileHouse("house.txt");
        for (int i = 0; i < houseList.size(); i++) {
            System.out.println("House name:  "+(i+1)+". "+houseList.get(i).getTenDichVu());
        }
    }
    public static void showNameVilla(){
        List<Villa> villaList=ReadAndWrite.readFileVilla("villa.txt");
        for (int i = 0; i < villaList.size(); i++) {
            System.out.println("Villa name:  "+(i+1)+". "+villaList.get(i).getTenDichVu());
        }
    }
    public static void showNameRoom(){
        List<Room> roomList=ReadAndWrite.readFileRoom("room.txt");
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println("Room name:  "+(i+1)+". "+roomList.get(i).getTenDichVu());
        }
    }
    public static void showVillaTreeSet(){
        List<Villa> villaList= ReadAndWrite.readFileVilla("villa.txt");
        Set<Villa> villaSet=new TreeSet<>(new TreeSetVilla());
        for (Villa villa: villaList){
            villaSet.add(villa);
        }
        System.out.println(villaSet);
    }
    public static void showHouseTreeSet(){
        List<House> houseList= ReadAndWrite.readFileHouse("house.txt");
        Set<House> houseSet=new TreeSet<>(new TreeSetHouse());
        for (House house: houseList){
            houseSet.add(house);
        }
        System.out.println(houseSet);
    }
    public static void showRoomTreeSet(){
        List<Room> roomList= ReadAndWrite.readFileRoom("room.txt");
        Set<Room> roomSet=new TreeSet<>(new TreeSetRoom());
        for (Room room: roomList){
            roomSet.add(room);
        }
        System.out.println(roomSet);
    }
}
