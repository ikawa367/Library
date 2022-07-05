public class SUM {
    public static int sum (int...number)
    {
        int result = 0;
        int[] array = number;
        for(int i=0; i<number.length; i++)
        {
            result += array[i];
        }
        return result;
    }
    public static int sum(String...params)
    {
        int result = 0;
        String[] array = params;
        for(int i =0 ; i<params.length; i++)
        {
            int temp = Integer.parseInt(array[i]);
            result += temp;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(SUM.sum(1, 2));
        System.out.println(SUM.sum(1, 2, new Integer(3)));
        System.out.println(SUM.sum(1, 2, Integer.valueOf(3)));
        System.out.println(SUM.sum("1", "2"));
        //outputs: 3  6   6  3
    }
}
