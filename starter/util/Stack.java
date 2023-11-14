package util;

public class Stack<T> {
    private class Element {
        private final T value;
        private final Element next;

        public Element(T value, Element next) {
            this.value = value;
            this.next = next;
        }
    }

    public void stack(T value) {
    }

    public void unstack() {
    }

    public String toString() {
        return "";
    }

    public T[] getStack() {
        return null;
    }

    public Iterator<T> iterator() {
        return null;
    }


}
