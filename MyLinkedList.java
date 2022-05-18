package com.netcracker.homeworks.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList <E> implements ILinkedList{
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList(){
        lastNode = new Node<E>(firstNode,null,  null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    @Override
     public void add(Object element) {
        Node prev = lastNode;
        lastNode = new Node<E>( prev,null,  null);
        prev.setElement(element);
        prev.setNextNode(lastNode);
        size++;
    }

    @Override
    public void add(int index, Object element) {
        if(index >= 0 && index <= size) {
            Node<E> node = getNextElem(firstNode);
            for (int i = 0; i < index; i++) {
                node = getNextElem(node);
            }

            Node<E> newPrev = getNextElem(firstNode);
            if (index != 0) {
                for (int j = 0; j < index - 1; j++) {
                    newPrev = getNextElem(newPrev);
                }
            } else {
                newPrev = firstNode;
            }

            Node<E> targetNode = new Node<E>(newPrev, null, null);
            targetNode.setElement((E) element);
            targetNode.setNextNode(node);
            newPrev.setNextNode(targetNode);

        size++;

//        System.out.println("[added = " + targetNode.getElement() + "; prev = " +
//                newPrev.getElement() + "; next = " + node.getElement() +
//                "; new size = " + size + "]");
        } else
            System.out.println("error! this index > the size of this list! ");

    }

    @Override
    public void clear() {
        lastNode = new Node<E>(firstNode,null,  null);
        firstNode = new Node<E>(null, null, lastNode);
        int i = size;
        while(i > 0 ){
            size--;
            i--;}
        print();
    }

    @Override
    public Object get(int index) {
       if (index >= 0 && index <= size) {
           Node<E> searched = getNextElem(firstNode);
           for (int i = 0; i < index; i++) {
               searched = getNextElem(searched);
           }
           return searched.getElement();
       } else

           System.out.println("! invalid index");
       return null;
    }

    private Node<E> getNextElem(Node<E> current){
        return current.getNextNode();
    }

    @Override
    public int indexOf(Object element) {
        Node<E> node = getNextElem(firstNode);
        int i = 0;
        while(!(node.getElement().equals(element))){
            node = getNextElem(node);
            i++;
        } return i;
    }

    @Override
    public Object remove(int index) {
            Node<E> node = getNextElem(firstNode);
            if(index >= 0 && index <= size) {
            for (int i = 0; i < index; i++) {
                node = getNextElem(node);
            }

            Node<E> newPrev = getNextElem(firstNode);
            if (index != 0) {
                for (int j = 0; j < index - 1; j++) {
                    newPrev = getNextElem(newPrev);
                }
            } else {
                newPrev = firstNode;
            }

            Node<E> newNext = getNextElem(firstNode);
            for (int k = 0; k < index + 1; k++){
                newNext = getNextElem(newNext);
            }

            newNext = new Node<E>(newPrev, null, null);
            newNext.setElement(newNext.getElement());
            newNext.setNextNode(newNext.getNextNode());
            newPrev.setNextNode(newNext);

            size--;
//            System.out.println("[deleted = " + node.getElement() + "; " +
//                    '\n' + "new previous element = " +
//                    newPrev.getElement() + "; new next element = " + newNext.getElement() +
//                    "; " + '\n' + "new size = " + size + "]" + '\n');
        } else
            System.out.println("error! this index > the size of this list! ");

        return node.getElement();
    }

    @Override
    public Object set(int index, Object element) {
            Node<E> newNode = getNextElem(firstNode);
            if (index < size) {
                for (int i = 0; i < index; i++) {
                newNode = getNextElem(newNode);
            }

            Node<E> newPrev = getNextElem(firstNode);
            if (index != 0) {
                for (int j = 0; j < index - 1; j++) {
                    newPrev = getNextElem(newPrev);
                }
            } else {
                newPrev = firstNode;
            }

            Node<E> newNext = getNextElem(firstNode);
            for (int k = 0; k < index + 1; k++) {
                newNext = getNextElem(newNext);
            }

            newNode = new Node<E>(newPrev, null, newNext);
            newPrev.setNextNode(newNode);
            newNode.setElement((E) element);
            newNode.setNextNode(newNext);

        } else
                System.out.println("!!! the element №" + index + " does not exist");
            return newNode.getElement();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node currentNode = firstNode.getNextNode();
        int i = 0;

        while(currentNode != null & i < size){

            array[i] = currentNode.getElement();
            currentNode = currentNode.getNextNode();
            i++;
        }
        for (Object n:array) {
            System.out.print(n + " ");
        }
        return array;
    }



    @Override
    public Object[] toArray(Object[] a) {
       if (a.length < size){
            a = (Object[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }

        Node currentNode = firstNode.getNextNode();
        int i = 0;
        while(currentNode != null & i < size ){
            a[i] = currentNode.getElement();
            currentNode = currentNode.getNextNode();
            i++;
        }

        if (a.length > size)
            a[size] = null;

        for (Object n: a)
            System.out.print(n + "; ");

        return a;
    }

    //---------------------------

    public void print(){
        Node currentNode = firstNode;
        System.out.println('\n' + "Your linked list: ");
        while(currentNode != null){
            System.out.println(currentNode.getElement());
            currentNode = currentNode.getNextNode();
        }
        System.out.println("[size = " + size + "]");
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current =  new Node<E>(null, null, lastNode);

            @Override
            public boolean hasNext() {
                return current.getNextNode() != null;
            }

            @Override
            public E next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                current = current.getNextNode();
                return current.getElement();
            }
        };
    }


    @Override
    public String toString() {
        if(size == 0) return "[]";
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Object element : this) {
            stringBuilder.append(element.toString());
            stringBuilder.append(", ");
        }
        String result = stringBuilder.substring(0, stringBuilder.length() - 2);
        return result + "]";
    }
}
