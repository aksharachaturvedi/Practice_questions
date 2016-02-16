import java.util.HashSet;

/**
 * Created by Akshara on 2/11/16.
 */
public class Practise_q {

    public boolean canPermutePalindrome(String s) {
        if (s.length() <= 1) return true;
        else {
            HashSet<Character> counter = new HashSet<Character>();
            for (int i = 0; i < s.length(); i++)
                if (counter.contains(s.charAt(i))) {
                    counter.remove(s.charAt(i));
                } else {
                    counter.add(s.charAt(i));
                }
            return (counter.size() == 0 || counter.size() == 1);

        }
    }
}
