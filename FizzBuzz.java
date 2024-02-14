import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n){
        List<String> ans = new ArrayList<String>();
        for (int i= 1 ; i < n+1 ; i++){
            if (i%3 == 0 && i%5 == 0){
                ans.add("FizzBuzz");
            }else if (i%3 == 0){
                ans.add("Fizz");
            }else if (i%5 == 0){
                ans.add("Buzz");
            }else{
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
