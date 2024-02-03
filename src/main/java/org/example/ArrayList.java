package org.example;

import java.util.Arrays;

public class ArrayList <T>{
    private T[] list;
    private int lastElementIndex;
    public ArrayList(int size){
        list = (T[]) new Object[size];
        lastElementIndex = -1;
    }
    public void add(Object value){
        if(lastElementIndex<list.length-1){
            list[++lastElementIndex] = (T)value;
        }
    }
    public T remove(int index){
        if(index<0 || index>lastElementIndex){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T deletedElement = list[index];
        for (int i = index; i < lastElementIndex; i++) {
            list[i] = list[i+1];
        }
        list[lastElementIndex--] = null;
        return deletedElement;
    }
    public void clear(){
        Arrays.fill(list, null);
        lastElementIndex = -1;
    }
    public int size(){
        return list.length;
    }
    public T get(int index){
        if(index<0 || index>lastElementIndex){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return list[index];
    }
}
