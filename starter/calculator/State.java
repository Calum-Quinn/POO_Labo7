package calculator;

import util.Stack;

public class State {
    private Stack<Double> stack;

    private String currentValue = "0";

    private String memory;

    public Double getStackVal() {
        return stack.pop();
    }

    public void setStackVal(Double val) {
        stack.push(val);
    }

    public void emptyStack(){
        while(stack.iterator().hasNext()) {
            getStackVal();
        }
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
