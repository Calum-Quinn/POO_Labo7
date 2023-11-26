package calculator;

import java.util.Objects;

class Digit extends Operator {

    String number;

    Digit(State state, int number) {
        super(state);
        this.number = Integer.toString(number);
    }

    void execute() {
        if (state.hasError) {
            return;
        }

        // If the current value is the result from the previous calculation, add it to the stack unless it is 0
        if (state.hasResult && !state.isCurrentValueZero()) {
            state.stack.push(state.currentValue);
            state.clearCurrentValue();
        }

        // Add a new digit to the current value if not default 0
        if (state.isCurrentValueZero()) {
            state.currentValue = number;
        } else {
            state.currentValue += number;
        }
    }
}
