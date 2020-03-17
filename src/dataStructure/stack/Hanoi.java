package dataStructure.stack;

class Hanoi {

    public static void main(String args[]){
        hanoi(3, 1,2,3);
    }


    /**
     * 汉罗塔
     * @param n      牌的个数
     * @param start  开始的柱子
     * @param middle 中间的柱子
     * @param end    最后的柱子
     */
    public static void hanoi(int n , int start , int middle,int end){
        if(n <= 1){
            System.out.println("移动： start " + start +"   =====>  end " + end);
        }else{
            //将n-1个牌，从第一个柱子移动到中间的柱子
            hanoi(n-1, start, end , middle);
            //将第一个牌，从第一个柱子移动到最后一个柱子
            System.out.println("移动： start " + start +"   =====>  end " + end);
            //将n-1个牌，从中间的柱子移动到最后一个柱子
            hanoi(n-1,middle,start,end);
        }
    }

}
