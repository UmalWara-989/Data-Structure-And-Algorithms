// --Queue implementation from scratch using Linked list--

public class Queue_Implementation_2 {
 // Nested class
  static class Node{
  int data;
  Node next;

  Node(int data){
  this.data = data;
  this.next = null;
      }
    }

// Nested class
  static class Queue{
// Static variables
   static Node head = null;
   static Node tail = null;

 // Null check
   public static boolean isEmpty(){
    return (head==null && tail==null);
      }

 // Enqueue
// Time complexity = O(1)
  public static void add(int data){
   Node new_Node = new Node(data);

   if(isEmpty()){
    tail = head = new_Node;
          }
   else {
    tail.next = new_Node;
    tail = new_Node;
          }
        }

  // Dequeue
  // Time complexity = O(1)
   public static int remove(){
    // Corner case
  if (isEmpty()){
   System.out.println("Empty queue!");
    return -1;
            }

  int front = head.data;
   // Single element
   if (head==tail){
     tail = null;
      }

   head = head.next;
   return front;
        }

 // Peek
// Time complexity = O(1)
  public static int peek(){
  // Corner case
  if (isEmpty()){
    System.out.println("Empty queue!");
    return -1;
            }

  return head.data;
        }
    }

 // Main method
  public static void main(String[] args){
  Queue q3 = new Queue();

  q3.add(1);
  q3.add(3);
  q3.add(4);
  q3.add(5);

  System.out.println("\"Output\"");
  while (!q3.isEmpty()){
    System.out.println("  "+q3.peek());
    q3.remove();
        }
    }
}

