package org.example;

public class MyQueue <T>{
    class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void add(Object value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public T peek(){
        return (T)head.data;
    }
    public T poll(){
        if(head==null){
            return null;
        }
        T deletedValue = (T)head.data;
        head = head.next;
        return deletedValue;
    }
}
