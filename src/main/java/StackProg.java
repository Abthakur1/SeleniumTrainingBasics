import java.util.Stack;

public class StackProg {
            public static void main(String[] args)
        {

            Stack<Integer> stack=new Stack<>();

            stack.push(100);
            stack.push(200);
            stack.push(300);


            System.out.println("Top element:"+stack.peek());


            int poppedElement=stack.pop();
            System.out.println("Popped element:"+poppedElement);

            System.out.println("Is stack empty?"+stack.isEmpty());

            System.out.println("Stack size:"+stack.size());

            System.out.println("Stack elements:");
            for (Integer element:stack)
            {
                System.out.println(element);
            }
        }
    }
