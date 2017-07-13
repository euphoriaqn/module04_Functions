package exersiceTwo;
import java.util.Scanner;
/**
 * Created by user22 on 12.07.2017.
 */
public class exerciseTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ширину:");
        int x = sc.nextInt();
        System.out.println("Введіть висоту:");
        int y = sc.nextInt();
        drawRectangle(x, y);
    }
    public static void drawRectangle(int width, int height){
        for (int i =0; i<height; i++){
            for (int j =0; j<width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
