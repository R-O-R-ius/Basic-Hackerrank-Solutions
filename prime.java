import static java.lang.System.*;
class Prime {
 static void checkPrime(int...arr) {
  for (int i = 0; i < arr.length; i++) {
   boolean flag = false;
   for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
    if (arr[i] % j == 0) {
     flag = true;
     break;
    }
   }
   if (arr[i] > 1 && (!flag || arr[i] == 2)) {
    System.out.print(arr[i] + " ");
   }
  }
  System.out.println();
 }
}
