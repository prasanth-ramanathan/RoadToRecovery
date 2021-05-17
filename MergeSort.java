import java.util.Arrays;

class MergeSort {
  public static void main(String[] args) {
    int[] finalarr = mergesort(new int[]{1,4,5}, new int[]{2,3,6});
    Arrays.stream(finalarr).forEach(System.out::println);
  }

  public static int[] mergesort(int[] arr1, int[] arr2){
    int[] finalArr = new int[arr1.length + arr2.length];

    int j=0, k=0;

    for(int i=0; i<finalArr.length; i++){
      if(j != arr1.length && (k == arr2.length || arr1[j]<arr2[k])){
        finalArr[i] = arr1[j];
        j++;
      }
      else{
        finalArr[i] = arr2[k]; 
        k++;
      }
    }

  return finalArr;
  }
  
}
