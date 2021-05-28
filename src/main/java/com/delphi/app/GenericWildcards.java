package com.delphi.app;

import com.sun.org.apache.xpath.internal.operations.Number;

import java.util.*;

public class GenericWildcards {
    public static void upperBounded(List<? extends Number> list){
        for (Number n: list) {
            System.out.println(n);
        }
    }
    public static void lowerBounded(List<? super Number> list){
        for (Object n: list) {
            System.out.println(n);
        }
    }
    public static void unBounded(List<Integer> list){
        for (Integer n: list) {
            System.out.println(n);
        }
    }
    /// It would not compile because generics only work on the compilation stage,
    // and for java application bytecode for the following methods will be the same
    public void genericDifference(List<Object> list){}
    public void genericDifference(List<Integer> list){}
    public void genericDifference(List<GuessTheDay> list){}

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4);
        List<Double> doubles = Arrays.asList(1.1,2.3,3.4,4.1);
        List<Object> objects = Arrays.asList(1.1,2.3,3.4,4.1);
        /////////upperBounded////////// can pass every child class of Number
        upperBounded(integers);
        upperBounded(doubles);
        upperBounded(objects);
        /////////lowerBounded////////// can pass parent classes of Number
        lowerBounded(integers);
        lowerBounded(doubles);
        lowerBounded(objects);
        /////////unbounded////////// can pass only Integer type
        unBounded(integers);
        unBounded(doubles);
        unBounded(objects);
    }

}
