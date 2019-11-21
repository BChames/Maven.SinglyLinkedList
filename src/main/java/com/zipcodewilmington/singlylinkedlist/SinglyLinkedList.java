package com.zipcodewilmington.singlylinkedlist;

public class SinglyLinkedList<T> {

    SinglyLinkedList list = new SinglyLinkedList();
    private Node<T> head;

    static class Node<T> {

        T data;
        Node<T> next;

        Node(T d) {
            data = d;
            next = null;
        }
    }

    //This method is functioning as needed
    public void add(T data) {

        Node newNode = new Node(data);
        newNode.next = null;


        if (list.head == null) {
            list.head = newNode;
        }
        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = newNode;
        }



        }
    //This method is working as needed
    public Integer size(){

        Node currNode = list.head;
        int count = 0;

        while (currNode != null) {

            count++;
            currNode = currNode.next;

        }

        return count;
    }

    //This method is working as needed
    public Boolean contains(T value){

        Node currNode = list.head;


        while (currNode != null) {

            if (currNode.data == value) {
                return true;
            }

            currNode = currNode.next;
        }
        return false;
    }
    //This method is functioning as needed
    public Object get(int index){

        Node currNode = list.head;
        int count = 0;


        while (currNode != null) {

            if (count == index) {
                return currNode.data;
            }
            count++;
            currNode = currNode.next;
        }
       return null;
    }

    //This method is functioning as needed
    public Integer find(T element){

        Node currNode = list.head;
        int count = 0;

        while (currNode != null) {

            if (currNode.data == element) {
                return count;
            }
            count++;
            currNode = currNode.next;
        }
        return -1;
    }

    //kind of complete, need remove method to finish testing
    public SinglyLinkedList copy(SinglyLinkedList copy){

        //SinglyLinkedList copy = new SinglyLinkedList();
        SinglyLinkedList listCopy = list;
        copy = list;

        return copy;
    }
/*

    public void sort(){
        CompareGenerics comp = new CompareGenerics();

        Boolean wasChanged;
        do {
            Node<T> current = head;
            Node<T> previous = null;
            Node<T> next = head.next;
            wasChanged = false;

            while (next != null) {
                if (comp.compare(current.data, next.data) > 0) {
                    wasChanged = true;
                    if (previous != null) {
                        Node temp = next.next;
                        previous.next = next;
                        next.next = current;
                        current.next = temp;
                    } else {
                        Node temp = next.next;
                        head = next;
                        next.next = current;
                        current.next = temp;
                    }
                    previous = next;
                    next = current.next;
                } else {
                    previous = current;
                    current = next;
                    next = next.next;
                }
            }
        } while (wasChanged);
    }


 */
    public SinglyLinkedList remove(int index){

        Node currNode = list.head;
        Node prev = null;

        int count = 0;

        if (currNode != null && count == index) {
            list.head = currNode.next;

            return list;
        }

        count = 1;
        while (currNode != null && count != index) {

            prev = currNode;
            currNode = currNode.next;
            count++;
        }

        if (currNode != null) {
            prev.next = currNode.next;
            return list;
        }

        if (currNode == null) {
            return null;
        }

        return list;
    }



    }
