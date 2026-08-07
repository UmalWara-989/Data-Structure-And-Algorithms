import java.util.Stack;

// Q:1 Implement Queue using 2 Stacks

public class Queue_Problem {

//  Nested class
static class Queue{
 static Stack<Integer> s1 = new Stack<>();
 static Stack<Integer> s2 = new Stack<>();

 // Null check
public static boolean isEmpty(){
  return s1.isEmpty();
    }

// Time Complexity = O(n)
// Enqueue
 public static void add(int data){
 // Move data from stack1 to stack2
    while (!s1.isEmpty()){
     s2.push(s1.pop());
      }

  s1.push(data);
// Move data from stack2 to stack1
  while (!s2.isEmpty()){
    s1.push(s2.pop());
        }
    }

// Time Complexity = O(1)
// Dequeue
  public static int remove(){
   return s1.pop();
    }

// Time Complexity = O(1)
// Peek
 public static int peek(){
  return s1.peek();
    }
}

//  Main method
public static void main(String[] args){
  Queue q5 = new Queue();

  q5.add(1);
  q5.add(2);
  q5.add(3);
  q5.add(4);

  System.out.println("\"Output\"");
  while (!q5.isEmpty()){
    System.out.println("  "+q5.peek());
     q5.remove();
        }
  
    }
}
