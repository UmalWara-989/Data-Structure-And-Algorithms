//Small memory consumption as compared to "Merge Sort" because there is no need of extra array

public class Quick_Sort {

//Time Complexity -> Worst case O(n*n)
//Worst case occurs when pivot is always the smallest or the largest element

//Time Complexity -> Average case O(nlog n)
  public static int Partition(int Quick[], int low, int high){
  int pivot = Quick[high];
  int i = low-1;

  for(int j=low; j<high; j++){
  if(Quick[j]<pivot){     //-->From here developer can alter the order wheather or descending
  i++;

  //Swap                   -->For left side elements of the pivot
   int temp = Quick[i];
   Quick[i] = Quick[j];
   Quick[j] = temp;
         }
        }
    i++;
    //Swap                 -->For right side elements of the pivot
    int temp = Quick[i];
    Quick[i] = pivot;
    Quick[high] = temp;
    return i;       //Pivot index
    }

  public static void Quick_Sort(int Quick[], int low, int high){
  if(low<high){
  int pivot_index = Partition(Quick, low, high);

  //Recursive call
   Quick_Sort(Quick,low,pivot_index-1);    //-->Left side of pivot
   Quick_Sort(Quick,pivot_index+1,high);   //-->Right side of pivot
        }
    }

  //Main Method
  public static void main(String[] args){
  //Unsorted Array
  int[] Quick = {6,3,9,5,2,8};
  int n = Quick.length;

   //Print
   System.out.println("\"Unsorted Array\"");
   for (int i=0; i<n; i++){
   System.out.print(Quick[i]+" ");
        }
   System.out.println();
   System.out.println();


   //Methods call
    Quick_Sort(Quick,0,n-1);

   //Print
    System.out.println("\"Sorted Array\"");
    for (int i=0; i<n; i++){
    System.out.print(Quick[i]+" ");
       }
    }
}
