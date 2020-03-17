package dataStructure.tree.use;

/**
 * 二分查找 ： 数据的查找
 *   查找的前提是，数据已经被排好序
 */
class BinarySearch {


    public static void main(String args[]){
        int array[] = new int[]{1,3,5,7,12,33,43,56,78,88,89,91,98};
        int value = binarySearch(array,0,array.length,15);
        System.out.println("查找的内容 value [ " + value+" ] ");
    }



    /**
     * 二分查找: 查找的前提是，数组是要排好序的，否行没法查找
     * @param array  要查找的数组
     * @param fromIndex 开始位置
     * @param toIndex 结束的位置
     * @param key 要查找的key
     */
    public static int binarySearch(int array[], int fromIndex , int toIndex , int key){
         int low = fromIndex;
         int high = toIndex -1;
         while(low <= high){
             int mid = (low + high) /2;
             int midValue = array[mid];
             //要查找的内容大于中间值，去右边找
             if(key > midValue){
                low = mid + 1;
             }
             //要找的内容小于中间值，去左边找
             else if(key < midValue){
                 high = mid -1;
             }
             //找到内容了。
             else{
                return mid;
             }
         }
         //没有找到
         return -1;
    }
}
