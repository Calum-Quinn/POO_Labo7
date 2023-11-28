package calculator;

class Enter extends Operator {
    Enter(State state) {
        super(state);
    }
    
    void execute() {

        // Add the current value to the stack if not 0 or ending with '.'
        if (!state.isCurrentValueZero() && !state.hasError && !state.currentValue.endsWith(".")) {
            state.stack.push(state.currentValue);
            if (state.hasResult) {
                state.hasResult = false;
            }
            state.currentValue = "0";
        }
    }
}
