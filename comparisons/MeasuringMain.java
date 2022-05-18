package com.netcracker.homeworks.collections.comparisons;

import com.netcracker.homeworks.collections.MyLinkedList;

import java.util.*;

public class MeasuringMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        //ArrayList
        System.out.println("--------ArrayList-------");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println(Measuring.measureAdd(arrayList));
        System.out.println(Measuring.measureAddByIndex(2, 3, arrayList));
        System.out.println(Measuring.measureGetByIndex(3, arrayList));
        System.out.println(Measuring.measureRemoveByIndex(5, arrayList));
        System.out.println(Measuring.measureRemoveByObject(10, arrayList));
        System.out.println(Measuring.measureClear(arrayList));


       //LinkedList
        System.out.println('\n' + "--------LinkedList-------");
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(Measuring.measureAdd(linkedList));
        System.out.println(Measuring.measureAddByIndex(2,3, linkedList));
        System.out.println(Measuring.measureGetByIndex(3, linkedList));
        System.out.println(Measuring.measureRemoveByIndex(5, linkedList));
        System.out.println(Measuring.measureRemoveByObject(10, linkedList));
        System.out.println(Measuring.measureClear(linkedList));

        ///////////////////////////////////////////////////////////////

        //HashSet
        System.out.println('\n' + "--------HashSet-------");
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(Measuring.measureAdd(hashSet));
        System.out.println(Measuring.measureContainsByObject(5,hashSet));
        System.out.println(Measuring.measureRemoveByObject(3,hashSet));
        System.out.println(Measuring.measureClear(hashSet));


        //LinkedHashSet
        System.out.println('\n' + "--------LinkedHashSet-------");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        System.out.println(Measuring.measureAdd(linkedHashSet));
        System.out.println(Measuring.measureContainsByObject(5,linkedHashSet));
        System.out.println(Measuring.measureRemoveByObject(3,linkedHashSet));
        System.out.println(Measuring.measureClear(linkedHashSet));

        //TreeSet
        System.out.println('\n' + "--------TreeSet-------");
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(Measuring.measureAdd(treeSet));
        System.out.println(Measuring.measureContainsByObject(5,treeSet));
        System.out.println(Measuring.measureRemoveByObject(3,treeSet));
        System.out.println(Measuring.measureClear(treeSet));


        /////////////////////////////////////////////////////////////

        //HashMap
        System.out.println('\n' + "--------HashMap-------");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        System.out.println(Measuring.measurePut(1, 1, hashMap));
        System.out.println(Measuring.measureGetByKey(13, hashMap));
        System.out.println(Measuring.measureRemove(22, 22, hashMap));
        System.out.println(Measuring.measureRemoveByKey(18, hashMap));
        System.out.println(Measuring.measureClear(hashMap));


        //LinkedHashMap
        System.out.println('\n' + "--------LinkedHashMap-------");
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println(Measuring.measurePut(1, 1, linkedHashMap));
        System.out.println(Measuring.measureGetByKey(13, linkedHashMap));
        System.out.println(Measuring.measureRemove(22, 22, linkedHashMap));
        System.out.println(Measuring.measureRemoveByKey(18, linkedHashMap));
        System.out.println(Measuring.measureClear(linkedHashMap));

        //TreeMap
        System.out.println('\n' + "--------TreeMap-------");
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        System.out.println(Measuring.measurePut(1, 1, treeMap));
        System.out.println(Measuring.measureGetByKey(13, treeMap));
        System.out.println(Measuring.measureRemove(22, 22, treeMap));
        System.out.println(Measuring.measureRemoveByKey(18, treeMap));
        System.out.println(Measuring.measureClear(treeMap));



    }
}

