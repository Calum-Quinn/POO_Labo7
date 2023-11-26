package calculator;

import util.Stack;

class State {
    final Stack<String> stack;

    String currentValue, memory;

    boolean hasResult, hasError;

    State() {
        stack = new Stack<>();
        currentValue = "0";
        memory = "0";
        hasResult = false;
        hasError = false;
    }

    /**
     * Check if the current value is 0
     * Since we are using doubles, we need to check if the value is 0.0
     * @return true if the current value is 0, false otherwise
     */
    boolean isCurrentValueZero() {
        return Double.parseDouble(currentValue) == 0;
    }

    /**
     * Check if the calculus cannot be done
     * @return true if the calculus cannot be done, false otherwise
     */
    boolean cannotCalculate() {
        return hasError || stack.isEmpty();
    }

    /**
     * Clear the current value and reset the state
     */
    void clearCurrentValue() {
        currentValue = "0";
        hasResult = false;
        hasError = false;
    }
}
