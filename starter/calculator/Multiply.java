package calculator;

class Multiply extends Operator {
    Multiply(State state) {
        super(state);
    }
    
    void execute() {
        if (state.cannotCalculate()) {
            return;
        }

        // Multiply together the current value and the last value of the stack
        state.currentValue = Double.parseDouble(state.stack.pop()) * Double.parseDouble(state.currentValue) + "";
        state.hasResult = true;

        if (state.isCurrentValueZero()) {
            state.currentValue = "0";
        }
    }
}
