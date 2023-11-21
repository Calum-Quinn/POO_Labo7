package calculator;

import java.util.Objects;

public class Zero extends Operator{
    Zero(State state) {
        super(state);
    }
    void execute() {
        // Add a zero to the current value unless current value is simply 0
        String val = state.getCurrentValue();
        if (!Objects.equals(val, "0")) {
            state.setCurrentValue(val + "0");
        }
    }
}
