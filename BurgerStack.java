import java.util.Stack;

public class BurgerStack {
    public static void main(String[] args) {
        Stack<String> burgerStack = new Stack<>();
        
        burgerStack.push("Beef Patty");
        burgerStack.push("Lettuce");
        burgerStack.push("Tomato");
        
        while (!burgerStack.isEmpty()) {
            System.out.print(burgerStack.pop() + " ");
        }
        // Output: Tomato Lettuce Beef Patty
    }
}
