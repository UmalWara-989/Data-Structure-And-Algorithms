import java.util.Scanner;

// --- Implementation of Circular Queue using Array ---

public class Circular_Queue {

 // Nested class
  static class Queue{
 // Static variables
   static int arr[];
   static int size;
   static int front = -1;
   static int rear = -1;

// Constructor
  Queue(int n){
    arr = new int[n];
    this.size = n;
        }
    
// Null check
 public static boolean isEmpty(){
  return (rear==-1 && front==-1);
        }
    
// Full check
  public static boolean isFull(){
  return (rear+1) % size == front;
        }

// Enqueue
// Time complexity = O(1)
public static void add(int data){
 // Corner case
   if (isFull()){
    System.out.println("Full queue!");
    return;
            }

// 1st element add
  if (front==-1){
    front=0;
            }
  rear = (rear+1) % size;
  arr[rear] = data;
        }

// Dequeue
// Time complexity = O(1)
  public static int remove(){
  // Corner case
  if (isEmpty()){
    System.out.println("Empty queue!");
    return -1;
        }

int result  = arr[front];
// Single element condition
 if (front==rear){
   rear = front = -1;
  }else {
  front = (front+1) % size;
            }
  return result;
        }

  // Peek
 // Time complexity = O(1)
   public static int peek(){
    // Corner case
     if (isEmpty()){
      System.out.println("Empty queue!");
      return -1;
            }

    return arr[front];
        }
    }

// Main method
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
//   Size of array
    System.out.print("Enter the size of array : ");
    int length = sc.nextInt();

    Queue q2 = new Queue(length);
    System.out.println("Note: Queue Range (1 - "+length+")");

//   System.out.print("How many number of values do you want in queue : ");
//   int n = sc.nextInt();

//  Elements input
    for (int j=0; j<length; j++){
      System.out.print("Enter value "+(j+1)+" : ");
      q2.add(sc.nextInt());
        }
    System.out.println();

  System.out.print("Enter the value whose index you are going to know : ");
  int index = sc.nextInt();

// Find index of specific value in Queue
  int found = 0;
  int i = Queue.front;
  while (true){
  // value condition
     if (Queue.arr[i] == index ){
      System.out.println("index : "+i);
      found++;
       break;
            }

   // Reach at last
  if (i == Queue.rear) {
     if(found==0){
       System.out.println("Not found!");
       break;
                }
    break;
            }

  // Going ahead
    i = (i+1)%Queue.size;
        }
  System.out.println();

//  output
  System.out.println("\'Outcome\'");
  while (!q2.isEmpty()){
    System.out.println("  "+q2.peek());
    q2.remove();
        }

sc.close();
    }
}
