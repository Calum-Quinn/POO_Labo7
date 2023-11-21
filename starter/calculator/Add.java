package calculator;

class Add extends Operator {

    Add(State state) {
        super(state);
    }
    void execute() {
        // Add together the last two values on the stack
        state.setCurrentValue(Double.toString(state.getStackVal() + state.getStackVal()));
    }
}
