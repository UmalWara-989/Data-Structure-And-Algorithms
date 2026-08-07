// Q:6 Check if a linked list is Palindrome
// Time complexity = O(n) and Space complexity = O(1)

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

// Actual Solution  
// Supporting methods
public Node Middle_Point(Node head){
 Node hare = head;
 Node turtle = head;
 while (hare.next!=null && hare.next.next!=null){
   hare = hare.next.next;
   turtle = turtle.next;
    }
    return turtle;
}
public Node Reverse(Node head){
  Node prev = null;
  Node current = head;
  
  while (current!=null){
    Node Next = current.next;
    current.next = prev;
    prev = current;
    current = Next;
    }
    return prev;
}
  
public boolean Palindrome(Node head){
// Corner case
  if (head==null || head.next==null){
    return true;
    }
  Node middle = Middle_Point(head);
  Node End_2nd_Hallf = Reverse(middle.next);
  Node Start_1st_Half = head;
  while (End_2nd_Hallf!=null){
  if (Start_1st_Half.data!=End_2nd_Hallf.data){
    return false;
        }
  Start_1st_Half = Start_1st_Half.next;
  End_2nd_Hallf = End_2nd_Hallf.next;
    }
  return true;
}  
  
 //Main method
public static void main(String[] args){
// Q:6 Solution
Linked_List_Advanced_Questions l3 = new Linked_List_Advanced_Questions();
  
l3.Add_Last("A");
l3.Add_Last("B");
l3.Add_Last("C");
l3.Add_Last("D");
l3.Add_Last("E");
l3.Add_Last("F");
  
System.out.println("\"Q:6\"");
System.out.println("\"List\"");
l3.Print_list();
  
System.out.println("Cycle exist in list (Status) : "+l3.Cycle(l3.head)); 
 
}
}
