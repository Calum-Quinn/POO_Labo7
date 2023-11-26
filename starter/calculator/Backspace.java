package calculator;

class Backspace extends Operator {
    Backspace(State state) {
        super(state);
    }

    void execute() {
        if (state.hasError) {
            state.clearCurrentValue();
            return;
        }

        // Remove the last digit from the current value
        state.currentValue = state.currentValue.substring(0, state.currentValue.length() - 1);
    }
}
