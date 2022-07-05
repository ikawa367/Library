import java.util.Scanner;

public class ok {
    public static double bmiCalc(float hight, float weight) {
        double hightMeter = hight / 100;
        return (weight / (hightMeter * hightMeter));
    }

    public static void bmiValues(double bmi) {
        if (bmi < 18.5) {
            System.out.print("\nUnderweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print("\nNormal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.print("\nOverweight");
        } else if (bmi >= 30) {
            System.out.print("\nObese");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float hight = sc.nextFloat();
        float weight = sc.nextFloat();
        double bmi = bmiCalc(hight, weight);
        System.out.format("%.1f", bmi);
        bmiValues(bmi);
    }
}