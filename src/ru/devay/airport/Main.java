package ru.devay.airport;

import java.util.*;
import java.util.stream.Collectors;

import static ru.devay.airport.Airlines.*;

public class Main {
    public static void main(String[] args) {

        List<Baggage> baggages = new ArrayList<> ();
        baggages.add (new Baggage (AIRFRANCE, "Econom", 10));
        baggages.add (new Baggage (POBEDA, "Business", 20));
        baggages.add (new Baggage (NORDVIND, "Comfort", 8));
        baggages.add (new Baggage (EMIRATES, "Econom", 5));
        baggages.add (new Baggage (AIRFRANCE, "Comfort", 7));


        baggages.stream ().forEach (baggage -> System.out.println (baggage));

        System.out.println ("========");
        List<Baggage> sortedList = baggages.stream ()
                .sorted (Comparator.comparingInt (Baggage::getMaxWeight).reversed ())
                .collect (Collectors.toList ());
        sortedList.forEach (System.out::println);

        System.out.println ("========");

        List<Baggage> sortedListByString = baggages.stream ()
                .sorted (Comparator.comparingInt (Baggage::getMaxLeight).reversed ())
                .collect (Collectors.toList ());
        sortedList.forEach (System.out::println);

        class StringComparator implements Comparator<String>{
            public int compare(String o1, String o2){
                return Integer.compare(o1.length(), o2.length());
            }
        }


    }
}
