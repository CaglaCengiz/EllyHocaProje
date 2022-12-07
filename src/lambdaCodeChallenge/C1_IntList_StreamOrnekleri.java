package lambdaCodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));


        // S1:listi aralarinda bosluk birakarak yazdiriniz //
        list.stream().forEach((t) -> System.out.print(t + " "));
        System.out.println();
        //S2: sadece negatif olanlari yazdir
        list.stream().filter(t -> t<0).forEach((t) -> System.out.print(t + " "));
        System.out.println();
        //S3: pozitif olanlardan yeni bir liste olustur
        list.stream().filter(t -> t >0).collect(Collectors.toList());
        System.out.println();

        // S4: list in elemanlarin karelerinden yeni bir list olusturalim
        list.stream().map(t -> t * t).collect(Collectors.toList());

        System.out.println();
    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
        list.stream().map(t -> t * t).distinct().collect(Collectors.toList());

        System.out.println();

    //S6: listin elemanlarini kucukten buyuge siralayalim
        list.stream().sorted().forEach((t) -> System.out.print(t + " "));
        System.out.println();
    //S7: listin elemanlarini buyukten kucuge siralayalim
        list.stream().sorted(Comparator.reverseOrder()).forEach((t) -> System.out.print(t + " "));

        System.out.println("s8");
    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        list.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
        System.out.println("s9");
    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        list.stream().filter(t->t>0).map(t->t*t).filter(t->t%10!=5).collect(Collectors.toList());
        System.out.println("s10");
    // S10 :list elemanlarini toplamini bulalim
        System.out.println(list.stream().reduce(0, (x, y) -> (x + y)));
        System.out.println("s11");
        // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
        list.stream().filter(t->t<0).peek(t-> System.out.println("negatifler:"+ t )).map(t->t*t).
                peek(t-> System.out.println("kareleri:"+t )).collect(Collectors.toList());

        System.out.println("s12");
    // S12 : listeden 5 den buyuk  sayi var mi?
        System.out.println(list.stream().anyMatch(t -> t > 5));
        System.out.println("s13");
        // S13 : listenin tum elemanlari sifirdan kucuk mu?
        System.out.println(list.stream().allMatch(t -> t < 0));

        System.out.println("s14");
        // S14: listenin 100 e esit elemani yok mu ?
        System.out.println(list.stream().noneMatch(t -> t == 100));
        System.out.println("s15");
        // S15: listenin sifira esit elemani yok mu?
        System.out.println(list.stream().noneMatch(t -> t == 0));
        System.out.println("s16");
        // S16:  listenin ilk 5 elemanini topla?
        System.out.println(list.stream().sorted().limit(5).reduce(0, (x, y) -> (x + y)));

        System.out.println("s17");
    //S17: listenin son bes elemaninin  listele
     list.stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());


    }}