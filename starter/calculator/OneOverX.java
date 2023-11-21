package calculator;

class OneOverX extends Operator {

    OneOverX(State state) {
        super(state);
    }
    void execute() {
        // One divided by the current value
        state.setCurrentValue(Double.toString(1. / Double.parseDouble(state.getCurrentValue())));
    }
}
