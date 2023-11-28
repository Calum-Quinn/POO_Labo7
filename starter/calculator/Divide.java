package calculator;

class Divide extends Operator {
    Divide(State state) {
        super(state);
    }
    
    void execute() {
        if (state.cannotCalculate()) {
            return;
        }

        // Check if dividing by 0
        if (state.isCurrentValueZero()) {
            state.hasError = true;
            state.currentValue = "Cannot divide by zero";
            return;
        }

        // Divide the current value with the last value of the stack
        state.currentValue = Double.parseDouble(state.stack.pop()) / Double.parseDouble(state.currentValue) + "";
        state.hasResult = true;
    }
}
