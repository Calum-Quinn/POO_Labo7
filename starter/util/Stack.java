package util;

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
    int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(T value) {
        Item<T> newItem = new Item<>(value);
        newItem.next = top;
        top = newItem;
        ++size;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.value;
        top = top.next;
        --size;

        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Object[] getStack() {
        if (isEmpty()) {
            //throw new EmptyStackException();
        }
        Object[] array = new Object[size];
        Item<T> item = top;

        for (int i = 0; i < array.length; ++i) {
            array[i] = item.value;
            item = item.next;
        }

        return array;
    }

    public void clear() {
        while (!isEmpty()) {
            pop();
        }
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
