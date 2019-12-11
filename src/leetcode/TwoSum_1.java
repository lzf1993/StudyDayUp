package leetcode;

import java.util.HashMap;

/**
 * 求两数之和：给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，
 *          并返回他们的数组下标。
 */
class TwoSum_1 {


    public static void main(String agrs[]){

        int []num = new int[]{2,13,4,56,77,23,45,12,3,6,7,8,34,18,19,20,15};
        int target = 28;
        //找出 两个和为 28的 两个整数和下标
        twoNum(num,target);
    }


    public static void twoNum(int []num, int target){
        //值 - 索引
        HashMap<Integer,Integer> record = new HashMap<>();
        for(int i=0;i<num.length; i++){
            int complement = target - num[i];
            //遍历map获取是否有值和 complement 相等。
            Integer key = record.get(complement);
            //则找到了
            if(key != null){
                System.out.println("result : r1 [ "+ i + " ] r2 [" + key + " ] ");
                return;
            }else{
                //不存在，则存储
                record.put(num[i],i);
            }
        }
    }

}
