package calculator;

class MemoryStore extends Operator {

    MemoryStore(State state) {
        super(state);
    }
    void execute() {
        // Store the current value
        state.setMemory(state.getCurrentValue());
    }
}
