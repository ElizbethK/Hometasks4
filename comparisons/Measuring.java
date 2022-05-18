package com.netcracker.homeworks.collections.comparisons;


import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Measuring {
    static long start;
    static long finish;
    static long elapsed;


//-----------------Operations of adding------------------------//
    //Add for all collections
    public static long measureAdd(Collection collection) {
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            collection.add(i);
        }
        Instant fn = Instant.now();
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of adding, ns: ");
        return elapsed;
    }


    //Add by index for List
    public static long measureAddByIndex(int i, Object object, List list) {
        start = System.nanoTime();
        list.add(i,object);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of adding by index, ns: ");
        return elapsed;
    }

    //Put by index for Map
    public static long measurePut(Object key, Object object, Map map ) {
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            map.put(i, i);
        }
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of putting by key, ns: ");
        return elapsed;
    }


    //-----------------Operations of getting------------------------//
    //Get for List
    public static long measureGetByIndex(int i, List list) {
        start = System.nanoTime();
        list.get(i);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of getting by index, ns: ");
        return elapsed;
    }

    //Get for Map
    public static long measureGetByKey(Object key, Map map) {
        start = System.nanoTime();
        map.get(key);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of getting by key, ns: ");
        return elapsed;
    }

    //Get for Set
    public static long measureContainsByObject(Object object, Set set) {
        start = System.nanoTime();
        set.contains(object);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of checking for containing, ns: ");
        return elapsed;
    }


    //-----------------Operations of removing------------------------//

    //Remove by index for List
    public static long measureRemoveByIndex(int i, List list) {
        start = System.nanoTime();
        list.remove(i);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of removing by index, ns: ");
        return elapsed;
    }

    //Remove by object for List
    public static long measureRemoveByObject(Object object, List list) {
        start = System.nanoTime();
        list.remove(object);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of removing by object, ns: ");
        return elapsed;
    }

    //Remove by index for Map
    public static long measureRemoveByKey(Object key, Map map) {
        start = System.nanoTime();
        map.remove(key);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of removing by key, ns: ");
        return elapsed;
    }

    //Remove by index and object for Map
    public static long measureRemove(Object key, Object value, Map map) {
        start = System.nanoTime();
        map.remove(key, value);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of removing by value, ns: ");
        return elapsed;
    }

    //Remove for Set
    public static long measureRemoveByObject(Object object, Set set) {
        start = System.nanoTime();
        set.contains(object);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of removing by object, ns: ");
        return elapsed;
    }

    //-----------------Operations of clearing------------------------//
    //Clear for all collections
    public static long measureClear(Collection collection) {
        start = System.nanoTime();
        collection.clear();
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of clearing, ns: ");
        return elapsed;
    }

    //Clear for all Map
    public static long measureClear(Map map) {
        start = System.nanoTime();
        map.clear();
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.print("Time of clearing, ns: ");
        return elapsed;
    }


}

