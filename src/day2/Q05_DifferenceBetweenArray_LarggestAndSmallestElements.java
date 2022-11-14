package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LarggestAndSmallestElements {

    public static void main(String[] args) {
        /*Create a function that takes an array and the difference between the largest
        and the smallest numbers.
        Ask user to enter array elements.
        kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan bir method create ediniz.
                */
        Scanner scan=new Scanner(System.in);
        System.out.println("array uzunluk :");
        int uzunluk=scan.nextInt();
        int [] arr=new int [uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayın " +(i+1)+".elemanı:");
            arr[i]= scan.nextInt();;

        }
        Arrays.sort(arr);
        System.out.println("fark :"+(arr[uzunluk-1] - arr[0]));


    }
}
