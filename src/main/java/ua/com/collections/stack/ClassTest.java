package ua.com.collections.stack;
// Пример использования нового класса Stack{}:
public class ClassTest {
    public static void main(String[] args){
        ua.com.collections.stack.Stack<String> stack = new Stack<>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while(stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
