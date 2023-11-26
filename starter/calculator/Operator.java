package calculator;

abstract class Operator {
    State state;

    Operator(State state) {
        this.state = state;
    }

    abstract void execute();
}
