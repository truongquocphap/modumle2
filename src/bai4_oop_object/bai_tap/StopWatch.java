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
   

}
