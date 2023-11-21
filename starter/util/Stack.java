package util;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

class Item<T> {
    T value;
    Item<T> next;

    public Item(T value) {
        this.value = value;
        next = null;
    }
}

public class Stack<T> implements Iterable<T> {
    Item<T> top;

    public Stack() {
        top = null;
    }

    public void push(T value) {
        Item<T> newItem = new Item<>(value);
        newItem.next = top;
        top = newItem;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T value = top.value;
        top = top.next;

        return value;
    }

    public ArrayList<T> getStack() {
        ArrayList<T> list = new ArrayList<T>();
        Item<T> item = top;

        while (item != null) {
            list.add(item.value);
            item = item.next;
        }

        return list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Item<T> item = top;

        while (item != null) {
            sb.append(item.value).append("\n");
            item = item.next;
        }

        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator<>(this);
    }
}
