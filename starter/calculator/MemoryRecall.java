package calculator;

class MemoryRecall extends Operator {

    MemoryRecall(State state) {
        super(state);
    }
    void execute() {
        // Recall the last stored value
        state.setCurrentValue(state.getMemory());
    }
}
