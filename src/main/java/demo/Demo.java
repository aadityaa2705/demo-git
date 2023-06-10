package demo;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("str1","str2");

        list.forEach(str->{
            System.out.println(str);
        });
    }
}
