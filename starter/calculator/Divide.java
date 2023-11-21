package calculator;

class Divide extends Operator {

    Divide(State state) {
        super(state);
    }
    void execute() {
        // Divide the second to last number by the last number on the stack
        state.setCurrentValue(Double.toString(state.getStackVal() / Double.parseDouble(state.getCurrentValue())));
        state.setResult(true);
    }
}
