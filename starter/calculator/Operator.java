package calculator;

abstract class Operator
{
  State state;

  Operator() {
    this.state = new State();
  }
  Operator(State state) {
    this.state = state;
  }
  abstract void execute();
}
