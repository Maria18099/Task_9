package org.example;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Task 1
        ArrayList<String> list = new ArrayList<>(5);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.remove(3);
        //Task 2
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.remove(1);
        //Task 3
        MyQueue<String> queue = new MyQueue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.poll();
        //Task 4
        MyStack<String> stack = new MyStack<>(5);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.pop();
        stack.remove(2);
        //Task 5
        MyHashMap<Integer,String> map = new MyHashMap<>(10);
        map.put(1,"One");
        map.put(2,"Two");
        map.put(12,"Twelve");
        map.put(3,"Three");
        map.put(3,"Four");
        map.put(15,"Fifteen");
        map.put(5,"Five");
        map.remove(12);
    }
}