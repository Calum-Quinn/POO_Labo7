package calculator;

class Squareroot extends Operator {

    Squareroot(State state) {
        super(state);
    }
    void execute() {
        // Squareroot of the current value
        state.setCurrentValue(Double.toString(Math.sqrt(Double.parseDouble(state.getCurrentValue()))));
    }
}