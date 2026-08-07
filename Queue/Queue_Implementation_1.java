import java.util.Scanner;

// --- Queue implementation from scratch using Array ---

public class Queue_Implementation_1 {
  
// Nested class
static class Queue{
// Static variables
   static int arr[];
   static int size;
   static int rear = -1;

// Constructor
  Queue(int n){
   arr = new int[n];
   this.size = n;
    }
  
 // Null check
  public static boolean isEmpty(){
    return rear==-1;
    }

 // Enqueue
 // Time complexity = O(1)
  public static void add(int data){
    // Corner case
     if (rear == size-1){
      System.out.println("Full queue!");
      return;
      }

   rear++;
   arr[rear] = data;
    }

// Dequeue
// Time complexity = O(n)
  public static int remove(){
  // Corner case
  if (isEmpty()){
   System.out.println("Empty queue!");
   return -1;
        }

 int front  = arr[0];
 for (int i=0; i<rear; i++){
   arr[i] = arr[i+1];
        }
 rear--;

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

   return arr[0];
    }
    }

//  Main method
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the size of array : ");
   int length = sc.nextInt();

   Queue q1 = new Queue(length);
   System.out.println("Note: Queue Range (1 - "+length+")");

   System.out.print("How many number of values do you want in queue : ");
   int n = sc.nextInt();

//  Elements input
   for (int j=0; j<n; j++){
     System.out.print("Enter value "+(j+1)+" : ");
     q1.add(sc.nextInt());
        }
  System.out.println();

// output
  System.out.println("\'Outcome\'");
   while (!q1.isEmpty()){
     System.out.println(q1.peek());
     q1.remove();
        }  
        sc.close();
    }
}
