package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        Map<Integer, List<Person>> m = new Map<>(1, new ArrayList<Person>(Arrays.asList(new Person("Orest", 21))));

        m.addEntry(30,new ArrayList<Person>(Arrays.asList(new Person("Andrew",20))));
        m.addEntry(44,new ArrayList<Person>(Arrays.asList(new Person("Andrew",20))));
        m.addEntry(32,new ArrayList<Person>(Arrays.asList(new Person("Andrew",20))));
        m.addEntry(63,new ArrayList<Person>(Arrays.asList(new Person("Andrew",20))));
        m.addEntry(3,new ArrayList<Person>(Arrays.asList(new Person("Andrew",20))));

        m.showMap();
        m.removeByKey(44);
        m.showMap();
        m.removeByValue(3);
        m.showMap();
        m.showKey();
        m.showValueList();


    }
}
