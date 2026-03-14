// Q:4 Remove duplicates nodes from the sorted linked list
// Time complexity = O(n) and Space complexity = O(1)

class Linkedlist_Problem6 {
Node head;
private int size;
  
// Constructor
 Linkedlist_Problem6(){
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
  public Node Remove_Duplicates(Node head){
  // Corner cases
    if (head==null){
        return null;
    }
    if (head.next==null){
        return head;
    }
    
  // Create two pointers
    Node previous = head;
    Node temp = previous.next;
    int count = 0;
    while (temp!=null){
  // For checking duplicates
    if(temp.data == previous.data){
      temp = temp.next;
      count++;
      continue;
        }
      
  // Aheading pointers
    previous.next = temp;
    previous = temp;
    temp = temp.next;
    }
    
   if(count==0){
    System.out.println("Not any duplicates found in the list!");
    }
   previous.next = null;
   return head;
}
  
 //Main method
public static void main(String[] args){
// Q:4 Solution  
Linked_List_Problem_3 list_2 = new Linked_List_Problem_3();
  
list_2.Add_Last(1);
list_2.Add_Last(2);
list_2.Add_Last(3);
list_2.Add_Last(3);
list_2.Add_Last(5);
list_2.Add_Last(6);
list_2.Add_Last(7);
list_2.Add_Last(9);
  
System.out.println("\"List with Duplicates\"");
list_2.Print_list();
  
list_2.head = list_2.Remove_Duplicates(list_2.head);
System.out.println("\"List without Duplicates\"");
list_2.Print_list();
 
}
}
