// Q:3 Reverse linked list between two positions
// Time complexity = O(n) and Space complexity = O(1)

class Linkedlist_Problem5 {
Node head;
private int size;
  
// Constructor
 Linkedlist_Problem5(){
 this.size = 0;
}
  
// Nested class
  class Node{
   int data;
   Node next;
    
// Constructor
    Node(int data){
    this.data = data;
    this.next = null;
    size++;
    }
} 
  
// Add - last     --> By default
public void Add_Last(int data){
  Node new_node = new Node(data);
    if (head == null){
      head = new_node;
      return;
    }
  Node Current_node = head;
   while (Current_node.next != null){
    Current_node = Current_node.next;
    }
    Current_node.next = new_node;
}
  
// Print list
public void Print_list() {
  if(head == null){
    System.out.println("List is empty!");
    return;
    }
  Node Current_node = head;
  while (Current_node != null) {
    System.out.print(Current_node.data+" -> ");
    Current_node = Current_node.next;
    }
    System.out.println("Null");
}
  
// Size of the list
  public int Get_Size(){
    return size;
    }

// Actual Solution  
public Node Reverse_Between(Node head, int left, int right){
// Create a dummy node to mark the head of this list
  Node dummy = new Node(0);
  dummy.next = head;
  
// Make markers for current node and for the node before reversing
  Node left_node = dummy;
  Node Current_node = head;
  for (int i=0; i<left-1; i++){
    left_node = left_node.next;
    Current_node = Current_node.next;
  }
  
// Make a marker to node where we start reversing
  Node sublist_head = Current_node;
  Node Pre_node = null;
  
  for (int j=0; j<=right-left; j++){
    Node next_node = Current_node.next;
    Current_node.next = Pre_node;
    Pre_node = Current_node;
    Current_node = next_node;
  }
  
// Join the pieces
  left_node.next = Pre_node;
  sublist_head.next = Current_node;
  return dummy.next;
}  
  
 //Main method
public static void main(String[] args){
  
 Linked_List_Problem_3 list =   new Linked_List_Problem_3();
  
  // Q:3 Solution
   list.Add_Last(1);
   list.Add_Last(2);
   list.Add_Last(3);
   list.Add_Last(4);
   list.Add_Last(5);
   list.Add_Last(6);
   list.Add_Last(7);
  
   list.Print_list();
   list.head = list.Reverse_Between(list.head,1,6);
   list.Print_list();
  
   System.out.println(); 
}
}
