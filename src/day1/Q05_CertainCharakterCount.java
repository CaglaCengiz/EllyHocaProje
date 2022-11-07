package day1;

import java.util.Scanner;

public class Q05_CertainCharakterCount {/*
 * Kullanicidan bir cumle ve bir harf alin,
 * Cumlede harfin kac kere
 * kullanildigini bulup, yazdirin
 * ORNEK:
 * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
 *
 * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scanner.nextLine();
        System.out.println("harf giriniz");
        char harf=scanner.next().charAt(0);
        int count=0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==harf){
                count++;

            }

        }
        System.out.println("girdiğiniz cumlede "+ harf +"harfi" +count+ "kere kullanılmış");
    }
}
