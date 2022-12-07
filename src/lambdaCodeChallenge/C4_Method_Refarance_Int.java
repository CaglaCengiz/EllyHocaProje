package lambdaCodeChallenge;

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,0,2,5,6,7,15,6,8);
        System.out.println(negatifKreToplam(intL));
        System.out.println(tekAraToplam(intL));
        System.out.println(ciftToplam(intL));
        System.out.println(pozKupMax(intL));

    }



    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
    private static Stream<Integer> tekAraToplam(List<Integer> intL){
        return intL.stream().filter(Methods::tekMi);
    }




    // S2: ciftlerin carpimini bulalim
    private static Stream<Integer> ciftToplam(List<Integer> intL) {
      return   intL.stream().filter(Methods::ciftMi).map(t -> t * t);
    }


    // S3: negatiflerin kare toplamlarini  bulalim
    private static Optional<Integer> negatifKreToplam(List<Integer> intL) {
        return intL.stream().filter(Methods::negatifMi).map(Methods::kareBul).reduce(Methods::toplam);
    }


    // S4: poziflerin kuplerinden max olani yazdiralim
    private static Optional<Integer> pozKupMax(List<Integer>intL){
        return intL.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Math::max);
    }



}
