package util;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private Item<T> top;

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
            return null; // TODO: throw exception ?
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
        return new StackIterator();
    }

    private class Item<T> {
        private T value;
        private Item<T> next;

        public Item(T value) {
            this.value = value;
            next = null;
        }
    }

    private class StackIterator implements Iterator<T> {
        private Item<T> current = top;

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }
            current = current.next;

            return current.value;
        }
    }
}
