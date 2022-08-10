import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
     
    public static boolean checkPalindrome(List<Character> list){
        List<Character> revList = new ArrayList<Character>();
        revList = list;
        Collections.reverse(revList);
        for(int i=0;i<list.size()+1/2;i++){
          if(list.get(i)!=revList.get(i)){
            return false;
          }
        }
        return true;
    }

    public static int palindromeIndex(String s) {
    // Write your code here
    // char strArr[] = s.toCharArray();
    List<Character> strArr = new ArrayList<Character>();
    for(int j=0;j<s.length();j++){
        strArr.add(s.charAt(j));
    }
    
    int i=0;
    int len= strArr.size()-1;
    if(len==0 || len==-1){
        return -1;
    }else{
        while(len>1){
            if(strArr.get(i)!=strArr.get(len)){
                if(strArr.get(i+1)==strArr.get(len)){
                    strArr.remove(i);
                    if(checkPalindrome(strArr)){
                    return i;}else{ return -1}
                      
                }else if(strArr.get(i)==strArr.get(len-1)){
                    strArr.remove(len);
                    if(checkPalindrome(strArr)){
                    return len;}else{ return -1}                  
                    
                }
            }
            i++; len--;
        }
        return -1;
    }
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
