package exerciseOne;
import java.util.Scanner;
/**
 * Created by user22 on 12.07.2017.
 */
public class exerciseOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число X:");
        int x = sc.nextInt();
        Numbers(x);
    }
    public static void Numbers(int x){
        for (int i =1; i<=x; i++){
            System.out.print(i + " ");
        }
    }
}
