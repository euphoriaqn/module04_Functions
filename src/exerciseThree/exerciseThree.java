package exerciseThree;

import java.util.Scanner;

/**
 * Created by user22 on 13.07.2017.
 */
public class exerciseThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Будем рисовать прямоугольник или квадрат? 1 - прямоугольник, 2 - квадрат");
        int choice = sc.nextInt();
        while (choice !=1 && choice!=2) {
            System.out.println("Ви ввели невірне значення. Введіть значення повторно: 1 - прямоугольник, 2 - квадрат");
            choice = sc.nextInt();
        }
        switch(choice) {
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

    }

    public static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
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
    }