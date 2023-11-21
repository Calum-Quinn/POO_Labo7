package calculator;

class Backspace extends Operator {

    Backspace(State state) {
        super(state);
    }
    void execute() {
        // Remove the last digit from the current value
        String val = state.getCurrentValue();
        state.setCurrentValue(val.substring(0,val.length() - 1));
    }
}
