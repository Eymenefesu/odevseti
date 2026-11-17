
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Newproject7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi verin");
        int N = input.nextInt();
        int i;
        if (N <= 1) {
            System.out.println("asal olamayan bir sayi girdiniz");
        } else {
            boolean asalmi = true;
            for (i = 2; i <= N / 2; i++) {
                if (N % i == 0) {
                    asalmi = false;
                    break;
                }
            }
            if (asalmi) {
                System.out.println(N + " asal bir sayidir");
            } else {
                System.out.println(N + " asal bir sayi degildir");
            }
        }
    }
}
