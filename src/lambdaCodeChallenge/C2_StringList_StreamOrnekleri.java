package lambdaCodeChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        System.out.println("s1");
        // S1: ilk harfi d ve ya c olanlari listeleyelim

        list.stream().filter(t->t.charAt(0)=='d'||t.charAt(0)=='c').collect(Collectors.toList());

        System.out.println("s2");
        //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
        System.out.println(list.stream().map(t -> "*" + t + "*"));

        System.out.println("s3");
        //S3: alfabetik  olarak siralayalim list olarak ***sorted
        System.out.println(list.stream().sorted());

        System.out.println("s4");
        //S4: tum 'l' leri silelim yazdiralim ***map(replaceAll)
       /* System.out.println(list.stream().filter(t-> t.contains

        System.out.println("s5");
        //S5 : icinde e olanlardan yeni bir list olusturunuz***filter(contains())  collect()
        list.stream().filter(t->t.contains("e")).collect(Collectors.toList());

        System.out.println("s6");
        // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi ***map(t->t.substring(0,1)+t->t.substring
list.stream().map(t->t.substring(0,1)+t->t.substring(0,1)+tt->t.substring(0,1)).forEach(t->);
        // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
        list.stream().map(t->t.substring(0,1).toUpperCase().substring(1).toLowerCase()).forEach((t) -> System.out.print(t + " "));

        System.out.println("s8");
        // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
        list.stream().filter(t->t.length()!=4&& t.length()!=6).collect(Collectors.toList());*/


    }
}