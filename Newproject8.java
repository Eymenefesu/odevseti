
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Newproject8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gizlisayi = 35;
        int tahmin = 0;
        int denemesayisi = 0;
        while (tahmin != gizlisayi) {
            denemesayisi++;
            System.out.println("bir sayi tahmini girin");
            tahmin = input.nextInt();
            if (tahmin < gizlisayi) {
                System.out.println("yukari cik");
            } else {
                if (tahmin > gizlisayi) {
                    System.out.println("asagi in");
                } else {
                    if (denemesayisi > 100) {
                        System.out.println("100 hamle hakkinizi astiniz");
                        break;
                    } else {
                        if (tahmin == gizlisayi) {
                            System.out.println("bildiniz");
                        }
                    }
                }
            }
        }
    }
}
