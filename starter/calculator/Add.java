package calculator;

class Add extends Operator {

    Add(State state) {
        super(state);
    }
    void execute() {
        state.setVal(state.getVal() + state.getVal());
    }
}
