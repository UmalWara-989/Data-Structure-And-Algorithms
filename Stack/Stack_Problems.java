import java.util.Stack;

// Q:1 push at the bottom of Stack
// Q:2 Reverse a Stack

public class Stack_Problems {
// --- Q:1 and Q:2 Solution method ---
public static void push_at_bottom(int data, Stack<Integer> s){
 //  Base case
  if (s.isEmpty()){
   s.push(data);
   return;
    }
  int top = s.pop();
  push_at_bottom(data,s);
  s.push(top);
     }

// -- Q:2 solution method --
  public static void reverse(Stack<Integer> s){
  // Base case
    if (s.isEmpty()){
     return;
       }

   int top = s.pop();
   reverse(s);
   push_at_bottom(top,s);
    }
  
// Main method
  public static void main(String[] args){
    // - With Collection Frameworks -
   System.out.println("\"Stack implementation using Frameworks\"");
   Stack<Integer> s3 = new Stack<>();

   s3.push(1);
   s3.push(2);
   s3.push(3);
   s3.push(4);
   s3.push(5);

  while (!s3.isEmpty()){
   System.out.println("    |"+s3.peek()+"|   ");
   s3.pop();
        }
  System.out.println("    ___   ");
  System.out.println();

// Q#: push at the bottom of Stack
  System.out.println("Q:1 Solution");
  Stack<Integer> s = new Stack<>();

  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4);

 System.out.println("Stack before addition");
 while (!s.isEmpty()){
   System.out.println("    |"+s.peek()+"|   ");
   s.pop();
        }
 System.out.println("    ___   ");
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4);

 System.out.println("Stack after addition at bottom");
 push_at_bottom(5,s);
  while (!s.isEmpty()){
   System.out.println("    |"+s.peek()+"|   ");
   s.pop();
        }
  System.out.println("    ___   ");
  System.out.println();

// Q#: Reverse a Stack 
  System.out.println("Q:2 Solution");
  Stack<Integer> s1 = new Stack<>();

  s1.push(2);
  s1.push(4);
  s1.push(6);
  s1.push(8);

  System.out.println("Stack before reverse");
    while (!s1.isEmpty()){
     System.out.println("    |"+s1.peek()+"|   ");
     s1.pop();
        }
  System.out.println("    ___   ");
  s1.push(2);
  s1.push(4);
  s1.push(6);
  s1.push(8);

  System.out.println("Stack after reverse");
  reverse(s1);
  while (!s1.isEmpty()){
    System.out.println("    |"+s1.peek()+"|   ");
    s1.pop();
        }
  System.out.println("    ___   ");
  System.out.println();
    }
}
