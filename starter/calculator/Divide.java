package calculator;

class Divide extends Operator {

    Divide(State state) {
        super(state);
    }
    void execute() {
        // Divide the second to last number by the last number on the stack
        state.setCurrentValue(Double.toString(1 / state.getStackVal() * state.getStackVal()));
    }
}
