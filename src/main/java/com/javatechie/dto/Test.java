package com.javatechie.dto;

import java.util.Arrays;
import java.util.List;


public class Test {
    public static void main(String[] args) {
       /* int i=0;
        System.out.println("i = "+ i);
        Integer I = 0;
        System.out.println("I = "+ I);
        float f =0f;
        System.out.println("f = "+ f);
        long l= 0L;
        System.out.println("l = "+ l);
        Long L= 0L;
        System.out.println("L = "+ L);
        Float F= 0F;
        System.out.println("F = "+ F);
        double d=0d;
        System.out.println("d = "+ d);
        Double D= 0D;
        System.out.println("D = "+ D);
        char c=0;
        System.out.println("c = "+ c);
        String s= "0";
        System.out.println("s = "+ s);
        byte b=0;
        System.out.println("b = "+ b);
        Byte B=0;
        System.out.println("B = "+ B);
        short sh=0;
        System.out.println("sh = "+ sh);
        Short S=0;
        System.out.println("S = "+ S);
        boolean bo=true;
        System.out.println("bo = "+ bo);
        Boolean Bo=true;
        System.out.println("Bo = "+ Bo);*/
        int[] a = {1, 3, 6, 4, 1, 2};
        int result = solution(a);
        System.out.println(result);

    }

    public static int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);

        //Stream<Integer> s = Arrays.stream(A).boxed();
        List<Integer> l = Arrays.stream(A).boxed().toList();
        int item =0;
        int min = A[0];
        int max = A[A.length-1];
        for(int i=min;i<=max;i++){
              if(l.contains(i))continue;
              else{
                  item=i;
                  break;
              }
        }
        return item;

    }
}
