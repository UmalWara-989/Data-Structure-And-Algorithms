import java.util.Scanner;
import java.util.LinkedList;

public class Linked_list_project {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

// Lists declaration
 LinkedList<Integer> list1 = new LinkedList<Integer>();
 LinkedList<Float> list2 = new LinkedList<Float>();
 LinkedList<String> list3 = new LinkedList<String>();
 LinkedList<Double> list4 = new LinkedList<Double>();
 LinkedList<Character> list5 = new LinkedList<Character>();
 LinkedList<Byte> list6 = new LinkedList<Byte>();
 LinkedList<Boolean> list7 = new LinkedList<Boolean>();
   
 //  Simple project
 System.out.println("Note: Please! mention your name to start the program");
 String name = sc.nextLine();
 System.out.println();
 System.out.println("Welcome " + name + "! in the Linked list strategy ");
 System.out.print("Enter the size of the list : ");
 int length = sc.nextInt();
   
 //Arrays for Conflicting Data Types
 int arr_int[] = new int[length];
 int arr_float[] = new int[length];
 int arr_String[] = new int[length];
 int arr_double[] = new int[length];
 int arr_character[] = new int[length];
 int arr_byte[] = new int[length];
 int arr_boolean[] = new int[length];
 System.out.println();
   
 System.out.println("\"Main menu\"");
 System.out.println("Select your desired data type by their symbols");
 System.out.println("1. \'i\' -> int");
 System.out.println("2. \'f\' -> float");
 System.out.println("3. \'s\' -> String");
 System.out.println("4. \'d\' -> double");
 System.out.println("5. \'c\' -> character");
 System.out.println("6. \'by\' -> byte");
 System.out.println("7. \'b\' -> boolean");
 System.out.println();
 sc.nextLine();
 System.out.print("Enter the Data type for the list : ");
 String s2 = sc.nextLine();
 System.out.println();

 if (s2.equals("i") || s2.equals("f") || s2.equals("s") || s2.equals("d") || s2.equals("c") || s2.equals("by
  // Warning
    System.out.println("\"Note\": In case of any \'User provided value\', that mismatches to the selected d
    System.out.println(" Then, there will be automatically placed \'9\' as a default value at the particula
    System.out.println();
    System.out.println("Mention the values for each \'node\'");
    for (int i = 0; i < length; i++) {
        System.out.print("Enter value at node [" + i + "] : ");
   
// Conditional statement 
    if (s2.equals("i")) {
    try {
        int input = sc.nextInt();
        list1.addLast(input);
    } catch (RuntimeException e) {
        System.out.println("Warning! The value doesn't match to the selected \'Data Type\' ");
        arr_int[i] = 1;
        list1.add(9);
        sc.nextLine();
    }
  } else if (s2.equals("f")) {
    try {
        float input = sc.nextFloat();
        list2.addLast(input);
    } catch (RuntimeException e) {
        System.out.println("Warning! The value doesn't match to selected \'Data Type\' ");
        arr_float[i] = 1;
        list2.add(9f);
        sc.nextLine();
    }
  } else if (s2.equals("s")) {
    try {
        String input = sc.nextLine();
        list3.addLast(input);
    } catch (RuntimeException e) {
        System.out.println("Warning! The value doesn't match to the selected \'Data Type\' ");
        arr_String[i] = 1;
        list3.add("9");
        sc.nextLine();
    }
  } else if (s2.equals("d")) {
    try {
        double input = sc.nextDouble();
        list4.addLast(input);
    } catch (RuntimeException e) {
        System.out.println("Warning! The value doesn't match to the selected \'Data Type\' ");
        arr_double[i] = 1;
        list4.add(9d);
        sc.nextLine();
    }
  } else if (s2.equals("c")) {
    try {
        char input = sc.next().charAt(0);
        list5.addLast(input);
    } catch (RuntimeException e) {
        System.out.println("Warning! The value doesn't match to the selected \'Data Type\' ");
        arr_character[i] = 1;
        list5.add('9');
        sc.nextLine();
    }
  } else if (s2.equals("by")) {
    try {
        byte input = sc.nextByte();
        list6.addLast(input);
    } catch (RuntimeException e) {
        System.out.println("Warning! The value doesn't match to the selected \'Data Type\' ");
        arr_byte[i] = 1;
        list6.add((byte) 9);
        sc.nextLine();
    }
  } else if (s2.equals("b")) {
    try {
        boolean input = sc.nextBoolean();
        list7.addLast(input);
    } catch (RuntimeException e) {
        System.out.println("Warning! The value doesn't match to the selected \'Data Type\' ");
        System.out.println("In case of boolean! the index remains blank (empty)");
        arr_boolean[i] = 1;
        sc.nextLine();
    }
  } else {
    System.out.println("Invalid Type!");
    System.out.println("It doesn't exist");
}     
  
// Print list
   if (s2.equals("i")) {
    System.out.println();
    System.out.println("\"Integer list\"");
    for (int i = 0; i < list1.size(); i++) {
        System.out.print(list1.get(i) + " -> ");
    }
    System.out.println("null");
    System.out.println();
    System.out.println("\"Incompatibility\"");
    System.out.print("Status of Conflicting Data Type : ");
    for (int i=0; i<arr_int.length; i++){
        System.out.print(arr_int[i]+" ");
    }
} else if (s2.equals("f")) {
    System.out.println();
    System.out.println("\"Float list\"");
    for (int j = 0; j < list2.size(); j++) {
        System.out.print(list2.get(j) + " -> ");
    }
    System.out.println("null");
    System.out.println();
    System.out.println("\"Incompatibility\"");
    System.out.print("Status of Conflicting Data Type : ");
    for (int i=0; i<arr_float.length; i++){
        System.out.print(arr_float[i]+" ");
    }
} else if (s2.equals("s")) {
    System.out.println();
    System.out.println("\"String list\"");
    for (int k = 0; k < list3.size(); k++) {
        System.out.print(list3.get(k) + " -> ");
    }
    System.out.println("null");
    System.out.println();
    System.out.println("\"Incompatibility\"");
    System.out.print("Status of Conflicting Data Type : ");
    for (int i=0; i<arr_String.length; i++){
        System.out.print(arr_String[i]+" ");
    }
} else if (s2.equals("d")) {
    System.out.println();
    System.out.println("\"Double list\"");
    for (int l = 0; l < list4.size(); l++) {
        System.out.print(list4.get(l) + " -> ");
    }
    System.out.println("null");
    System.out.println();
    System.out.println("\"Incompatibility\"");
    System.out.print("Status of Conflicting Data Type : ");
    for (int i=0; i<arr_double.length; i++){
        System.out.print(arr_double[i]+" ");
    }
} else if (s2.equals("c")) {
    System.out.println();
    System.out.println("\"Character list\"");
    for (int m = 0; m < list5.size(); m++) {
        System.out.print(list5.get(m) + " -> ");
    }
    System.out.println("null");
    System.out.println();
    System.out.println("\"Incompatibility\"");
    System.out.print("Status of Conflicting Data Type : ");
    for (int i=0; i<arr_character.length; i++){
        System.out.print(arr_character[i]+" ");
    }
} else if (s2.equals("by")) {
    System.out.println();
    System.out.println("\"Byte list\"");
    for (int n = 0; n < list6.size(); n++) {
        System.out.print(list6.get(n) + " -> ");
    }
    System.out.println("null");
    System.out.println();
    System.out.println("\"Incompatibility\"");
    System.out.print("Status of Conflicting Data Type : ");
    for (int i=0; i<arr_byte.length; i++){
        System.out.print(arr_byte[i]+" ");
    }
} else if (s2.equals("b")) {
    System.out.println();
    System.out.println("\"Boolean list\"");
    for (int p = 0; p < list7.size(); p++) {
        System.out.print(list7.get(p) + " -> ");
    }
    System.out.println("null");
    System.out.println();
    System.out.println("\"Incompatibility\"");
    System.out.print("Status of Conflicting Data Type : ");
    for (int i=0; i<arr_boolean.length; i++){
        System.out.print(arr_boolean[i]+" ");
    }
}

else{
    System.out.println("Sorry! no valid choice");
}
sc.close();
}
}
