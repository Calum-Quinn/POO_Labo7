package calculator;

class PlusMinus extends Operator {

    PlusMinus(State state) {
        super(state);
    }
    void execute() {
        // Invert the sign of the current value
        state.setCurrentValue(Double.toString(-Double.parseDouble(state.getCurrentValue())));
    }
}
