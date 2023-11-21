package calculator;

class Subtract extends Operator {

    Subtract(State state) {
        super(state);
    }
    void execute() {
        state.setVal(-state.getVal() + state.getVal());
    }
}
