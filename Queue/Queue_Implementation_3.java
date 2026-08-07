import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Queue implementation with Collection Frameworks
// Queue is an interface and linked list, array dequeue are classes that implements it.

public class Queue_Implementation_3 {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
// Queue<Boolean> q4 = new LinkedList<>();
   Queue<Boolean> q4 = new ArrayDeque<>();       // --> Alternative option

//  Situations
    String name = "Uaml wara";
    int age = 18;
    String Profession = "Software Engineer";
    String Post = "Student";

  q4.add(name=="John");
  q4.add(age!=18);
  q4.add(Profession=="Software Engineer");
  q4.add(Post=="Project Manager");

  while (!q4.isEmpty()){
    System.out.println(q4.peek());
    q4.remove();
        }

  sc.close();
    }
}
