//import java.util.Scanner;

//pardis zandkarimi 39913161040
class myDate{
    int year;
    int month;
    int day;

    public void setYear(int y)
    {
        year = y;
    }
    public void setMonth(int m){
        if(m <= 12)
        {
            month = m;
        }
    }
    public void setDay(int d){
        if(d <= 31)
        {
            day = d;
        }
    }
    public void setDate(int y, int m, int d )
    {
        year = y;
        month = m;
        day = d;
    }
    myDate(){}
    myDate(int y){
        setYear(y);
    }
    myDate(int y, int m, int d)
    {
        // year=y;
        // month=m;
        // day=d;

        // setDay(d);
        // setMonth(m);
        // setYear(y);

        setDate(y, m, d);
    }
    public void showDate()
    {
        char slash = '/';
        System.out.print(day);
        System.out.print(slash);
        System.out.print(month);
        System.out.print(slash);
        System.out.print(year);
    }
    public static void main(String[] args){
        //3rd constructor:
        myDate d = new myDate (2012,3,7);
        d.showDate();

        //2nd constructor:
        myDate l = new myDate (2000);
        l.setDay(23);
        l.setMonth(12);
        l.showDate();

        //1st constructor:
        myDate a = new myDate();
        a.setDate(1993, 01, 8);
        a.showDate();
    }
}