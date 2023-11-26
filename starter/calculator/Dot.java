package calculator;

public class Dot extends Operator{
    Dot(State state) {
        super(state);
    }

    void execute() {
        // Add a dot to the current value if there isn't already one in the value
        if (state.currentValue.indexOf('.') == -1 && !state.hasError) {
            state.currentValue += '.';
        }
    }
}
