package calculator;

class SquareRoot extends Operator {
    SquareRoot(State state) {
        super(state);
    }
    
    void execute() {
        if (state.hasError) {
            return;
        }

        if (state.currentValue.charAt(0) == '-') {
            state.hasError = true;
            state.currentValue = "Cannot take the SquareRoot of a negative number";
            return;
        }

        // SquareRoot of the current value
        state.currentValue = Math.sqrt(Double.parseDouble(state.currentValue)) + "";
        state.hasResult = true;
    }
}