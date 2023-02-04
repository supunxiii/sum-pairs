import java.util.*;
public class findSum{
  public static void main(String args[]){
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter the length of the Array: ");
    int arrLength = userinput.nextInt();
    int[] myArr = new int[arrLength];
    System.out.println("Enter the elements of the Array: ");
    for (int i = 0; i < arrLength; i++){
      myArr[i] = userinput.nextInt();
    }

    System.out.println("Enter the number you want to find sum pairs: ");
    int sumNum = userinput.nextInt();
    System.out.println("The Array: "+ Arrays.toString(myArr));
    System.out.println("Pairs whose sum is equal to the number you entered "+sumNum+" are: ");
    for (int i = 0; i < myArr.length; i++){
      for (int x = i; x < myArr.length; x++){
        if((myArr[i] + myArr[x]) == sumNum && i != x){
          System.out.println("{ "+myArr[i]+", "+myArr[x]+" }");
        }
      }
    }

  }
}
