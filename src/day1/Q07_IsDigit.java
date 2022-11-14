package day1;

import java.util.Scanner;

public class Q07_IsDigit { /*
 Create a method that accepts a String as parameter and finds the sum of digits in that String.
 Example:
 input : J4\/4 1$ 34$¥
 output : 16

 Hint:
 Character.isDigit()
 Integer.valueOf()
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a strıng" );
        String str=sc.nextLine();

       SumOfDisits(str);
      


    }

    private static void SumOfDisits(String str) {
        int toplam=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                toplam+=Integer.valueOf(""+str.charAt(i));
            }
            
        }
        System.out.println("toplam = " + toplam);
    }
}
