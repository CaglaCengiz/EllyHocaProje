package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q01_UnigeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int arr[]= {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i] );
               
            }
        } System.out.println("list = " + list);
        int[]tekrarsızArr=new int[list.size()];
        for (int i = 0; i < tekrarsızArr.length ; i++) {
            tekrarsızArr[i]= list.get(i);
            
        }
        System.out.println(Arrays.toString(tekrarsızArr));
        //2 yol
        HashSet<Integer>lıste=new HashSet<Integer>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10));
        System.out.println("lıste = " + lıste);
    }
    
    
}
