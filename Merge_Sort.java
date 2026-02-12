//Large memory consumption because of additional array as compared to "Quick Sort"

public class Merge_Sort {
//Time complexity(whole) = nlogn
  
//Time complexity = n
//To conquer (To bind)
public static void conquer(int[] values, int si, int mid, int ei){
  int merged[] = new int[(ei-si)+1];
  int ind_1 = si;
  int ind_2 = mid+1;
  int x = 0;
  
  //Comparing both arrays
  while (ind_1<=mid && ind_2<=ei){
  if (values[ind_1]<=values[ind_2]){      /*From here programmer can decide that array arrange in ascending
                                            or in descending order*/
  //Assigning value and increment           
  merged[x++] = values[ind_1++];
    }else {
    merged[x++] = values[ind_2++];
        }
    }
  
  //First array
  while (ind_1<=mid){
  merged[x++] = values[ind_1++];
    }
  
  //Second array
  while (ind_2<=ei){
  merged[x++] = values[ind_2++];
    }
  
  //Create new array
  for (int i=0, j=si; i<merged.length; i++, j++){
  values[j] = merged[i];
    }
}
  
//Time complexity = logn
//To divide unsorted array
public static void Divide(int[] values, int si, int ei){
//Base case
  if (si>=ei){
  return;
    }
  
  //Calculate mid point
  int mid = si + (ei-si)/2;
  
  //Recursive call
  Divide(values, si,mid);
  Divide(values,mid+1,ei);
  
  //External method call
  conquer(values,si,mid,ei);
}

//Main Method  
public static void main(String[] args){
  //Merge Sort
  int values[] = {6,3,5,9,2,8};
  int n = values.length;
  System.out.println("\"Unsorted Array\"");
  for (int i=0; i<n; i++){
  System.out.print(values[i]+" ");
    }
  System.out.println();
  System.out.println();
  
//Method call
  Divide(values,0,n-1);
  
  //Print
  System.out.println("\"Sorted Array\"");
  for (int i=0; i<n; i++){
  System.out.print(values[i]+" ");
    }
  System.out.println();
}
}  
