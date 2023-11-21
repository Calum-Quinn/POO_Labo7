package calculator;

class Subtract extends Operator {

    Subtract(State state) {
        super(state);
    }
    void execute() {
        // Subtract the last number from the second last number on the stack
        state.setCurrentValue(Double.toString(state.getStackVal() + Double.parseDouble(state.getCurrentValue())));
        state.setResult(true);
    }
}
