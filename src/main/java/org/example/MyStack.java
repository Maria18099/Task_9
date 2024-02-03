package org.example;

import java.util.Arrays;

public class MyStack<T>{
    private T[] stack;
    private int lastElementIndex;
    public MyStack(int size){
        stack = (T[]) new Object[size];
        lastElementIndex = -1;
    }
    public void push(Object value){
        if(lastElementIndex<stack.length-1){
            stack[++lastElementIndex] = (T)value;
        }
    }
    public T remove(int index){
        if(index<0 || index>lastElementIndex){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T deletedElement = stack[index];
        for (int i = index; i < lastElementIndex; i++) {
            stack[i] = stack[i+1];
        }
        stack[lastElementIndex--] = null;
        return deletedElement;
    }
    public void clear(){
        Arrays.fill(stack, null);
        lastElementIndex = -1;
    }
    public int size(){
        return stack.length;
    }
    public T peek(){
        return stack[0];
    }
    public T pop(){
        T deletedValue = stack[0];
        for (int i = 0; i < lastElementIndex; i++) {
            stack[i] = stack[i+1];
        }
        stack[lastElementIndex--] = null;
        return deletedValue;
    }
}
