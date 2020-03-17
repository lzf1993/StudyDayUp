package dataStructure.tree.use;

/**
 * 归并排序： 使用树的后序遍历。
 *                                                   |---------------------------------------------------------|
 *                                                   | 1, 33, 22, 4, 23, 11, 15, 17, 16, 33, 25, 63, 78, 90, 45|
 *                                                   |---------------------------------------------------------|
 *                                                  /                                                            \
 *                                 |----------------|----------------|                               |---------------|---------------|
 *                                 |  1, 33, 22, 4, 23, 11, 15, 17   |                               |   16, 33, 25, 63, 78, 90, 45  |
 *                                 |---------------------------------|                               |-------------------------------|
 *                                /                                  \                                   /                           \
 *                      |---------|---------|                  |------|------|                  |-----------|------|           |-------|-----|
 *                      | 1, 33, 22, 4, 23 |                   | 11, 15, 17  |                  |  16, 33, 25, 63  |           |  78, 90, 45 |
 *                      |------------------|                   |-------------|                  |------------------|           |-------------|
 *                   /                     \                  /            \                    /              \                /            \
 *            |-----|-----|           |-----|--|         |--------|      |----|         |-----------|        |----|        |--------|        |----|
 *            | 1, 33, 22 |           |  4, 23 |         | 11, 15 |      | 17 |         | 16, 33, 25|        | 63 |        | 78, 90 |        | 45 |
 *            |-----------|           |--------|         |--------|      |----|         |-----------|        |----|        |--------|        |----|
 *            /           \            /      \          /         \                    /             \                      /        \
 *       |--------|     |----|      |--|-|  |-|--|     |--|-|    |--|-|              |------|-|      |-|--|              |--|-|      |--|-|
 *       | 1 , 33 |     | 22 |      |  4 |  | 23 |     | 11 |    | 15 |              | 16, 23 |      | 25 |              | 78 |      | 90 |
 *       |--------|     |----|      |----|  |----|     |----|    |----|              |--------|      |----|              |----|      |----|
 *       /       \
 *     最后拆分成这两个，然后进行合并
 *   |-|--|    |--|-|
 *   | 1  |    | 33 |
 *   |----|    |----|
 *
 *     如上图：是后序排序， 先不断的拆分，拆分到只有一个了之后，然后进行合并。
 *                        进行合并的时候，比较左右两个数组、
 *
 * @author lzf
 */
class MergeSort {

    public static void main(String args[]){
        int array [] = new int[]{1,33,22,4,23,11,15,17,16,33,25,63,78,90,45,67,234,67,44,58};
        mergeShort(array,0,array.length - 1);
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }


    /**
     * 进行归并排序
     *    该方法：
     *       1、不断的拆分
     *       2、最后拆分完了，进行合并
     * @param array 数组
     * @param left 开始位置
     * @param right 结束位置
     */
    public static void mergeShort(int array[], int left, int right){
        if(left == right){
            return;
        }else{
            //这一段是逻辑代码
            int mid = (left + right) /2;
            //这是一个后序遍历
            //拆分成左边一半
            mergeShort(array,left,mid);
            //拆分成右边一半
            mergeShort(array,mid+1,right);
            //进行合并，得到根节点。
            merge(array,left,mid+1, right);
        }
    }



    /**
     * 进行合并
     * @param array 合并的数组
     * @param left 左边指针 0
     * @param mid 中间指针  2
     * @param right 右边指针  5
     */
    public static void merge(int array[], int left , int mid , int right){
        //获取左边和右边两个数组的大小
        int leftSize = mid - left;
        int rightSize = right - mid + 1;

        //创建左右两个数组
        int arrayLeft[] = new int[leftSize];
        int arrayRight[] = new int[rightSize];

        //对两个数组进行填充数据
        for(int i = left; i < mid ; i++){
            arrayLeft[i-left] = array[i];
        }
        for(int i = mid; i <= right ; i++){
            arrayRight[i-mid] = array[i];
        }

        //开始进行合并, 定义三个指针，分别是三个数组的指针
        //arrayLeft数组的指针
        int i = 0;
        //arrayRight数组的指针
        int j = 0;
        //array数组的指针
        int k = left;
        while(i < leftSize && j < rightSize){
            //左边数组小于右边数组。
            if(arrayLeft[i] < arrayRight[j]){
                //将小的元素放在数组
                array[k] = arrayLeft[i];
                //指针进行移动
                i++;
                k++ ;
            }else{
                //将小的元素放在数组
                array[k] = arrayRight[j];
                //指针进行移动
                j++;
                k++ ;
            }
        }

        //右边数组还有元素
        while(i < leftSize){
            array[k] = arrayLeft[i];
            i++;
            k++;
        }

        //左边数组还有元素
        while(j < rightSize){
            array[k] = arrayRight[j];
            j++;
            k++;
        }
    }


}
