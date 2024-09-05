
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string of Parenthesis '( )' '{ }' ''[ ] : ");
        String s = sc.nextLine();

        System.out.println("Your String : " + s);

        Boolean result = isValid(s);

        if (result) {
            System.out.print("Yess! it is a Valid Parenthesis");
        } else {
            System.out.print("NO! it is NOT Valid Parenthesis");
        }
        
        sc.close();
    }

    
        public static boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
    
            for (int i = 0; i < s.length(); i++) {
                char curr = s.charAt(i);
                if(st.isEmpty()) {
                    st.push(curr);
                    continue;
                }
                if (curr == '(' || curr == '{' || curr == '[') {
                    st.push(curr);
                } else {
                    char top = st.peek(); 
                    if (curr == ')' && top == '(' ||
                        curr == '}' && top == '{' ||
                        curr == ']' && top == '[' ){
                            st.pop();
                        }else{
                            return false;
                        }
                }
            }
        return st.isEmpty();
    
        }
    
}


