// Q:2 Remove nth node from end of the list
// Time Complexity = O(n)  , Space Complexity = O(1)

class Linkedlist_Problem4 {
  Node head;
  private int size;

// Constructor
  Linkedlist_Problem4(){
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
  public Node Remove_nth_Node(Node head, int n){
    // Dummy node
    Node Dummy = new Node(0);
    Dummy.next = head;
    // Two pointers
    Node ptr1 = Dummy;
    Node ptr2 = Dummy;
    // Move 2nd pointer n spaces ahead
    for (int i=0; i<n; i++){
        ptr2 = ptr2.next;
    }
    // Move both now, until the next of ptr2 is null
    while (ptr2.next!=null){
        ptr1 = ptr1.next;
        ptr2 = ptr2.next;
    }
    // Now we have to remove the node next of ptr1
    ptr1.next = ptr1.next.next;
    return Dummy.next;
}


    //Main method
    public static void main(String[] args){
      
    // Q:2 Solution
      System.out.println("\"Q:2\"");
      Linked_List_Problem_2 list_2 = new Linked_List_Problem_2();
      list_2.Add_Last(2);
      list_2.Add_Last(4);
      list_2.Add_Last(6);
      list_2.Add_Last(8);
      list_2.Add_Last(10);
      list_2.Add_Last(12);
      
  // System.out.println("\"Original list\"");
     list_2.Print_list();
     list_2.head = list_2.Remove_nth_Node(list_2.head,4);
     System.out.println("\"Modified list\"");
     list_2.Print_list();

    }
}
