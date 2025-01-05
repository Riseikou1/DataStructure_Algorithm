package Structure;
import java.util.Stack;

public class Stacks {
    // stack  = LIFO data structure . Last-In , First-Out
    //     stores objects in to a sort of "vertical tower"
    //     push() to add to the top
    //     pop() to remove from the top
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Dota2");
        stack.push("Super Mario");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        String mypisda = stack.pop();  // ingeed variable ruu assign hiigeed,hadgalj boldog.
        System.out.println(stack);
        System.out.println(mypisda);
        System.out.println(stack.search("Skyrim")); // index -iig ni butsaana. hervee baihgui item search hiivel -1 return.
    }
}
    //    uses of stacks ?
    //  1. undo/redo features in text editors.
    //  2. moving back/forward through browser history
    //  3. backtracking algorithms (maze,file directories)
    //  4. calling functions (call stack)
