package algorithm.sort;


import algorithm.sort.model.Cards;

/**
 * 冒泡排序
 */
 class BubbleSort {

    public static void main(String args[]){
        testSort();
        testSort2();
    }


    public static void testSort(){
        //蛮力法
        int [] array = new int []{19,2,3,5,11,7,8,12,10};
        //n个数，则有 n-1个数需要排序 ， 每排序一个数，则需要排序 n-1
        // n n-1 n-2 n-3 ... 1   === 时间复杂度  n(n-1)/2
        for(int i= array.length-1; i>0; i--){
            boolean flag = true;
            for(int j = 0; j< i; j++){
                if(array[j] > array [j+1]){
                    int temp = array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println(array);
    }


    /**
     * 冒泡排序
     */
    public static void testSort2(){
        //蛮力法
        Cards[] array=new Cards[]{
                new Cards(3,2),new Cards(2,9),
                new Cards(1,7),
                new Cards(3,5),new Cards(4,3)};
        //n个数，则有 n-1个数需要排序 ， 每排序一个数，则需要排序 n-1
        // n n-1 n-2 n-3 ... 1   === 时间复杂度  n(n-1)/2
        for(int i= array.length-1; i>0; i--){
            for(int j = 0; j< i; j++){
                if(array[j].compareTo(array [j+1]) >0){
                    Cards temp = array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(array);
    }


}
