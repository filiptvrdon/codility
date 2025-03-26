package sk.filiptvrdon.codility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  <a href="https://app.codility.com/programmers/lessons/1-iterations/binary_gap/">Problem statement</a>
 *  Commentary: The problem is stated in quite a complicated way and boils down to the fact that we need to find a longest sequence of some character in a string.
 *  The character happens to be a 0 and the string is a binary representation of numbers - effectively 0s and 1s.
 *  Therefore we can simply find all groups of 1 or more 0s and compare which of them is the longest + take other conditions into consideration.
 *  In practice we can use a regex to find all groups of 0s in the string that meet the criteria and select the longest one
 */

public class BinaryGapCounter {

    public int calculatebBinaryGap(Integer number){
        String binaryString = Integer.toBinaryString(number);
        System.out.println(binaryString);

        Pattern pattern = Pattern.compile("10+1");
        Matcher matcher = pattern.matcher(binaryString);

        List<String> gaps = new ArrayList<>();

        while (matcher.find()){
            gaps.add(matcher.group());
        }

        int lengthOrZero = gaps.stream().mapToInt(String::length).max().orElse(0);
        return Math.max(lengthOrZero - 2, 0);
    }
}
