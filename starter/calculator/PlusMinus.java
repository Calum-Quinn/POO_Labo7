package calculator;

class PlusMinus extends Operator {

    PlusMinus(State state) {
        super(state);
    }
    void execute() {
        state.setVal(-state.getVal());
    }
}
