public class Demo {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;

        // Push
        stack[++top] = 10;
        stack[++top] = 20;
        stack[++top] = 30;

        // Pop
        System.out.println("Popped: " + stack[top--]);

        // Display
        System.out.println("Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}