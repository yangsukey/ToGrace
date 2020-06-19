/**
3.請寫出由大到小的排序演算法
**/
import java.util.Arrays;
import java.util.Collections;

class HomeWork3 {

    public static void main(String[] args) {
        Integer[] nums={2,16,4,88,16,77};
        System.out.println("Befor sort:"); 
        for(int x:nums){
            System.out.print(x+" ,");    //排序前
        }
        System.out.println();        
        System.out.println("After sort:");        
        Arrays.sort(nums, Collections.reverseOrder()); //使用sort排序 大到小
        for(int x:nums){
            System.out.print(x+" ,");
        }
    }

}