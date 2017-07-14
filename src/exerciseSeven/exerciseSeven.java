package exerciseSeven;

import java.util.Scanner;

/**
 * Created by user22 on 14.07.2017.
 */
public class exerciseSeven {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {

            while (true) {
                try {

                    while (true) {
                        System.out.println("\nЯку задачу ви бажаєте вирішити:\n 1 - задача №1\n 2 - задача №2\n 3 - задача №3\n 4 - задача №4\n 5 - задача №5\n 6 - задача №6\n 7 - завершити програму");
                        choice = sc.nextInt();
                        if (choice >= 1 && choice <= 7) {
                            break;
                        }

                    }
                    break;

                } catch (Exception e) {
                    System.out.println("Ви ввели невірне значення.");
                    sc.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Виконується задача №1....");
                    System.out.println("Введите число X:");
                    int x = sc.nextInt();
                    Numbers(x);
                    break;
                case 2:
                    System.out.println("Виконується задача №2....");
                    System.out.println("Введіть ширину:");
                    int a = sc.nextInt();
                    System.out.println("Введіть висоту:");
                    int b = sc.nextInt();
                    drawRectangle(a, b);
                    break;
                case 3:
                    System.out.println("Виконується задача №3....");
                    System.out.println("Будем рисовать прямоугольник или квадрат? 1 - прямоугольник, 2 - квадрат");
                    int choiceX = sc.nextInt();
                    while (choiceX !=1 && choiceX!=2) {
                        System.out.println("Ви ввели невірне значення. Введіть значення повторно: 1 - прямоугольник, 2 - квадрат");
                        choiceX = sc.nextInt();
                    }
                    switch(choiceX) {
                        case 1:
                            System.out.println("Введіть ширину:");
                            int width = sc.nextInt();
                            System.out.println("Введіть висоту:");
                            int height = sc.nextInt();
                            drawRectangle(width, height);
                            break;
                        case 2:
                            System.out.println("Введіть ширину:");
                            int width2 = sc.nextInt();
                            drawRectangle(width2);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Виконується задача №4....");
                    System.out.println("Які числа ви будете вводити? Цілі чи дробні?   1 - цілі, 2 - дробні");
                    int choice4 = sc.nextInt();
                    switch(choice4) {
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
                    break;
                case 5:
                    System.out.println("Виконується задача №5....");
                    System.out.println("Введите число X:");
                    int x5 = sc.nextInt();
                    Numbers2(x5);
                    break;
                case 6:
                    System.out.println("Виконується задача №6....");
                    System.out.println("Введіть ширину:");
                    int x6 = sc.nextInt();
                    System.out.println("Введіть висоту:");
                    int y = sc.nextInt();
                    int tmp = x6;
                    drawRectangle(x6, y, tmp);
                    break;
                case 7:
                    return;
            }
        }

    }

    public static void Numbers(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
    }
    public static void drawRectangle(int width, int height){
        for (int i =0; i<height; i++){
            for (int j =0; j<width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
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
    public static int Numbers2(int x){
        int result;
        if (x==1) {
            System.out.print(x + " ");
            return 1;
        }
        result = Numbers2(x-1)*x;
        System.out.print(x + " ");
        return result;
    }
    public static void drawRectangle(int width, int height, int tmp){

        if (height == 1) {
            if (width == 1) {
                System.out.print("+");
                return;
            }
            else {
                System.out.print("+");
                drawRectangle(width - 1, height, tmp);
                return;
            }

        }
        if (width == 1) {
            System.out.print("+");
            System.out.println();
            width = tmp;
            drawRectangle(width, height -1, tmp);
            return;
        }
        else {
            System.out.print("+");
            drawRectangle(width - 1, height, tmp);
            return;
        }
    }
}