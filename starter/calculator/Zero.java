package calculator;

import java.util.Objects;

public class Zero extends Operator{
    Zero(State state) {
        super(state);
    }

    void execute() {
        // Add a zero to the current value unless current value is 0
        if (!Objects.equals(state.currentValue, "0") && !state.hasError) {
            state.currentValue += "0";
        }
    }
}
