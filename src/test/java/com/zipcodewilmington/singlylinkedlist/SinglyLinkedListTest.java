package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

   SinglyLinkedList intList = new SinglyLinkedList();
   // SinglyLinkedList<String> stringList = new SinglyLinkedList();


    @Test
    public void addTest(){
        //GIVEN
        intList.add(1);

        //WHEN
       Boolean actual = intList.contains(1);

        //THEN
        Assert.assertTrue(actual);
    }

    @Test
    public void addTest2(){
        //GIVEN
        intList.add(49);
        intList.add(49549);
        intList.add(906949);


        //WHEN
        Boolean actual1 = intList.contains(49);
        Boolean actual2 = intList.contains(49549);
        Boolean actual3 = intList.contains(906949);

        //THEN
        Assert.assertTrue(actual1);
        Assert.assertTrue(actual2);
        Assert.assertTrue(actual3);
    }

    @Test
    public void sizeTest1(){

        intList.add(49);
        intList.add(49549);
        intList.add(906949);


        //WHEN
        intList.contains(49);
        intList.contains(49549);
        intList.contains(906949);

        int expected = 3;
        int actual = intList.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sizeTest2(){

        intList.add(49);
        intList.add(49549);
        intList.add(906949);
        intList.add(49);
        intList.add(49549);
        intList.add(906949);


        //WHEN
        intList.contains(49);
        intList.contains(49549);
        intList.contains(906949);
        intList.contains(49);
        intList.contains(49549);
        intList.contains(906949);

        int expected = 6;
        int actual = intList.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTest(){
        //GIVEN
        intList.add(1);
        int expected = 1;
        //WHEN
        int actual = intList.get(0);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest2(){
        //GIVEN
        intList.add(49);
        intList.add(49549);
        intList.add(906949);
        int expected1 = 49;
        int expected2 = 49549;
        int expected3 = 906949;


        //WHEN
        int actual1 = intList.get(0);
        int actual2 = intList.get(1);
        int actual3 = intList.get(2);

        //THEN
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void findTest(){
        //GIVEN
        intList.add(1);
        int expected = 0;
        //WHEN
        int actual = intList.find(1);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTest2(){
        //GIVEN
        intList.add(49);
        intList.add(49549);
        intList.add(906949);
        int expected1 = 0;
        int expected2 = 1;
        int expected3 = 2;


        //WHEN
        int actual1 = intList.find(49);
        int actual2 = intList.find(49549);
        int actual3 = intList.find(906949);

        //THEN
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void copyTest(){
        //GIVEN
        SinglyLinkedList copyList = new SinglyLinkedList();
        intList.add(1);
        intList.copy(copyList);

        int expectedList1 = copyList.get(0);
        int expectedList2 = intList.get(0);

        Assert.assertEquals(expectedList1, expectedList2);
    }

    @Test
    public void copyTest2(){
        //GIVEN
        SinglyLinkedList copyList = new SinglyLinkedList();
        intList.add(1);
        intList.add(1);
        intList.copy(copyList);

        int expectedList1 = copyList.get(0);
        int expectedList2 = intList.get(0);

        Assert.assertNotEquals(expectedList1, expectedList2);
    }

    @Test
    public void removeTest(){
        //GIVEN
        intList.add(1);

        //WHEN
        SinglyLinkedList actual = intList.remove(0);

        //THEN
        Boolean notTrue = intList.contains(1);
        Assert.assertFalse(notTrue);
    }

    @Test
    public void removeTest2(){
        //GIVEN
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        //WHEN
        SinglyLinkedList actual = intList.remove(2);

        //THEN
        Boolean notTrue = intList.contains(2);
        Assert.assertFalse(notTrue);
    }

    @Test
    public void sort(){

        intList.add(4);
        intList.add(3);
        intList.add(2);
        intList.add(1);

        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 3;
        int expected4 = 4;

        intList.sort();

        int actual1 = intList.get(0);
        int actual2 = intList.get(1);
        int actual3 = intList.get(2);
        int actual4 = intList.get(4);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
        Assert.assertEquals(expected4,actual4);
    }
    
}
