import java.util.Scanner;
public class App {
   static Scanner inputScanner;
    public static void main(String[] args) {
         inputScanner = new Scanner(System.in);
         Double num;
         
        do {
            System.out.println("What would you like to do?");
            System.out.println("Add");
            System.out.println("Subtract");
            System.out.println("Multiply");
            System.out.println("Divide");
            System.out.println("Exit");
            System.out.print("> ");
            String math = inputScanner.next();
         
            switch(math) {
                case "Add":
                    num = getEntries(math);
                    System.out.print("Results from addition: ");
                    System.out.println(num.toString());
                    break;
                case "Subtract":
                    num = getEntries(math);
                    System.out.print("Results from subtraction: ");
                    System.out.println(num.toString());
                    break;
                case "Multiply": 
                    num = getEntries(math);
                    System.out.print("Results from multiply: ");
                    System.out.println(num.toString());
                    break;
                case "Divide":
                    num = getEntries(math);
                    System.out.print("Results from divide: ");
                    System.out.println(num.toString());
                    break; 
                case "Exit":
                    return;
                default:
                    System.out.println("Wrong input received");   
            }
        System.out.println("");
    }while(true);
   
}

    private static double getDouble(String prompt){
        System.out.print(prompt);
        Integer xValue = inputScanner.nextInt();
        return xValue;
    }  
    private static double getEntries(String action){
        double num1, num2, num3 = 0;
        num1 = getDouble("Enter first number: ");
        num2 = getDouble("Enter second number: ");
        Calculator calc = new Calculator();
        if(action.contains("Add")){
            num3 = calc.add(num1, num2); 
        }
        else if(action.contains("Subtract")){
            num3 = calc.subtract(num1, num2);
        }
        else if(action.contains("Multiply")){
            num3 = calc.multiply(num1, num2); 
        }
        else if(action.contains("Divide")){
            num3 = calc.divide(num1, num2);
        }
        return num3;
    }  
}