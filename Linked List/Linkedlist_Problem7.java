// Q:5 Find And delete the nth node from the end of linked list

class Linkedlist_Problem7 {
Node head;
private String size;
  
// Constructor
 Linkedlist_Problem7(){
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
 public Node Delete_nthNode(Node head, int n){
  // Corner case
  if (n > size || n <= 0) {
    System.out.println("Invalid index!");
    return head;
    }
  if (head.next==null){
        return null;
    }
   
  //Size
  int size = 0;
  Node current_Node = head;
  while (current_Node!=null){
    current_Node = current_Node.next;
    size++;
  }
  // Corner case
  if (n==size){
      return head.next;
  }
   
  int Search = size-n;
  Node prev = head;
  int i = 1;
  while (i<Search){
    prev = prev.next;
    i++;
  }
   
  System.out.println("Value at index "+(size-n)+" is : \'"+prev.next.data+"\'");
  prev.next = prev.next.next;
   
  return head;
} 
  
 //Main method
public static void main(String[] args){
  
// Q:5 Solution
Linked_List_Advanced_Questions list = new Linked_List_Advanced_Questions();
list.Add_Last("Umal");
list.Add_Last("wara");
list.Add_Last("John");
list.Add_Last("Tom");
list.Add_Last("Seimon");
list.Add_Last("Roy");
  
System.out.println("\"Q:5\"");
System.out.println("\"Original List\"");
list.Print_list();
  
list.head = list.Delete_nthNode(list.head,4);
System.out.println("\"Modified List\"");
list.Print_list();
  
System.out.println();
  
  
}
}
