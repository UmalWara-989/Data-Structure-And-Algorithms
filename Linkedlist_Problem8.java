class Linkedlist_Problem8 {
Node head;
private String size;
  
// Constructor
 Linkedlist_Problem8(){
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
  
 //Main method
public static void main(String[] args){
  
 
}
}
