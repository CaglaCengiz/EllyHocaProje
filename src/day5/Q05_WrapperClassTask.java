package day5;

public class Q05_WrapperClassTask {
   /* int kabul eden bir yöntem oluşturma
    ve bu int'nin iki katını döndürür
    Bu yöntemi sarmalayıcı sınıfıyla aşırı yükleyin: Tamsayı

    int kabul eden bir metot yarat
    ve bu int'nin iki katını döndürür
    bu yöntemi wrapper sınıfıyla overload et : Tamsayı*/

    public static void main(String[] args) {
        twice(5);
        System.out.println("primitive data type :" +twice(5)); //primitive data type :10

        Integer sayi= 10;
        System.out.println("nonprimitive data type : " +twice(sayi)); //nonprimitive data type : 20

    }

    private static int twice(int sayi) {
        return sayi * 2;
    }

    private static Integer twice(Integer sayi) {
        return sayi * 2;
    }
    }


