
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Newproject6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi verin");
        int N = input.nextInt();
        int i;
        if (N < 0) {
            System.out.println("Hatali sayi girdiniz");
        } else {
            if (N == 0) {
                System.out.println("0");
            } else {
                for (i = N; i > 0; i /= 10) {
                    int basamak = i % 10;
                    System.out.print(basamak);
                }
            }
        }
    }
}
