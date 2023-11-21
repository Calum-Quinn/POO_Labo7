package calculator;

class OneOverX extends Operator {

    OneOverX(State state) {
        super(state);
    }
    void execute() {
        state.setVal(1 / state.getVal());
    }
}
