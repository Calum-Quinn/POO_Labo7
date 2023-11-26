package calculator;

class Divide extends Operator {
    Divide(State state) {
        super(state);
    }
    
    void execute() {
        if (state.cannotCalculate()) {
            return;
        }

        // Divide the current value with the last value of the stack
        state.currentValue = Double.parseDouble(state.currentValue) / Double.parseDouble(state.stack.pop()) + "";
        state.hasResult = true;

        if (state.isCurrentValueZero()) {
            state.currentValue = "0";
        }
    }
}
