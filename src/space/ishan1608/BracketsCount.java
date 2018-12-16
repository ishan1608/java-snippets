package space.ishan1608;

import java.util.Stack;

public class BracketsCount {
    public static void main(String[] args) {
        String input = "(a+(b*c))+(d/e)";
        int bracketsCount = 0;
        Stack<Integer> brackets = new Stack<>();

        int inputLength = input.length();
        for (int i = 0; i < inputLength; i++) {
            char symbol = input.charAt(i);
            if (symbol == '(') {
                bracketsCount += 1;
                System.out.print(String.format("%d ", bracketsCount));
                brackets.push(bracketsCount);
            } else if (symbol == ')') {
                int thisBracketCount = brackets.pop();
                System.out.print(String.format("%d ", thisBracketCount));
            }
        }
    }
}
