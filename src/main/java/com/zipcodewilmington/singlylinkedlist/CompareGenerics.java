package com.zipcodewilmington.singlylinkedlist;

import java.util.Collections;
import java.util.Comparator;

public class CompareGenerics<T extends Comparable<T>> implements Comparator<T> {

    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}