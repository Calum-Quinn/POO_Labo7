package calculator;

class Square extends Operator {
    Square(State state) {
        super(state);
    }
    
    void execute() {
        if (state.hasError) {
            return;
        }

        // Current value to the power of 2
        state.currentValue = String.valueOf(Math.pow(Double.parseDouble(state.currentValue), 2));
        state.hasResult = true;
    }
}
