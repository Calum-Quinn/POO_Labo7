package calculator;

class Clear extends Operator {
    Clear(State state) {
        super(state);
    }

    void execute() {
        // Set the current value to its default 0 and empty the stack
        state.clearCurrentValue();
        state.stack.clear();
    }
}
