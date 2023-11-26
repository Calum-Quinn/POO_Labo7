package calculator;

import java.util.Objects;

class OneOverX extends Operator {
    OneOverX(State state) {
        super(state);
    }
    
    void execute() {
        if (state.hasError) {
            return;
        }

        if (state.isCurrentValueZero()) {
            state.hasError = true;
            state.currentValue = "Cannot divide by zero";
            return;
        }

        // One divided by the current value
        state.currentValue = Double.toString(1 / Double.parseDouble(state.currentValue));
        state.hasResult = true;
    }
}
