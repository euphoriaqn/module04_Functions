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
        System.out.println("Які числа ви будете вводити? Цілі чи дробні?   1 - цілі, 2 - дробні");
        int choice = sc.nextInt();
        switch(choice) {
            // Логіка коли користувач вибрав цілі числа
            case 1:
                int intX;
                int intY;
                while (true) {
                    try {
                        System.out.println("Введите целое число X:");
                        intX = sc.nextInt();
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        sc.nextLine();
                    }
                }
                while (true) {
                    try {
                        System.out.println("Введите целое число Y:");
                        intY = sc.nextInt();
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        sc.nextLine();
                    }
                }
                int maxInt = getMax(intX, intY);
                System.out.println("Максимальне значення серед цілих чисел " + intX + " та " + intY + " буде " + maxInt );
                break;
            // Логіка коли користувач вибрав дробні числа
            case 2:
                double doubleX;
                double doubleY;
                while (true) {
                    try {
                        System.out.println("Введите дробное число X:");
                        doubleX = sc.nextDouble();
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        sc.nextLine();
                    }
                }
                while (true) {
                    try {
                        System.out.println("Введите дробное число Y:");
                        doubleY = sc.nextDouble();
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        sc.nextLine();
                    }
                }
                double maxDouble = getMax(doubleX, doubleY);
                System.out.println("Максимальне значення серед цілих чисел " + doubleX + " та " + doubleY + " буде " + maxDouble );
                break;
        }
    }
    //Функція визначення максимального числа серед цілих чисел
    public static int getMax(int x, int y){
        int max;
        if (x>y)
            max = x;
        else
            max = y;
        return max;
    }
    //Функція вихначення максимального числа серед дробних чисел
    public static double getMax(double x, double y){
        double max;
        if (x>y)
            max = x;
        else
            max = y;
        return max;
    }
}

