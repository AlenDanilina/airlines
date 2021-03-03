package ru.devay.airport;

import java.util.*;
import java.util.stream.Collectors;

import static ru.devay.airport.Airlines.*;

public class Main {
    public static void main(String[] args) {

        List<Baggage> baggages = new ArrayList<> ();
        baggages.add (new Baggage (Airlines.AIRFRANCE, "Econom", 10));
        baggages.add (new Baggage (Airlines.POBEDA, "Business", 20));
        baggages.add (new Baggage (Airlines.NORDVIND, "Comfort", 8));
        baggages.add (new Baggage (Airlines.EMIRATES, "Econom", 5));
        baggages.add (new Baggage (Airlines.AIRFRANCE, "Comfort", 7));
        baggages.stream().forEach (baggage -> System.out.println (baggage));

        System.out.println ("========");
        List<Baggage> sortedList = baggages.stream ()
                .sorted (Comparator.comparingInt (Baggage::getMaxWeight).reversed ())
                .collect (Collectors.toList ());
        sortedList.forEach (System.out::println);
        System.out.println ("========");

        List<Baggage> sortedListByString = baggages.stream ()
                .sorted ((a, b) -> b.getMaxLength() - a.getMaxLength())
                .collect (Collectors.toList ());
        sortedListByString.forEach (System.out::println);

        for (Baggage baggage: sortedListByString) {
            System.out.println(baggage.getMaxLength());
        }

    }
}
