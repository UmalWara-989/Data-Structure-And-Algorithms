import java.util.ArrayList;

// -- Stack Implementation from scratch using ArrayList --

public class Stack_Arraylist {
//  Static class
static class Stacking{
  static ArrayList<String> l1 = new ArrayList<>();
  
 //  Empty Check
  public static boolean isEmpty(){
    return l1.size()==0;
  }
  
//  Push
  public static void push(String data){
    l1.add(data);
  }
  
//  Pop
  public static String pop(){
  // Corner case
    if (isEmpty()){
      return "null";
     }
  String top = l1.get(l1.size()-1);
    l1.remove(l1.size()-1);
    return top;
  }
  
  //  Peek
public static String peek(){
  // Corner case
    if (isEmpty()){
     return "null";
    }
  return l1.get(l1.size()-1);
}
}

 public static void main(String[] args){
    Stacking s2 = new Stacking();
   
    s2.push("Umal");
    s2.push("John");
    s2.push("Roy");
    s2.push("Tenison");
    s2.push("Ben");
   
    System.out.println("\"Stack implementation using Arraylist\"");
    while (!s2.isEmpty()){
        System.out.println(s2.peek());
        s2.pop();
    }
  
}
}
