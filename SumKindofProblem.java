package com.kattis;

import java.util.*;

public class SumKindofProblem {

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);

        List<Integer> list=new ArrayList<>();
        List<Integer> result=new ArrayList<>();

        int k=sc.nextInt();
        int l=1;
        while(l<=k){

            list.add(sc.nextInt());
            list.add(sc.nextInt());
            result.add(list.get(0));

            //sum of N integer
            int sum=0;
            for(int i=1;i<=list.get(1);i++){
                sum+=i;
            }
            //sum of Even N integer
            int esum=0;
            int ePrev=2;

            for(int i=0;i<list.get(1);i++){
                esum+=ePrev;
                ePrev+=2;

            }

            int oSum=0;
            int oPrev=1;
            for(int i=0;i<list.get(1);i++){
                oSum+=oPrev;
                oPrev+=2;

            }
            result.add(sum);
            result.add(oSum);
            result.add(esum);



            System.out.println(result.toString().replace("[","").replace("]","").replace(",",""));
            result.clear();

            l++;

        }
    }
}

