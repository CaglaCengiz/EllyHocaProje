package day5;

import java.util.*;

public class Q04_MapTask {
    // PART 1
// create a map with groupName as key and groupMembers as value
// "Group1" = ["Member1", "Member2"]
// "Group2" = ["Member3", "Member4", "Member5"]


// BÖLÜM 1
// anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
// "Grup1" = ["Üye1", "Üye2"]
// "Grup2" = ["Üye3", "Üye4", "Üye5"]

// PART 2
// find how many members each group has

// BÖLÜM 2
// her grubun kaç üyesi olduğunu bul
public static void main(String[] args) {
    HashMap<String, ArrayList<String>>grupVeUyeler=new HashMap<>();
    //   key : team ismi  value : teamdeki isimler
    ArrayList<String> team1 = new ArrayList<>(Arrays.asList("Gamze", "Merve Nil", "Sumeyra", "Ramazan"));
    ArrayList<String> team2 = new ArrayList<>(Arrays.asList("Hakan", "Yunus Emre", "Gursoy", "Yakup"));
    grupVeUyeler.put("teamA", team1);
    grupVeUyeler.put("teamB", team2);
    System.out.println("grupVeUyeler = " + grupVeUyeler);
    //grupVeUyeler = {teamA =[Gamze, Merve Nil, Sumeyra, Ramazan], teamB=[Hakan, Yunus Emre, Gursoy, Yakup]}
    Collection<ArrayList<String>> values = grupVeUyeler.values();
    for (ArrayList<String> each: values //each : teamleri temsil eder
    ) {
        System.out.println(each.size()); // 4  ve 4
    }
    Set<String> keys = grupVeUyeler.keySet();
    for (String each:keys //each : teamleri temsil eder
    ) {
        ArrayList<String> uyelistesi = grupVeUyeler.get(each);
        System.out.println("grup uyelerinin sayisi :" + each + " " + uyelistesi.size() );
    }
        /*
        grup uyelerinin sayisi :teamA 4
        grup uyelerinin sayisi :teamB 4
         */
}

}

