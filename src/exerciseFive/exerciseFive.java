package exerciseFive;

import java.util.Scanner;

/**
 * Created by user22 on 13.07.2017.
 */
public class exerciseFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число X:");
        int x = sc.nextInt();
        Numbers(x);
    }
    public static int Numbers(int x){
        int result;
        if (x==1) {
            System.out.print(x + " ");
            return 1;
        }
        result = Numbers(x-1)*x;
        System.out.print(x + " ");
        return result;
    }
}
