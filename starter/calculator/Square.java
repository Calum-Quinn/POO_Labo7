package calculator;

class Square extends Operator {

    Square(State state) {
        super(state);
    }
    void execute() {
        // Current value to the power of 2
        state.setCurrentValue(Double.toString(Math.pow(Double.parseDouble(state.getCurrentValue()),2)));
    }
}
