public class Main
  {
    //Function that uses void
    public static void printStars()
    {
      for(int i = 0; i <= 5; i++)
      {
        System.out.print('*');
      }
    }

    //Function with a return type
    public static double triangleArea(double base, double height)
      {
        return .5 * base * height;
      }
    
    public static void main(String[] args)
    {
     //Prints the message
     System.out.println("Welcome to CS 112!");
     printStars();
     System.out.println("\nThe area of a triangle with base 5 and height of 2 is " + triangleArea(5,2));
    
    }
  }