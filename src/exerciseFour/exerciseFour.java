package exerciseFour;
import java.util.Scanner;
/**
 * Created by user22 on 13.07.2017.
 */

/*
Написать функцию getMsx которая принимает на вход два аргумента в виде чисел. А возвращает максимальное из єтих двух. Так же необходимо перегрузить єту функцию для работі с разнімі числовімі тіпами переменніх(int, float)
 */
public class exerciseFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число X:");
        int x = sc.nextInt();
        System.out.println("Введите целое число Y:");
        int y = sc.nextInt();
    }
    public static int getMax(int x, int y){
        int max;
        if (x>y)
            max = x;
        else
            max = y;
        return max;
    }
    public static double getMax(double x, double y){
        double max;
        if (x>y)
            max = x;
        else
            max = y;
        return max;
    }
}

