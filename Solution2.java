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
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
    // Write your code here
    if(s.length()%2!=0){
        return -1;
    }
    String str1 = s.substring(0,s.length()/2);
    String str2 = s.substring(s.length()/2,s.length());
    // System.out.println(str1+".  "+str2);
    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
   
    int count=0;
    int k=0;
    for(int i=0; i<ch1.length;i++){
        for(int j=0;j<ch2.length;j++){
            // System.out.println(ch1[i]+".  "+ch2[j]);

            if(ch1[i]==ch2[j]){
                            System.out.println(ch1[i]+".  "+ch2[j]);
                ch2[j]='@';
                k=j;
                break;
            }else if(j==ch2.length-1){
                count++;
            }
        }
        
        // while(ch1[i]!=ch2[k]){
        //     if(k==ch1.length-1){
        //         count++;
        //     }
        //     k++;
        // }
        
        // if(ch1[i]!=ch2[k]){
        //     ch2[k]='@';
        //     count++;
        // }
        
    }
    
    return count;
    

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

                int result = Result.anagram(s);

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
