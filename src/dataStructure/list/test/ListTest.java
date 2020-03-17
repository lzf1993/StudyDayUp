package dataStructure.list.test;

import java.util.LinkedList;

import dataStructure.list.test.model.Mahjong;

class ListTest {

    //要求，先按照 类型分类，再按照 点数分类
    public static void main(String args[]){
        LinkedList<Mahjong> list=new LinkedList<Mahjong>();
        list.add(new Mahjong(3,1));
        list.add(new Mahjong(2,3));
        list.add(new Mahjong(3,7));
        list.add(new Mahjong(1,1));
        list.add(new Mahjong(3,8));
        list.add(new Mahjong(2,2));
        list.add(new Mahjong(3,2));
        list.add(new Mahjong(1,3));
        list.add(new Mahjong(3,9));

        radixSort(list);
    }


    /** 先按照 点数 分成9个数组， 再按照 花色 分成 3个数组，最后合并
     * @param list
     */
    public static void radixSort(LinkedList<Mahjong> list){
        //先对点数进行分组
        LinkedList[] rankList = new LinkedList[9];
        for (int i = 0; i < rankList.length; i++) {
            rankList[i] = new LinkedList();
        }
        //把数据一个个放到对应的组中
        while(list.size()>0){
            //取一个
            Mahjong m = list.remove();
            //放到组中  下标=点数减1的
            rankList[m.rank-1].add(m);
        }
        //把9组合并在一起
        for (int i = 0; i < rankList.length; i++) {
            list.addAll(rankList[i]);
        }

        //先花色进行分组
        LinkedList[] suitList = new LinkedList[3];
        for (int i = 0; i < suitList.length; i++) {
            suitList[i] = new LinkedList();
        }

        //把数据一个个放到对应的组中
        while(list.size()>0){
            //取一个
            Mahjong m = list.remove();
            //放到组中  下标=点数减1的
            suitList[m.suit-1].add(m);
        }
        //把3个组合到一起
        for (int i = 0; i < suitList.length; i++) {
            list.addAll(suitList[i]);
        }
    }
}
