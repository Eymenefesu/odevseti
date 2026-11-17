
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Newproject2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi verin");
        int N = input.nextInt();
        int i;
        int toplam = 0;
        int toplam2 = 0;
        for (i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                toplam += i;
            } else {
                toplam2 += i;
            }
        }
        System.out.println("tek sayilerin toplami" + toplam2);
        System.out.println("cift sayilarin toplami" + toplam);
    }
}
