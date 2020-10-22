public class Factorial{
  public static void main(String [] args){
  int num = 0;
    if(args.length != 0){
      num = Integer.parseInt(args[0]);
      int result = 1;
      // while(num>=1){
      //   result = result * num;
      //   num--;
      // }
      // for(int i=num;i>=1;i--){
      //   result = result * num;
      // }
      do{
        result = result * num;
        num--;
      }while(num>=1);
      System.out.println(result);
    }
  }
}