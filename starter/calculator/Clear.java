package calculator;

class Clear extends Operator {

    Clear(State state) {
        super(state);
    }
    void execute() {
        // Set the current value to ir's default 0 and empty the stack
        state.setCurrentValue("0");

        //VIDER LA PILE
    }
}
