package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibanacciListNumber {
    /*kullanıcıdan aalınan bir tamsayıya kadar fibonacci dizisi olusturun
    0-1-1-2-3-5-8-13-21-34...
     */
    public static void main(String[] args) {
        List<Integer>fibonacci=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);
        int i=1;
        if (sayı<=1){
            System.out.println("daha buyuk sayı giriniz");

        }else {
            while (fibonacci.get(i)<sayı){//fibonacci elemanları sayıdan kucuk olduğu surece
                fibonacci.add(fibonacci.get(i)+ fibonacci.get(i-1));//bir onceki eleman ile topla
                i++;

            }
        }
        if (fibonacci.get(fibonacci.size()-1)>sayı){//fibonaccideki son eleman sayıdan buyukse
            fibonacci.remove(fibonacci.get(fibonacci.size()-1));//bu elemanı kadır
            System.out.println("girdiğiniz sayı fibonacci dizisinde bulunmamaktadır" +
                    "\n girilen sayıya kadar olan fibonacci dizisi :" +fibonacci);
        }else {
            System.out.println("girdiğiniz sayı fibonacci dizisinde bulunmamaktadır");
        }
//2.yol
        System.out.println("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        int t1=0;
        int t2=1;
        for (int j = 0; j <sayi ; j++) {
            System.out.print(t1 +"+");
            int toplam=t1+t2;
            t1=t2;
            t2=toplam;

        }

    }

}

