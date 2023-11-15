package calculator;

import util.Stack;

public class State {
    private Stack<Double> stack;

    private Double memory;

    public Double getVal() {
        return stack.pop();
    }

    public void setVal(Double val) {
        stack.push(val);
    }

    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }
}
