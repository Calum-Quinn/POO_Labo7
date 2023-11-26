package calculator;

class MemoryStore extends Operator {
    MemoryStore(State state) {
        super(state);
    }

    void execute() {
        // Store the current value
        if (!state.currentValue.equals("0") && !state.hasError) {
            // If we stored a result, we no longer have a result
            if (state.hasResult) {
                state.hasResult = false;
            }
            state.memory = state.currentValue;
            state.currentValue = "0";
        }
    }
}
