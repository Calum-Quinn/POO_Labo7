package calculator;

import util.Stack;

import java.util.Iterator;

public class State {
    private Stack<Double> stack;

    private String currentValue = "0";

    private boolean isResult;

    private String memory;

    State() {
        stack = new Stack<>();
    }

    public boolean isResult() {
        return isResult;
    }

    public void setResult(boolean result) {
        isResult = result;
    }

    public Double getStackVal() {
        return stack.pop();
    }

    public void setStackVal(Double val) {
        stack.push(val);
    }

    public Object[] getStack() {
        if (stack.isEmpty()) {
            return null;
        }

        return stack.getStack();
    }

    public void emptyStack(){

        // A REGARDER POUR VIDER LA STACK


        Iterator<Double> it = stack.iterator();
        while(it.hasNext()) {
            getStackVal();
        }
        getStackVal();
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
