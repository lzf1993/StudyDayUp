package algorithm.sort;

/**
 * 选择排序
 */
class SelectSort {

    public static void main(String args[]){
        selectSort();
    }


    public static void selectSort(){
        int [] array = new int []{19,2,3,5,11,7,8,12,10};
         for(int i = 0;i < array.length;i++){
             //排一次序
             int index = i;
             //从 i -
             for(int j = i+1; j< array.length;j++){
                 if(array[j] < array[index]){
                     index = j;
                 }
             }
             if(index != i ){
                 int temp = array[i];
                 array[i] = array[index];
                 array[index] = temp;
             }
         }
         System.out.print(array.toString());
    }
}
