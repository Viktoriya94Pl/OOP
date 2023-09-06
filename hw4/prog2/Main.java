package hw4.prog2;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> listDogs = new ArrayList<>();
        listDogs.add("Rem");
        listDogs.add("Sam");
        listDogs.add("Charly");
        System.out.println("Перебор итератором");
        Iterator<String> iterator = listDogs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
