import java.util.LinkedList;

public class Linked_List_Problem1 {
  public static void main(String[] args){
    
// Finding the element in the linked list
 LinkedList<Integer> list = new LinkedList<Integer>();
    
 int execute = 0;
 list.add(1);
 list.add(5);
 list.add(9);
 list.add(7);
 list.add(8);
 list.add(2);
 list.add(7);
    
 for (int i=0; i<list.size(); i++){
    if(list.get(i) == 7){
     System.out.println("Element \'7\' found!");
     System.out.println("Its index is : "+ i);
     execute++;
  // Nested if
     if (execute==1){
      System.out.println("The 1st time appearance.");
      System.out.println();
    }
  // Nested if
     if(execute>1){
      System.out.println("The \'"+execute+"\' times appearance.");
      System.out.println();
    }
}
  if( i == (list.size()-1) && execute == 0){
    System.out.println("Oops! Element not found.");
    System.out.println();
} 
 }
    System.out.println("The total appearances : "+execute);
    System.out.println();
  }
}
