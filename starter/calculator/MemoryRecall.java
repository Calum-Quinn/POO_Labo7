package calculator;

class MemoryRecall extends Operator {
    MemoryRecall(State state) {
        super(state);
    }

    void execute() {
        // Recall the last stored value
        if (!state.memory.equals("0") && !state.hasError) {
            // Add the current value to the stack if it is a result
            if (state.hasResult) {
                state.stack.push(state.currentValue);
            }
            state.currentValue = state.memory;
        }
    }
}
