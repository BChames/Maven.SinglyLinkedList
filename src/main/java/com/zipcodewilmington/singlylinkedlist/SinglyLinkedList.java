package com.zipcodewilmington.singlylinkedlist;

public class SinglyLinkedList {

    static SinglyLinkedList list = new SinglyLinkedList();
    private Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    //This method is functioning as needed
    public static void add(int data) {

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
    public static Boolean contains(int value){

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
    public static Integer get(int index){

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
    public static Integer find(int element){

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
    public static SinglyLinkedList copy(SinglyLinkedList copy){

        //SinglyLinkedList copy = new SinglyLinkedList();
        SinglyLinkedList listCopy = list;
        copy = list;

        return copy;
    }

    //This method is functioning as needed
    public SinglyLinkedList sort() {

        Node currNode = list.head;
        Node nextNode = currNode.next;
        Node temp = currNode;

        int count = 0;

        while (currNode != null && nextNode != null) {
            if (currNode.data > nextNode.data) {
                temp = currNode;
                currNode = nextNode;
                nextNode = temp;

                currNode = currNode.next;

            }


        }
        return list;
    }

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
