package common;

import module.House;
import module.Room;

import module.Services;
import module.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String PATH="/Users/truongquocphap/Documents/codegym/module-02/CaseStudyModule2/src/data_list/";
    public static void fileWriterVilla(String fileVilla, boolean trangThai, List<Villa> villaList){
        File file=null;
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            file=new File(PATH+fileVilla);
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter=new FileWriter(file,trangThai);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (Villa villa: villaList)
            bufferedWriter.write(villa.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void fileWriterHouse(String fileHouse, boolean trangThai, List<House> houseList){
        File file=null;
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            file=new File(PATH+fileHouse);
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter=new FileWriter(file,trangThai);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (House house: houseList)
                bufferedWriter.write(house.toString());
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void fileWriterRoom(String fileRomm, boolean trangThai, List<Room> roomList){
        File file=null;
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            file=new File(PATH+fileRomm);
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter=new FileWriter(file,trangThai);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (Room room: roomList)
                bufferedWriter.write(room.toString());
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Villa> readFileVilla(String fileVilla){
        File file=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        List<Villa> villas=new ArrayList<>();
        String[] strings=null;
        try {
            file = new File(PATH + fileVilla);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                Villa villa = new Villa(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8],strings[9]);
                villas.add(villa);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return villas;
    }

        public static List<House> readFileHouse(String fileHouse) {
        File file=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        List<House> houseList=new ArrayList<>();
        String[] strings=null;
        try {
            file=new File(PATH+fileHouse);
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                strings=line.split(",");
                House house=new House(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6],strings[7],strings[8]);
                houseList.add(house);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return houseList;
    }
    public static List<Room> readFileRoom(String fileRoom){
        File file=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        List<Room> villasRoom=new ArrayList<>();
        String[] strings=null;
        try {
            file=new File(PATH+fileRoom);
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                strings=line.split(",");
                Room room=new Room(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6]);
                villasRoom.add(room);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return villasRoom;
    }
}
