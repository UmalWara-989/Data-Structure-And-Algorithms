import java.util.LinkedList;

public class Linked_List_Problem2 {
  public static void main(String[] args){
    
// Removing unsatisfied values from the list
   LinkedList<Integer> list_2 = new LinkedList<Integer>();
    
    int n = 5;
    int count = 0;
    int arr[] = new int[n];
    
// User input
  System.out.println("Note: Mention values in range between 1 to 50.");
  for (int i=0; i<n; i++){
    System.out.print("Enter value at index "+i+" : ");
    list_2.add(sc.nextInt());
}
    
// Original list
  System.out.println("\"Original List\"");
  for (int i=0; i<list_2.size(); i++){
    System.out.print(list_2.get(i)+" -> ");
}
  System.out.println("null");
    
// Delete nodes, having value greater than 25
 for (int j=0; j<list_2.size(); j++){
    if(list_2.get(j) > 25){
      count++;
      if(count==1){
      arr[j] = 1;}
      else if (count==2){
      arr[j+1] = 1;
      }
      else if (count==3){
      arr[j+2] = 1;
        }
      else if (count==4){
      arr[j+3] = 1;
        }
      else if (count==5){
      arr[j+4] = 1;
        }
      list_2.remove(j);
        j--;
    }
}
// Modified list
  System.out.println("\"Modified List\"");
  for (int k=0; k<list_2.size(); k++){
    System.out.print(list_2.get(k)+" -> ");
}
  System.out.println("null");
    
// Array for specification
  System.out.println("\"Array Visualization of removed values\"");
  for (int l=0; l<arr.length; l++){
  System.out.print(arr[l]+" ");
}
  System.out.println();
  System.out.println();
  System.out.println("The number of removed values : "+count);
  sc.close();  
  }
}
