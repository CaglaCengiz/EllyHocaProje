package day1;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        String pin = "sumeyra12345";
        int girişHakkı = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** Hoşgeldiniz ****");
        while (true) {
            System.out.println("pin kodu giriniz");
            String girilenPin = scanner.nextLine();
            if (pin.equals(girilenPin)){
                System.out.println("basarili giriş yaptınız..:");
                break;
            }else {
                System.out.println("yanliş giriş yaptınız");
                girişHakkı--;
                System.out.println("kalan giriş hakkınız" + girişHakkı);
            }if (girişHakkı==0){
                System.out.println("giriş hakkınız kalmadı sim kartınız bloke oldu ");
                break;
            }
        }
    }
}