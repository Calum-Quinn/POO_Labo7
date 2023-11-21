package calculator;

class Multiply extends Operator {

    Multiply(State state) {
        super(state);
    }
    void execute() {
        state.setVal(state.getVal() * state.getVal());
    }
}
