
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Newproject5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi verin");
        int N = input.nextInt();
        int i;
        int basamaksayisi = 0;
        if (N < 0) {
            System.out.println("hatali sayi girdiniz");
        } else {
            if (N == 0) {
                basamaksayisi = 1;
            } else {
                for (i = N; i > 0; i /= 10) {
                    basamaksayisi++;
                }
                System.out.println("girdiginiz sayinin basamak sayisi " + basamaksayisi);
            }
        }
    }
}
