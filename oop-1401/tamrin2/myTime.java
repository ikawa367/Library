//pardis zandkarimi 39913161040

class myTime{
    int hour;
    int minute;
    int second;
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h){
        if(h <= 23 && h>=0)
        {
            hour=h;
        }
        else{
            System.out.println("ERROR! wrong hour format");
        }
    }
    
    public void setMinute(int m){
        if(m <= 59 && m>= 0){
            minute = m;
        }
        else{
            System.out.println("ERROR! wrong minute format");
        }
    }
    
    public void setSecond(int s){
        if(s<= 59 && s>=0)
        {
            second = s;
        }
        else{
            System.out.println("ERROR! wrong second format");
        }
    }
    myTime(){}

    myTime(int h){
        setHour(h);
    }

    myTime(int h, int m){
        setHour(h);
        setMinute(m);
    }

    myTime(int h, int m, int s){
        setTime(h, m, s);
    }
    public void showUniversalTime()
    {
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(second);
    }
    public void showTime()
    {
        if(hour < 12 )
        {
            showUniversalTime();
            System.out.print(" ");
            System.out.println("am");
        }
        else{
            System.out.print(hour-12);
            System.out.print(":");
            System.out.print(minute);
            System.out.print(":");
            System.out.print(second);
            System.out.print(" ");
            System.out.println("pm");
        }
    }
    public static void main(String[] args)
    {
        //System.out.println("hi mmd");
        myTime t = new myTime(22,22,22);
        t.setMinute(11);
        t.showTime();
        t.showUniversalTime();
        t.setHour(12);

    }

}