package calculator;

class PlusMinus extends Operator {
    PlusMinus(State state) {
        super(state);
    }
    
    void execute() {
        if (state.isCurrentValueZero() || state.hasError) {
            return;
        }

        // Invert the sign of the current value
        if (state.currentValue.charAt(0) == '-') {
            state.currentValue = state.currentValue.substring(1);
        } else {
            state.currentValue = "-" + state.currentValue;
        }
    }
}
