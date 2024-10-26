import java.util.*;
import java.util.Stack;

/**
 * sortingStack
 */
public class sortingStack {
    public static void sorting(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        } else {
            int temp = st.get(st.size() - 1);
            st.pop();
            sorting(st);
            insertelement(st, temp);
        }
    }

    public static void insertelement(Stack<Integer> s, int temp) {
        if (s.size() == 0 || s.get(s.size() - 1) <= temp) {
            s.push(temp);
            return;
        } else {
            int val = s.get(s.size() - 1);
            s.pop();
            insertelement(s, temp);
            s.push(val);
        }
    }

    public static void main(String[] arg) {
        Stack st = new Stack<>();
        Scanner sc= new Scanner(System.in);    
        System.out.print("Enter the number of the element of the stack: ");
        int n=sc.nextInt();
        System.out.print("Enter of the element of the stack: ");
        for(int i=0; i<n ; i++){
            int element = sc.nextInt();
            st.push(element);
        }
      sortingArray.sort(st);
      System.out.print("The sorted stack: ");
      for (Object object : st) {
        System.out.print(object+" ");
      }
        
    }

}
