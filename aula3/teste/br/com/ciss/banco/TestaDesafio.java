package br.com.ciss.banco;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestaDesafio {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<Integer>(
                new Comparator<Integer>() {
            
            public int compare(Integer obj1, Integer obj2) {
                if (obj1 < obj2) {
                    return +1;
                } else if (obj1 > obj2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < 50; i++) {

            set.add(i);
        }

        System.out.println(set);
    }
}
