package calculator;

class Multiply extends Operator {

    Multiply(State state) {
        super(state);
    }
    void execute() {
        // Multiply together the last two values on the stack
        state.setCurrentValue(Double.toString(state.getStackVal() * state.getStackVal()));
    }
}
