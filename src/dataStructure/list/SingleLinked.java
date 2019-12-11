package dataStructure.list;

/**
 * 单链表 ： todo
 * @param <E>
 */
public class SingleLinked<E> {

    //头结点
    private Node<E> first;
    //尾结点
    private Node<E> last;
    //大小
    private int size;


    /**
     * 获取链表的大小
     * @return 大小
     */
    public int size(){
        return size;
    }


    /**
     * 添加在最后
     * @param e 数据
     */
    public void add(E e){
        linkLast(e);
    }


    /**
     * 添加在指定位置
     * @param index 位置
     * @param e 数据
     */
    public void add(int index, E e ){
        if(index <0 || index > size) {
            return ;
        }
        if(index == size){
            linkLast(e);
        }else{
            //获取目标结点
            Node<E> target = node(index);
            //获取这个结点的前结点
            Node<E> pre = target.prev;
            //创建一个新的结点
            Node<E> newNode = new Node<E>(pre,e,target);

            //目标结点是 头结点
            if(pre == null){
                first = newNode;
                target.prev = newNode;
            }else {
                //修改指针
                pre.next = newNode;
                target.prev = newNode;
            }
            size ++ ;
        }
    }


    /**
     * 添加一个 集合, 添加到末尾
     * @param list 集合数据
     */
    public void addAll(SingleLinked<E> list){
        if(list == null || list.size == 0){
            return;
        }
        Node l = last;
        last = list.last;
        //链表为空
        if(l == null){
            first = list.first;
        }else{
            //链表不为空，则将原来链表的最后一个结点和新的链表的结点连接起来即可
            Node<E> node = node(size);
            node.next = list.first;
            list.first.prev = node;
        }
    }


    /**
     * 添加在尾部
     * @param e 数据
     */
    private void linkLast(E e){
        //创建一个节点
        Node<E> newNode = new Node<E>(last,e,null);
        Node<E> l = last;
        last = newNode;

        //整个链表为空
        if(l == null){
            first = newNode;
        }else{
            l.next = newNode;
        }
        size ++ ;
    }


    /**
     * 获取数据
     * @param index 跟据位置获取数据
     * @return 数据
     */
    public E get(int index){
        if(index <0 || index > size) {
            return null;
        }
        return node(index).item;
    }


    /**根据索引，进行查找，判断 index 在整个链表的前半部还是后半部
     * @param index 位置
     * @return 结点
     */
    private Node<E> node(int index){
        Node<E> node = null;
        //前半部
        if(index < (size / 2)){
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        //后半部
        else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }


    /**根据索引，进行查找，判断 index 在整个链表的前半部还是后半部
     * @param e 数据
     * @return 结点
     */
    private Node<E> node(E e){
        Node<E> node = first;
        //前半部
        if(size == 0){
            return null;
        }
        for (int i = 0;i < size; i++){
            node = node.next;
            if(node.item == e){
                break;
            }
        }
        return node;
    }


    /**
     * 删除操作
     * @param index 位置
     * @return 数据
     */
    public E remove(int index){
        Node<E> target = node(index);
        unLinkNode(target);
        return target.item;
    }


    /**
     * 删除数据
     * @param e 数据
     * @return 数据
     */
    public E remove(E e){
        Node<E> target = node(e);
        if(target == null){
            return null;
        }
        unLinkNode(target);
        return target.item;
    }


    /**
     * 删除数据
     * @param p 结点
     */
    private void unLinkNode(Node<E> p){
        Node<E> pre = p.prev;
        Node<E> next = p.next;

        //头结点
        if(pre == null){
            first = p.next;
        }else{
            pre.next = next;
        }

        //尾结点
        if(next == null){
            last = p.prev;
        }else{
            next.prev = pre;
        }

        size -- ;
    }




    /**
     * 结点类
     * @param <E>
     */
    private static class Node<E>{
        //数据
        E item;
        //前驱引用
        Node<E> prev;
        //后继引用
        Node<E> next;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

}
