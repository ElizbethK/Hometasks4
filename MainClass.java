package com.netcracker.homeworks.collections;


import com.netcracker.homeworks.project1.Circle;

import java.util.LinkedList;


public class MainClass {
    public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList<>();
        System.out.println("-> Adding elements: ");
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add("abc");
        myLinkedList.print();

        System.out.println("============================");
        System.out.println("-> Adding elements by index: ");
        myLinkedList.add(4, "0000000");
        myLinkedList.print();

        System.out.println("============================");
        System.out.println("-> Removing an element: ");
        myLinkedList.remove(4);
        myLinkedList.print();

        System.out.println("============================");
        System.out.print("-> The index of the given element: ");
        System.out.println(myLinkedList.indexOf(3));

        System.out.println("============================");
        System.out.print("-> As an array: ");
        myLinkedList.toArray();

        System.out.println('\n' + "============================");

        System.out.println("-> Clearing:");
        myLinkedList.clear();

        System.out.println('\n' + "|--------MyLinkedList vs. LinkedList----------|");

        MyLinkedList<Circle> circles = new MyLinkedList<>();
        circles.add(new Circle(5, "red"));
        circles.add(new Circle(2, "yellow"));
        circles.add(new Circle(7, "blue"));
        circles.add(new Circle(3,"black"));

        LinkedList<Circle> listCircles = new LinkedList<>();
        listCircles.add(new Circle(5, "red"));
        listCircles.add(new Circle(2, "yellow"));
        listCircles.add(new Circle(7, "blue"));
        listCircles.add(new Circle(3,"black"));



        System.out.println('\n' + "-----Adding-------");

        long start = System.nanoTime();
        circles.add(new Circle(10, "white"));
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Time for MyLinkedList, ns: " + elapsed );

        start = System.nanoTime();
        listCircles.add(new Circle(10, "white"));
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for LinkedList, ns: " + elapsed );


        System.out.println('\n' + "-----Adding by index-------");

        start = System.nanoTime();
        circles.add(5, new Circle(10, "white"));
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for MyLinkedList, ns: " + elapsed);

        start = System.nanoTime();
        listCircles.add(5, new Circle(10, "white"));
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for LinkedList, ns: " + elapsed);

        System.out.println('\n' + "-----Getting-------");

        start = System.nanoTime();
        circles.get(2);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for MyLinkedList, ns: " + elapsed);

        start = System.nanoTime();
        listCircles.get(2);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for LinkedList, ns: " + elapsed);


        System.out.println('\n' + "-----Removing-------");

        start = System.nanoTime();
        circles.remove(2);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for MyLinkedList, ns: " + elapsed);

        start = System.nanoTime();
        listCircles.remove(2);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for LinkedList, ns: " + elapsed);

        System.out.println('\n' + "-----Clearing-------");

        start = System.nanoTime();
        circles.clear();
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for MyLinkedList, ns: " + elapsed);

        start = System.nanoTime();
        listCircles.clear();
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Time for LinkedList, ns: " + elapsed);






    }
}

