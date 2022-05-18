package com.netcracker.homeworks.collections;

class Node <E>{
    private E element;
    private Node nextNode;
    private Node prevNode;


    public Node( Node prevNode, E element,  Node nextNode){
        this.prevNode = prevNode;
        this.element = element;
        this.nextNode = nextNode;
    }

    public Node(E element) {
        this.element = element;
    }


    public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }
