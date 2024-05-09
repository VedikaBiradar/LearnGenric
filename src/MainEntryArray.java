import java.util.Scanner;

public class MainEntryArray {
    Scanner sc = new Scanner(System.in);
    int a[];
    String choice;
    int numberOfElementsInArray = 0;
    public void userInputsInArray(){
        System.out.println("Enter your Array size");
        numberOfElementsInArray = sc.nextInt();
        System.out.println("Enter the elements you wish to enter: ");
        a = new int[numberOfElementsInArray];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter your choice:(add,sub,mul,div): ");
        choice = sc.next();
        switch (choice) {
            case "add":
                System.out.println("Your Addition of the Array Elements: "
                        +sumobj.calculateArray(a));
                break;
            case "sub":
                System.out.println("Your Subtraction of the Array Elements: "
                        +subObj.calculateArray(a));
                break;
            case "mul":
                System.out.println("Your Multiplication of the Array Elements: "
                        +mulObj.calculateArray(a));
                break;
            case "div":
                System.out.println("Your Division of the Array Elements: "
                        +divObj.calculateArray(a));
                break;
            default:
                System.out.println("Invalid Choice");
                break;

        }
    }

    public CalcArray sumobj=new CalcArray() {
        @Override
        public int calculateArray(int[] a) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            return sum;
        }
    };
    public CalcArray subObj=new CalcArray() {
        @Override
        public int calculateArray(int[] a) {
            int sub =a[0];
            for (int i = 1; i < a.length; i++) {
                sub-=a[i];

            }
            return sub;
        }
    };
    public CalcArray mulObj=new CalcArray() {
        @Override
        public int calculateArray(int[] a) {
            int mul = a[0];
            for (int i = 1; i < a.length; i++) {
                mul *= a[i];
            }
            return mul;
        }
    };
    public CalcArray divObj=new CalcArray() {
        @Override
        public int calculateArray(int[] a) {
            int div = a[0];
            for (int i = 1; i < a.length; i++) {
                div /= a[i];

            }
            return div;
        }
    };

}