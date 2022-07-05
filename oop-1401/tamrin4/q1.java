public class LiveObjects {
    public static int alive = 0;
    LiveObjects()
    {
        alive = alive + 1;
    }

    public static int getLiveInstances()
    {
        return alive;
    }
    public void finalize(){
        alive = alive - 1;
    }
    public static void main(String[] args)
    {
        LiveObjects myLive = new LiveObjects();
    new LiveObjects();
    new LiveObjects();
    new LiveObjects();
    new LiveObjects();
    System.out.println(LiveObjects.getLiveInstances());  //output: 5
    System.gc();
    try{
        Thread.sleep(1500);
        }catch(InterruptedException e){
        System.out.println(e);
    }
    System.out.println(LiveObjects.getLiveInstances());  //output: 1
    }
}
