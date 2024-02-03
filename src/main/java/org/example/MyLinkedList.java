package org.example;

public class MyLinkedList <T>{
    class Node<T>{
        T data;
        Node next;
        Node prev;
        Node(T data){
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void add(Object value){
        Node newElement = new Node(value);
        if(head==null){
            head = newElement;
            tail = newElement;
        }
        else {
            tail.next = newElement;
            newElement.prev= tail;
            tail = newElement;
        }
        size++;
    }
    public T remove(int index) {
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node currentNode = getNode(index);
        if (currentNode.prev == null) {
            head = currentNode.next;
        } else {
            currentNode.prev.next = currentNode.next;
        }
        if (currentNode.next == null) {
            tail = currentNode.prev;
        } else {
            currentNode.next.prev = currentNode.prev;
        }
        size--;
        return (T)currentNode.data;
    }
    private Node getNode(int index) {
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public T get(int index) {
        return (T)getNode(index).data;
    }
}
