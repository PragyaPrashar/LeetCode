import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {


    static Map<Character, String> map;
    static List<String> result;
    static public List<String> letterCombinations(String digits) {
      result=new ArrayList<>();
      if(digits.length()==0){
        return result;
      }
      map=new HashMap<>();
      map.put('0',"");
      map.put('1',"");
      map.put('2',"abc");
      map.put('3',"def");
      map.put('4',"ghi");
      map.put('5',"jkl");
      map.put('6',"mno");
      map.put('7',"pqrs");
      map.put('8',"tuv");
      map.put('9',"wxyz");
      generate(digits, 0,"");
      return result;
    }
    static void generate(String digits, int index, String current){
      if(index==digits.length()){
        result.add(current);
        return;
      }
      String st=map.get(digits.charAt(index));
      for(int i=0;i<st.length();i++){
        generate(digits, index+1,current+st.charAt(i));
      }
    }

  public static void main(String[] args) {
      String digits = "23";
      System.out.println(letterCombinations(digits));
  }
  }

