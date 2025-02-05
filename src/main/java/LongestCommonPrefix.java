import java.util.Arrays;

public class LongestCommonPrefix {
  static public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    char [] firstWord=strs[0].toCharArray();
    char [] secondWord=strs[strs.length-1].toCharArray();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<Math.min(firstWord.length, secondWord.length);i++){
      if(firstWord[i]!=secondWord[i]){
        return sb.toString();
      }else{
        sb.append(firstWord[i]);
      }

    }
    return sb.toString();
  }
  public static void main(String[] args) {
    String [] strs = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strs));
  }
}
