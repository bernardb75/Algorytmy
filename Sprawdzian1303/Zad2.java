import java.util.Stack;

public class Zad2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String input = "(2*((3.4 - (-7)/2)*(a-2)/(b-1))";

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(')
                stack.push("(");
            else if(input.charAt(i) == ')')
                stack.pop();
        }

        System.out.println(stack.empty() ? "Dobrze spraowane nawiasy" : "Błędnie sparowane nawiasy");

    }
}
