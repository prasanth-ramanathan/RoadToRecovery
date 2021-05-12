import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7,8,9,10 };
    System.out.println(hasPairWithSum2(intArray, 9));
  }

  static Boolean hasPairWithSum(String[] arr, Integer sum){
    int length = arr.length;
    for(int i=0; i<length-1; i++){
      for(int j=i+1; j<length; j++){
        if(arr[i] == arr[j]){
          return true;
        }
      }
    }
    return false;
  }


static Boolean hasPairWithSum2(Integer[] arr, Integer sum){
  HashSet<Integer> mySet = new HashSet<Integer>();
  int length = arr.length;
  for(int i=0; i<length; i++){
    if(mySet.contains(arr[i])){
      System.out.println("i is: "+i);
      System.out.println("myset is: "+mySet);
      return true;
    }
    mySet.add(sum-arr[i]);
  }
  return false;
}

}