package calculator;

import java.util.Objects;

class Digit extends Operator {

    private String number;

    Digit(State state, int number) {
        super(state);
        this.number = Integer.toString(number);
    }

    void execute() {
        // If the current value is the result from a previous calculation, add it to the stack
        String val = state.getCurrentValue();
        if (state.isResult()) {
            state.setStackVal(Double.parseDouble(val));
            state.setResult(false);
        }

        // Add a new digit to the current value if not 0
        if (Objects.equals(val, "0")) {
            state.setCurrentValue(number);
        }
        else {
            state.setCurrentValue(val + number);
        }
    }
}
