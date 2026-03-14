// Q:7 Detect a cycle in a linked list
// Time complexity = O(n) and Space complexity = O(1)

class Linkedlist_Problem9 {
Node head;
private String size;
  
// Constructor
 Linkedlist_Problem9(){
 this.size = 0;
}
  
// Nested class
  class Node{
   String data;
   Node next;
    
// Constructor
    Node(String data){
    this.data = data;
    this.next = null;
    size++;
    }
} 
  
// Add - last     --> By default
public void Add_Last(String data){
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
public boolean Cycle(Node head){
// Corner case
  if (head==null){
    return false;
  }
  
  Node Slow = head;
  Node Fast = head;
  while (Fast!=null && Fast.next!=null){
    Fast = Fast.next.next;
    Slow = Slow.next;
     if (Fast==Slow){
      return true;
      }
  }
  return false;
}  
  
 // Main method
public static void main(String[] args){
  
// Q:7 Solution
Linked_List_Advanced_Questions l3 = new Linked_List_Advanced_Questions();
l3.Add_Last("A");
l3.Add_Last("B");
l3.Add_Last("C");
l3.Add_Last("D");
l3.Add_Last("E");
l3.Add_Last("F");
  
System.out.println("\"Q:7\"");
System.out.println("\"List\"");
l3.Print_list();
  
System.out.println("Cycle exist in list (Status) : "+l3.Cycle(l3.head)); 
 
}
}
