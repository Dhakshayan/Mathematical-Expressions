import java.util.Scanner;
public class MathExpressions{
    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter Mathematical Expression: ");
        String userInput = prompt.nextLine();
        String[] list = userInput.split("[\\+\\-\\*\\/]");
        int num1 = Integer.parseInt(list[0]);
        int num2 = Integer.parseInt(list[1]);
        int result;
        if (userInput.contains("+")){
            System.out.print(num1+" + "+num2+" = ");
            System.out.print(num1+num2);
        }
         if (userInput.contains("-")){
            System.out.print(num1+" - "+num2+" = ");
            System.out.println(num1-num2);
        }
         if (userInput.contains("*")){
            System.out.print(num1+" * "+num2+" = ");
            System.out.println(num1*num2);
        }
         if (userInput.contains("/")){
            System.out.print(num1+" / "+num2+" = ");
            System.out.println(num1/num2);
        }

    }
}