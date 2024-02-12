import java.util.*;
public class Caculator {
    static int Operator(String firstNum,String secondNum,String operatorKey){



        int firstIntNum = Integer.parseInt(firstNum);
        int secondIntNum = Integer.parseInt(secondNum);


        switch (operatorKey) {
            case "+":
                return(firstIntNum+secondIntNum);
            case "-":
                return(firstIntNum-secondIntNum);

            case "/":
                return(firstIntNum/secondIntNum);
            
            case "*":
                return(firstIntNum*secondIntNum);
            
        }
        return 0;
    }
    
    public static void main(String[] args) {
        String[]  operatorKey = {"+","-","/","*"};

        Scanner sc = new Scanner(System.in);

        boolean loopKey = true;
       

        while (loopKey) {
            System.out.println("First Num : ");
            String num1 = sc.nextLine(); //Get first value
            System.out.println("Second Num : ");
            String num2 = sc.nextLine(); //Get second value
            System.out.println( Arrays.toString(operatorKey)+" choose Operator here :");
            String choosedOperator = sc.nextLine(); //choose operator value
            int ans = Operator(num1, num2, choosedOperator);
            System.out.println(ans);
            System.out.println("restart type- \"y\" (yes) or \"n\" (no)");
            String loopWord = sc.nextLine();
            if (loopWord.startsWith("y")){
                loopKey = true;
            }else{
                loopKey = false;
            }
    
        }

    }
}