package sk.filiptvrdon;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        gaps.forEach(System.out::println);

        return gaps.stream().mapToInt(String::length).max().orElse(0) - 2;
    }
}
