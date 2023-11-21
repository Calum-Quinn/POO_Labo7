package calculator;

class Divide extends Operator {

    Divide(State state) {
        super(state);
    }
    void execute() {
        state.setVal(1 / state.getVal() * state.getVal());
    }
}
