
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Newproject4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi verin");
        int N = input.nextInt();
        int i;
        int toplam = 1;
        if (N >= 0) {
            for (i = 1; i <= N; i++) {
                toplam *= i;
            }
            System.out.println(toplam);
        } else {
            System.out.println("negatif sayi verdiniz sistem sonlandiriliyor");
        }
    }
}
