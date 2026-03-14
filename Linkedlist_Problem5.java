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
