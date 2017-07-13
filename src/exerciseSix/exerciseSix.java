package exerciseSix;

import java.util.Scanner;

/**
 * Created by user22 on 13.07.2017.
 */
public class exerciseSix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ширину:");
        int x = sc.nextInt();
        System.out.println("Введіть висоту:");
        int y = sc.nextInt();
        int tmp = x;
        drawRectangle(x, y, tmp);

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
