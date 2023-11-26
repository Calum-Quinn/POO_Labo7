package calculator;

import java.util.Scanner;

public class Calculator {
    private final State state = new State();

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("java Calculator");
        do {
            System.out.print("> ");
            input = scanner.nextLine();
            calculator.processInput(input);
        } while (!input.equals("exit"));
    }

    private void processInput(String input) {
        if (input.matches("-?\\d+(\\.\\d+)?")) {
            // If the input is a number, we set the current value to this number
            double number = Double.parseDouble(input);
            state.currentValue = Double.toString(number);
        } else {
            // If the input is not a number, we check if it is an operator
            switch (input) {
                case "+":
                    state.stack.pop();
                    new Add(state).execute();
                    break;
                case "-":
                    state.stack.pop();
                    new Subtract(state).execute();
                    break;
                case "*":
                    state.stack.pop();
                    new Multiply(state).execute();
                    break;
                case "/":
                    state.stack.pop();
                    new Divide(state).execute();
                    break;
                case "sqrt":
                    state.stack.pop();
                    new SquareRoot(state).execute();
                    break;
                case "square":
                    state.stack.pop();
                    new Square(state).execute();
                    break;
                case "oneover":
                    state.stack.pop();
                    new OneOver(state).execute();
                    break;
                case "negate":
                    state.stack.pop();
                    new Negate(state).execute();
                    break;
                case "store":
                    state.stack.pop();
                    new MemoryStore(state).execute();
                    // If the stack is empty, we don't print it
                    if (state.stack.isEmpty()) {
                        return;
                    }
                    break;
                case "recall":
                    new MemoryRecall(state).execute();
                    break;
                case "clear":
                    new Clear(state).execute();
                    return;
                case "exit":
                    return;
                default:
                    System.out.println("Erreur : Entrée non valide");
                    return;
            }
        }

        if (!state.isCurrentValueZero()) {
            // If the current value is not 0, we add it to the stack
            state.stack.push(state.currentValue);
            System.out.println(state.stack);
        } else if (!state.stack.isEmpty()) {
            // If the current value is 0 and the stack is not empty, we print the stack
            System.out.println(state.stack);
        }
    }
}
