// Q:1 Swap every two adjacent nodes
// Time Complexity = O(n)  , Space Complexity = O(1)

class Linkedlist_Problem3 {
  Node head;
  private int size;

// Constructor
  Linkedlist_Problem3(){
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

  // Solution
  // Swapping adjacent nodes
    public Node Swap_list(Node head){
  // Create a dummy nodes to ease things
     Node dummy = new Node(0);
     dummy.next = head;
     Node point = dummy;

  // Ensure nodes we are swapping is not null
      while (point.next != null && point.next.next != null){
    // Identify nodes to swap
        Node swap1 = point.next;
        Node swap2 = point.next.next;

    // Actually swap
       swap1.next = swap2.next;
       swap2.next = swap1;

    // Prepare for next
       point.next = swap2;
       point = swap1;
      }
      return dummy.next;
    }


    //Main method
    public static void main(String[] args){
      System.out.println("\"Q:1\"");
      Linked_List_Problem_2 list = new Linked_List_Problem_2();

      list.Add_Last(1);
      list.Add_Last(2);
      list.Add_Last(3);
      list.Add_Last(4);
      list.Add_Last(5);
      list.Add_Last(6);
      list.Add_Last(7);
      list.Add_Last(8);

      System.out.println("\"Original list\"");
      list.Print_list();
      list.head = list.Swap_list(list.head);
      System.out.println("\"Swapped list\"");
      list.Print_list();
      System.out.println();


    }
}
