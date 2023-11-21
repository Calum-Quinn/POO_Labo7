package calculator;

class Square extends Operator {

    Square(State state) {
        super(state);
    }
    void execute() {
        state.setVal(Math.pow(state.getVal(),2));
    }
}
