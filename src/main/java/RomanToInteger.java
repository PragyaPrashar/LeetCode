import java.util.*;
public class RomanToInteger {


    static public int romanToInt(String s) {
      Map<Character, Integer> map=new HashMap<>();
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);
      int result_var=0;
      for(int i=0;i<s.length();i++){
        if(i+1<s.length()&& map.get(s.charAt(i))<map.get(s.charAt(i+1))){
          result_var-=map.get(s.charAt(i));
        }else{
          result_var+=map.get(s.charAt(i));
        }
      }
      return result_var;
    }

  public static void main(String[] args) {
    String s = "III";
    System.out.println(romanToInt(s));

  }
}
