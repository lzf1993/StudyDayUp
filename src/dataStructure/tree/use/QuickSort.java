package dataStructure.tree.use;

/**
 * 快速排序：使用树的前序遍历
 *     取出 11
 *         / | \  \  \   \   \   \   \   \   \
 *        /  |  |  |  |   |   |   |   |   |   |
 *       11  4  6  8  99  10  67  88  45  18  14
 *      /|\                                   /|\
 *       |                                     |
 *      low                                   high
 *
 *      1、high指针 从左往右 取元素，当 a[i] 大于 11， 则继续往左走，如果小于11，则把当前元素，放在low指针位置，同时high指向i位置，low指针往前走一位
 *      2、这时候 low指针往右走，如果 a[i] 小于11，则继续往右边走，如果大于11，则把当前元素放在 high指针位置，low指向i 位置，high指针往前走一位。
 *      3、1和2步 完成一次排序，同时将数据分成了两半。 则下面继续1和2部
 *      4、对于1024个数据，只需要 1024 * log1024 = 1024 * 10次 ===》 n*log(n) 次
 *         如果使用冒泡排序则需要 n(n-1)/2 = 1023 * 512次
 *
 *   适用于：顺序存储结构
 *   缺点：大量重复数据时，性能不好
 *         链表不适合使用
 *
 *
 * @author lzf
 */
class QuickSort {


    public static void main(String args[]){
        int array[] = new int[]{11,23,4,55,66,2,13,45,87,56,88,90,14,17,74,39};
        quickSort(array,0, array.length-1);
        for(int i=0;i<array.length ; i++){
            System.out.print(" "+array[i]);
        }
    }



    /**
     * @param array  要排序的数组
     * @param begin 开始位置
     * @param end 结束位置
     */
    public static void quickSort(int array[], int begin, int end){
        if((end - begin) <= 0){
            return;
        }
        //开始取第一个元素
        int x = array[begin];
        int low = begin;
        int high = end;
        //因为从两头开始查找，所以需要一个方向，改方向表示：从右往左 查找
        boolean direction = true;
        //开始不断循环
        L:
        while(low < high){
            //从右往左查找
            if(direction){
                //从右往左开始遍历
                for(int i = high ; i > low ; i --){
                    //右边的元素小于对比的元素：把改元素放在low指针位置，然后low指针往右移，同时从左往右开始查找
                     if(array[i] <= x){
                         array[low ++ ] = array[i];
                         //记录
                         high = i;
                         //改变方向，从左往右开始查找。
                         direction = !direction;
                         continue L;
                     }
                }
                //如果一次也没有进来，则让两个指针重合。
                high = low;
            }
            //从左往右查找
            else{
                //从左往右开始遍历
                for(int i = low ; i < high ; i ++){
                    //左边的元素大于对比的元素：把该元素放在high位置，然后high指针往左移动。同时从右往左开始查找
                    if(array[i] >= x){
                        //右边指针往左边移动
                        array[high -- ] = array[i];
                        //记录
                        low = i;
                        //改变方向，从左往右开始查找。
                        direction = !direction;
                        continue L;
                    }
                }
                low = high;
            }
        }

        //最后把这个元素放在最后这个指针这儿。
        array[low] = x;
        //开始进行下一次
        quickSort(array, begin, low - 1);
        quickSort(array, low+1, end);
    }


}
