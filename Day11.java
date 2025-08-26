import java.util.*;
class permute{
  public static List<String> permutation(String s ){
    List<String> result = new ArrayList<>();
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    boolean[] used = new boolean[chars.length];
    backtrack (chars, new StringBuilder(), used, result);
    return result;
  }
  public static void backtrack(char[] chars, StringBuilder path, boolean[] used, List<String>result){
    if(path.length() == chars.length){
        result.add(path.toString());
        return ;
    }
    for(int i=0; i<chars.length; i++){
        if(used[i])continue;

        if(i>0 && chars[i] == chars[i-1] && !used[i-1])continue;
        used[i] = true;
        path.append(chars[i]);
        backtrack(chars, path, used, result);
        path.deleteCharAt(path.length()-1);
        used[i] = false;
    }
  }
  public static void main(String[] args) {
        System.out.println(permutation("abc")); 
    }
}
