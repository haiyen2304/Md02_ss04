package BTVN_module02_session04;

public class Ex03 {
    private long startTime;
    private long endTime;

    public Ex03(){
        startTime = System.currentTimeMillis();
    }
    public Ex03(long startTime, long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void getStartTime(){
        startTime = System.currentTimeMillis();
    }
    public void getEndTime(){
        endTime = System.currentTimeMillis();
    }
    public long getTime(){
        System.out.println("startTime = "+ startTime);
        System.out.println("endTime = "+ endTime);
        return endTime - startTime;
    }
}
