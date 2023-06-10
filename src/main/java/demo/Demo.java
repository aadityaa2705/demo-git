package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Demo class added
 */
public class Demo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("str1","str2");

        list.forEach((str)->{
            System.out.println(str);
        });

        Map<String, String> map = new HashMap<>();
        map.put("key1","val1");

        map.forEach((key, val) ->{
            System.out.println("key="+key +" value="+val);
        });

        for(String str : list){
            System.out.println(str);
        }


    }
}
