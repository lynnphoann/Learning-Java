import java.util.*;;

class Solution {
    public static int romanToInt(String s) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        int ans = 0;
        String[] splitS = s.split("");
        for (int i = s.length()-1; i >= 0; i--){
            int mapInt = map.get(splitS[i]);
            if(4*mapInt < ans){
                ans -= mapInt;
            }else{
                ans += mapInt;
            }
        }
        return ans;
    }

        
    
    public static void main(String[] args) {
        int ans = romanToInt("LVIII");
        System.out.println(ans);
        // System.out.println(1<1);
    }
    
}