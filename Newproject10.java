
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Newproject10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag == true) {
            System.out.println("bir sayi verin");
            int N = input.nextInt();
            System.out.println("sayinizin karesi " + (N * N) + " sayinizin kupu " + (N * N * N));
            if (N % 2 == 0) {
                System.out.println("sayi cift");
            } else {
                System.out.println("sayi tek");
            }
            if (N > 0) {
                System.out.println("sayi pozitif");
            } else {
                if (N < 0) {
                    System.out.println("sayi negatif");
                } else {
                    System.out.println("sayi notr");
                }
            }
            System.out.println("porgramdan cikmak ister misiniz (eger isterseniz 1 yazin istemezseniz geri kalan her seyi yazabilirsiniz)");
            int istek = input.nextInt();
            if (istek==1) {
                System.out.println("program sonlaniyor");
                flag = false;
            } else {
                System.out.println("pekala devam ediliyor");
            }
        }
    }
}
