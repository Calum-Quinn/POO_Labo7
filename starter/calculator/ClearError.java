package calculator;

class ClearError extends Operator {
    ClearError(State state) {
        super(state);
    }

    void execute() {
        // Set the current value to its default 0
        state.clearCurrentValue();
    }
}
