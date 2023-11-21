package calculator;

class Squareroot extends Operator {

    Squareroot(State state) {
        super(state);
    }
    void execute() {
        state.setVal(Math.sqrt(state.getVal()));
    }
}