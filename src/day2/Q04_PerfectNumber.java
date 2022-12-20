package day2;

import java.util.Scanner;

public class Q04_PerfectNumber {/* Perfect Number (Mukemmel sayi)
  Kullanici tarafindan bir sayiya kadar olan sayilarin,
  mukemmel olup olmadigini bulan method yaziniz.
  Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
  kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
  ORNEK: (6, 28, 496, 8128)
  INPUT      : 6
  OUTPUT     :  1,2,3
*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=scan.nextInt();
        perfectNumber(sayı);
        girilenSayıyaKadarOlanPerfect(sayı);
    }

    private static void girilenSayıyaKadarOlanPerfect(int sayı) {
        int toplam=0;

        for (int i = 1; i < sayı; i++) {//girilen sayıya  kadar bakar
            for (int j = 1; j < i; j++) {//burada bolenleri kontrol edilir
                if (i%j==0){//sayının herhangi bir boleni varsa
                    toplam+=j;//bolenleri toplama ekle
                }
            }
            if (toplam==i){
                System.out.println(i+ "mukemmel sayıdır");
            }
           toplam=0;
        }
    }
    private static void perfectNumber(int sayı) {
        int toplam=0;
        for (int i = 1; i < sayı; i++) {//bırden baslayarak bolunenleri kontrol edeceğiz,sayı dahil olmamalı
            if (sayı%i==0){//sayının herhangi bir boleni varsa
                toplam+=i;//toplam değişkenine ekle
                System.out.println(i +" ");//bolenleri görmek için
            }

        }
        System.out.println();
        if (toplam==sayı){//bolenlerin toplamı sayıya esitse
            System.out.println(sayı + "sayısı mukemmel sayıdır");

        }else {
            System.out.println(sayı + "sayısı mukemmel sayı değildir");
        }

//baska yol
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        int topla=0;
        sayi=0;
        int j=1;
        while (j<=sayi/2) {
            if (sayi % j == 0) {
                topla += j;
            }
            j++;
        }
        if ((sayi==topla)){
            System.out.println("muk");
        }else System.out.println("degıl");


    }
    }

