package day1;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayı=scan.nextInt();
        boolean flag=true;
        if (sayı>=2){
            for (int i = 2; i <sayı ; i++) {
                if (sayı%i==0){
                    flag=false;
                    break;
                }

            }
            if (flag==true) System.out.println("sayı asaldır");
            else System.out.println("sayı asal değildir");
        }else System.out.println("sayı asal degildir");
    }
}
