package calculator;

import util.Stack;

public class State<T> {
    private Stack<T> stack;
    private T currentValue;

    public void setCurrentValue(T currentValue) {
        this.currentValue = currentValue;
    }

    public T getNextVal() {
        return stack.pop();
    }
}
