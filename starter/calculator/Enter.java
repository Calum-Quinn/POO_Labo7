package calculator;

class Enter extends Operator {
    Enter(State state) {
        super(state);
    }
    
    void execute() {
        if (state.hasResult) {
            return;
        }

        // Add the current value to the stack
        if (!state.isCurrentValueZero() && !state.hasError) {
            state.stack.push(state.currentValue);
            state.currentValue = "0";
        }
    }
}
