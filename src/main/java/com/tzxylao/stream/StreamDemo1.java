package com.tzxylao.stream;

import java.util.stream.IntStream;

/**
 * Created by laoliangliang on 18/9/4.
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println("结果为："+sum);

        //使用stream的内部迭代
        //map就是中间操作
        //sum就是终止操作
        int num2 = IntStream.of(nums).map(i -> i*2).sum();
        System.out.println("结果为："+num2);

        int num3 = IntStream.of(nums).map(StreamDemo1::doubleNum).sum();
        System.out.println("结果为："+num3);

        System.out.println("惰性求值就是终止没有调用的情况下，中间操作不会执行");
        IntStream.of(nums).map(StreamDemo1::doubleNum);
        //如何判断中间操作还是终止操作，看返回值为stream就是中间操作，否则为终止操作
    }


    public static int doubleNum(int i) {
        System.out.println("执行了乘以2 ");
        return i*2;
    }
}
