package calculator;

class MemoryStore extends Operator {

    MemoryStore(State state) {
        super(state);
    }
    void execute() {
        state.setMemory(state.getVal());
    }
}
