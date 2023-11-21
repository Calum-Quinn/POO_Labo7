package util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackIterator<T> implements Iterator<T> {
    private Item<T> current;

    public StackIterator(Stack<T> stack) {
        current = stack.top;
    }

    @Override
    public boolean hasNext() {
        return current.next != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        current = current.next;

        return current.value;
    }
}
