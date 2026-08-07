// Linked list

public class Linkedlist_Construction {
  Node head;
  private int size;

// Constructor
Linkedlist_Construction(){
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

// User defined method
// Add - first
  public void Add_First(String data){
  Node New_Node = new Node(data);
  if (head == null){
   head = New_Node;
   return;
        }

  New_Node.next = head;
  head = New_Node;
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
// Delete First
  public void Delete_First(){
// Corner case
  if(head == null){
    System.out.println("List is empty!");
    return;
       }
  size--;
  head = head.next;
    }
// Delete Last
   public void Delete_last(){
// Corner cases
   if(head == null){
    System.out.println("List is empty!");
    return;
        }
    size--;
    if (head.next == null){
      head = null;
      return;
        }

Node Second_last = head;
Node last_Node = head.next;

// Traversed along the list
   while (last_Node.next != null){
    last_Node = last_Node.next;
    Second_last = Second_last.next;
        }

    Second_last.next = null;
    }
// Size of the list
   public int Get_Size(){
    return size;
    }

// Insert in middle of the list
   public void Middle_Addition(int index, String data) {
    if(index > size || index < 0) {
      System.out.println("Invalid Index!");
      return;
        }
    size++;


  Node newNode = new Node(data);
  if(head == null || index == 0) {
    newNode.next = head;
    head = newNode;
    return;
        }
  Node currNode = head;
  for(int i=1; i<size; i++) {
   if(i == index) {
    Node nextNode = currNode.next;
    currNode.next = newNode;
    newNode.next = nextNode;
    break;
            }
  currNode = currNode.next;
        }
    }
// Reverse list
   public void Reverse_Iterate(){
// Corner case
   if(head==null || head.next==null){
    return;
        }

   Node Previous_node = head;
   Node Current_node = head.next;
   while (Current_node!=null){
    Node Next_node = Current_node.next;
    Current_node.next = Previous_node;

// Update
  Previous_node = Current_node;
  Current_node = Next_node;
      }
  head.next = null;
  head = Previous_node;
    }
  public Node Reverse_Recursion(Node head){
// Corner case
  if(head==null || head.next==null){
  return head;
       }

Node new_node = Reverse_Recursion(head.next);
head.next.next = head;
head.next = null;

return new_node;
    }

// Main method
  public static void main(String[] args){
       
  Linkedlist_Construction list = new Linkedlist_Construction();

  //Passing values in the list dynamically
    System.out.print("Enter first string : ");
    String s1 = sc.nextLine();
    list.Add_First(s1);

    System.out.print("Enter second string : ");
    String s2 = sc.nextLine();
        list.Add_First(s2);

    System.out.print("Enter third string : ");
    String s3 = sc.nextLine();
    list.Add_First(s3);
    System.out.println();

  //Print list
    System.out.println("\"Linked list\"");
    list.Print_list();
    System.out.println("List size : "+list.size);
    System.out.println();

  //Again passing values in the list
    System.out.print("Enter the string whose position will be at the last of the list : ");
    String s4 = sc.next();
    System.out.println("\"Updated Linked list\"");
    list.Add_Last(s4);
    list.Print_list();
    System.out.println("List size : "+list.size);
    System.out.println();

    list.Add_First("I -> am");
    list.Print_list();
    System.out.println("List size : "+list.size);
    System.out.println();

  //Delete values from the list
    System.out.println("\"Again updated list \"");
    list.Delete_First();
    list.Print_list();
    System.out.println("List size : "+list.size);
    System.out.println();

  //last value deleted
    System.out.println("\'Removing last value from the list\'");
    list.Delete_last();
    list.Print_list();
    System.out.println("List size : "+list.size);
    System.out.println();

  //Size of the list
    System.out.println("\"List Size\"");
    System.out.println("List size : "+list.size);
    System.out.println();

  //Insert in the middle of the list
    System.out.println("\"Inserted List\"");
    sc.nextLine();
    System.out.print("Enter particular index : ");
    int index = sc.nextInt();

    list.Middle_Addition(index,"Updated");
    list.Print_list();
    System.out.println();

//  Reverse List
    Linkedlist_Construction list_2 = new Linkedlist_Construction();
    list_2.Add_Last("Umal");
    list_2.Add_Last("Wara");
    list_2.Add_Last("Joe");
    list_2.Add_Last("Dalton");
    list_2.Add_Last("Roy");
    System.out.println("\"Original list\"");
    list_2.Print_list();

// Reverse through Iteration
    System.out.println("\"Reversed list\"");
    list_2.Reverse_Iterate();
    list_2.Print_list();

// Reverse through Iteration
    list_2.head = list_2.Reverse_Recursion(list_2.head);
    list_2.Print_list();

    }
}
