package day1;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("bır strıng ıfade giriniz");
        String str=sc.nextLine();
      sumOfDigit(str);


}

    private static void sumOfDigit(String str) {
        int toplam =0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                toplam+=Integer.valueOf(""+ str.charAt(i));
            }

        }
        System.out.println("toplam = " + toplam);
    }
}