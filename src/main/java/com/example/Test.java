package com.example;



import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        String string="";
        Double doubleValue = Double.valueOf(StringUtils.isEmpty(string)?"0":string);
        System.out.println(doubleValue);
    }
}
