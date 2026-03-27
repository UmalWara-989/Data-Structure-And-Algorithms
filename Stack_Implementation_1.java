// -- Stack Implementation from scratch using Linkedlist --

public class Stack_Implementation_1 {
//  Static class
static class Node{
 int data;
 Node next;
// Constructor
public Node(int data){
    this.data = data;
    next = null;
}
}
  
// Stack class
static class Stacker{
 public static Node head;
  
//  Void Check
public static boolean isEmpty(){
    return head==null;
}
  
//  Push
public static void push(int data){
  Node new_Node = new Node(data);
  if (isEmpty()){
      head=new_Node;
      return;
  }
  new_Node.next = head;
  head = new_Node;
}
  
//  Pop
public static int pop(){
  if (isEmpty()){
      return -1;
  }
  int top = head.data;
  head = head.next;
  return top;
}
  
 // Peek
public static int peek(){
  if (isEmpty()){
     return -1;
    }
  return head.data;
}
}
  
public static void main(String[] args){
 Stacker s1 = new Stacker();
  
    s1.push(1);
    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.push(5);
  
System.out.println("\"Stack implementation using Linkedlist\"");
while (!s1.isEmpty()){
    System.out.println(s1.peek());
    s1.pop();
}
  
}
}
