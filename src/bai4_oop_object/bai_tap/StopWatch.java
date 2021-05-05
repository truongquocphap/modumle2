package bai4_oop_object.bai_tap;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime starTime,endTime;
    public StopWatch(){
            starTime=LocalTime.now();
    }

    public LocalTime getStarTime() {
        return starTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

   public StopWatch(LocalTime starTime,LocalTime endTime){
        this.starTime=starTime;
        this.endTime=endTime;
   }
   public void star(){
         starTime=LocalTime.now();
   }
   public void end(){
        endTime=LocalTime.now();
   }
   public int getTime(){
        int second=((endTime.getHour())-(starTime.getHour()))*3600+
                ((endTime.getMinute())-starTime.getMinute())*60+
                ((endTime.getSecond())-starTime.getSecond())*1000;
        return second;
   }
public static int[] sort(int...a){
    for (int i = 0; i < a.length-1; i++) {
        for (int j = i+1; j < a.length; j++) {
            if (a[j]<a[i]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    return a;
}
    public static void main(String[] args) {
        int arr[]=new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i]=(int)(Math.random()*1000);
        }
        LocalTime start= LocalTime.now();
        sort(arr);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch=new StopWatch(start,end);
        System.out.println("Time :"+stopWatch.getTime());
    }

}
