package calculator;

class Enter extends Operator {

    Enter(State state) {
        super(state);
    }
    void execute() {
        // Add the current value to the stack
        state.setStackVal(Double.parseDouble(state.getCurrentValue()));
        state.setCurrentValue("0");
    }
}
