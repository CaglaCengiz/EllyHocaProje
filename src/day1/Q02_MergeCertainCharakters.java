package day1;

import java.util.Scanner;

public class Q02_MergeCertainCharakters {/*
 * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
 * return eden metod yaziniz
 *
 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz :");
        String str = scan.nextLine();
        System.out.println("bir sayı giriniz :");
        int sayı=scan.nextInt();
       ilkSonHarf(str,sayı);
    }

    private static String ilkSonHarf(String str, int sayı) {
        String ilkSonHarfler=str.substring(0,1)+str.substring(str.length()-1);
        System.out.println(ilkSonHarfler);
        String output="";
        for (int i = 0; i < sayı; i++) {
            output+=ilkSonHarfler;

        }
        return output;
    }
}
