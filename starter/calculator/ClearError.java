package calculator;

class ClearError extends Operator {

    ClearError(State state) {
        super(state);
    }
    void execute() {
        // Set the current value to it's default, 0
        state.setCurrentValue("0");
    }
}
