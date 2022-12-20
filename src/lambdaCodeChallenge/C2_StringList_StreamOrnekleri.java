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
        ilkHarfiDveyaColanListele(list);
        basVeSonayildizekle(list);
        alfabetikOlarakSirala(list);
        tumLlerisilme(list);
        icindeEolanlariListele(list);
        ilkHarfini3kereTekrar(list);
        tumElIlkHarfByk(list);
        uzunlugu4Ve6haricListele(list);

    }
    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
    private static void uzunlugu4Ve6haricListele(List<String> list) {
        System.out.println();
        list.stream().filter(t->t.length()!=6 && t.length()!=4).forEach(Methods::yazString);
    }
    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    private static void tumElIlkHarfByk(List<String> list) {
        System.out.println();
        list.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(Methods::yazString);
    }
    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    private static void ilkHarfini3kereTekrar(List<String> list) {
        System.out.println();
        list.stream().map(t->t.substring(0,1)+t.substring(0,1)+t).forEach(Methods::yazString);
    }
    //S5 : icinde e olanlardan yeni bir list olusturunuz
    private static void icindeEolanlariListele(List<String> list) {
        System.out.println();
        list.stream().filter(t->t.contains("e")).forEach(Methods::yazString);
    }
    //S4: tum 'l' leri silelim yazdiralim
    private static void tumLlerisilme(List<String> list) {
        System.out.println();
        list.stream().map(t->t.toLowerCase().replaceAll("l","")).forEach(Methods::yazString);
    }
    //S3: alfabetik  olarak siralayalim
    private static void alfabetikOlarakSirala(List<String> list) {
        System.out.println();
        list.stream().map(t->t.toLowerCase()).sorted().forEach(Methods::yazString);
    }
    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    private static void basVeSonayildizekle(List<String> list) {
        System.out.println();
        list.stream().map(t->"*"+t+"*").forEach(Methods::yazString);
    }

    // S1: ilk harfi d ve ya c olanlari listeleyelim
    private static void ilkHarfiDveyaColanListele(List<String> list) {
        System.out.println();
        list.stream().map(t->t.toLowerCase()).filter(t->t.startsWith("d")||t.startsWith("c")).forEach(Methods::yazString);
    }
}