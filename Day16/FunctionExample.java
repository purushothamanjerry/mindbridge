/*Use a Function<String, Integer> to map a list of strings to their lengths.
Input: ["Hello", "World", "Java"]
Output: [5, 5, 4]
*/

package Day16;

import java.util.function.Function;

public class FunctionExample {
    public  static  void  StringLengthFind(String strs[] , Function<String,Integer> function )
    {
        for(String s : strs)
        {
            System.out.println(s+" : "+function.apply(s));
        }
    }
    public static void main(String[] args) {
        String words[] = {"Hello", "World", "Java"};
        StringLengthFind(words,(str)->str.length()) ;
        Function<String,Integer> function = (str)->str.length();
    }
}
