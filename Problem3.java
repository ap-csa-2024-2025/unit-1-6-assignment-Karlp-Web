public class Problem3
{
  public static void main(String[] args)
  {
    double num = 67.3424;

    int betterNum = (int) (num * 1000);//will bring the decimals out 

    System.out.println(betterNum % 10); 

    betterNum = betterNum / 10;

    System.out.println(betterNum % 10);

    betterNum = betterNum / 10;

    System.out.println(betterNum % 10);
    
  }
}