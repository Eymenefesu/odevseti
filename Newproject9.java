
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Newproject9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int toplam = 0;
        int pozitif = 0;
        int negatif = 0;
        int sifir = 0;
        for (i = 1; i <= 10; i++) {

            System.out.println("bir sayi verin");
            int N = input.nextInt();
            toplam += N;
            if (N > 0) {
                pozitif++;
            } else {
                if (N < 0) {
                    negatif++;
                } else {
                    if (N == 0) {
                        sifir++;
                    }
                }
            }
        }
        System.out.println("sayilarin aritmetik ortalamasi " + (toplam / 10));
        System.out.println("sayilarin toplami " + toplam);
        System.out.println("pozitif sayilarin sayisi " + pozitif);
        System.out.println("negatif sayilarin sayisi " + negatif);
        System.out.println("sifir olan sayilarin sayisi " + sifir);
    }
}
