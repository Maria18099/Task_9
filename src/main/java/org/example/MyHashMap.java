package org.example;

import java.util.Arrays;

public class MyHashMap <K,V> {
    class Node<K,V>{
        K key;
        V value;
        Node next;
        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    private Node<K,V>[] table;
    private int size;
    public MyHashMap(int size){
        table = new Node[size];
        this.size = size;
    }
    public void put(Object key, Object value){
        int index = hash((K)key)%size;
        if(table[index] == null){
            table[index] = new Node(key, value);
        }
        else{
            Node current = table[index];
            while(current.next!=null){
                if(current.key.equals(key)){
                    return;
                }
                current = current.next;
            }
            if(current.key.equals(key)){
                return;
            }
            current.next = new Node(key,value);
        }
    }
    private int hash(K key) {
        return key == null ? 0 : key.hashCode();
    }
    public void remove(Object key){
        int index = hash((K)key)%size;
        if(table[index]!=null){
            Node current = table[index];
            Node prev = null;
            while(current!=null && !current.key.equals(key)){
                prev = current;
                current = current.next;
            }
            if(current!=null && prev==null){
                table[index] = current.next;
            }
            if(prev!=null && current!=null){
                prev.next = current.next;
            }
        }
    }
    public void clear() {
        Arrays.fill(table, null);
        size = 0;
    }
    public int size(){
        return size;
    }
    public V get(Object key) {
        int index = hash((K)key)%size;
        Node<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
}
