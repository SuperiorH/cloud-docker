package com.example.eurekaserver.arrays;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4};
        List<Integer> list = Arrays.asList(array);
        list.add(5);
    }
}
