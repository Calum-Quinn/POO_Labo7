package calculator;

import util.Stack;

public class State {
    private Stack<Double> stack;

    public Double getVal() {
        return stack.pop();
    }

    public void setVal(Double val) {
        stack.push(val);
    }
}
