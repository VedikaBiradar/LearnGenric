import java.util.Scanner;

public class MainEntry {

    Scanner sc = new Scanner(System.in);
  int a,b;
  public void userInput(){
      System.out.println("Enter first number: ");
      a=sc.nextInt();
      System.out.println("Enter Second number: ");
      b=sc.nextInt();
      System.out.println("Enter what you want to do your operation: (add, sub, mul, div) ");
      String op=sc.next();

      switch(op){
          case "add":
              System.out.println("Addition is: "+addobj.compute(a,b));
              break;

          case "sub":
              System.out.println("Substraction is: "+subobj.compute(a,b));
              break;

          case "mul":
              System.out.println("Multiplication is: "+mulobj.compute(a,b));
              break;
          case "div":
              System.out.println("Division is: "+ divobj.compute(a,b));
              break;


          default:
              System.out.println("Invalid operation");
              break;

      }

  }


    Calc addobj=new Calc(){

        @Override
        public int compute(int a, int b) {
            return a+b;
        }
    };

    Calc subobj=new Calc(){

        @Override
        public int compute(int a, int b) {
            return a-b;
        }
    };

    Calc mulobj=new Calc(){

        @Override
        public int compute(int a, int b) {
            return a*b;
        }
    };
    Calc divobj=new Calc(){

        @Override
        public int compute(int a, int b) {
            return a/b;
        }
    };

}
