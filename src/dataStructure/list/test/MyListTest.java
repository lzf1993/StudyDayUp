package dataStructure.list.test;

import dataStructure.list.LinkedList;

class MyListTest {

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3,15);
        list.add(0,150);

        for (int i=0;i <list.size() ; i++){
            System.out.println(""+ list.get(i));
        }

        list.remove(1);
        System.out.println(" ------------------------------------ ");
        for (int i=0;i <list.size() ; i++){
            System.out.println(""+ list.get(i));
        }
    }

}
