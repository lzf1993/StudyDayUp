package dataStructure.tree;

import java.util.NoSuchElementException;

/**
 *  二叉排序树:
 *       或者是一颗空树，或者是一颗具有如下性质的树：
 *             1）若左子树不为空，那么左子树上面的所有节点的关键字值都比根节点的关键字值小
 *             2）若右子树不为空，那么右子树上面的所有节点的关键字值都比根节点的关键字值大
 *             3）左右子树都为二叉树
 *             4）没有重复值（这一点在实际中可以忽略）
 */
class BinarySortTree {

    //根节点
    private Node rootNode;

    public BinarySortTree() {
    }


    public static void main(String args[]){
        int array[] = new int[]{11,2,3,4,455,64,132,44,56,32,67,888,231,97,54,34,32,2,321,31,1,312,34,54,543,5,5,5,5,5};
        BinarySortTree three = new BinarySortTree();
        //二叉树：添加元素
        for(int i=0; i< array.length; i++){
            three.putNode(array[i]);
        }
        //二叉树：遍历
        three.midOrderTravels();
        //二叉树：查找元素
        Node node = three.searchNode(888);
        if(node == null){
            System.out.print("\n没有找到该元素");
        }else{
            System.out.print("\n找到该元素 " + node.data);
        }
        three.deleteNode(node);
        System.out.println("\n删除后");
        //二叉树：遍历
        three.midOrderTravels();
    }


    /**
     * 1、查找元素
     * @param data 数据
     * @return 返回查找到的元素
     */
    public Node searchNode(int data){
        if(rootNode == null){
            return null;
        }
        //记录移动的指针
        Node node = rootNode;
        while(node != null){
            //找到元素，则返回根节点
            if(data == node.data){
                return node;
            }
            //要查找元素大于根节点，则指针继续往右边继续移动
            else if(data > node.data){
                node = node.rightChild;
            }
            //要查找元素小于根节点，则指针往左边继续移动
            else{
                node = node.leftChild;
            }
        }
        //没有查找到，返回空
        return null;
    }


    /**
     * 2、添加元素
     * @param data 数据
     */
    public void putNode(int data){
        //没有元素
        if(rootNode == null){
            rootNode = new Node(data);
            return;
        }
        //记录节点的根节点
        Node parent = null;
        //指针移动的当前节点
        Node node = rootNode;
        while(node!=null){
            parent = node;
            if(data < node.data){
                node = node.leftChild;
            }else if(data > node.data){
                node = node.rightChild;
            }else{
                //有相等的根节点, 不处理
                return;
            }
        }
        //建立一个新的节点，并放在合适的位置
        Node newNode = new Node(data);
        //放在左边
        if(data < parent.data){
            parent.leftChild = newNode;
        }
        //放在右边
        else{
            parent.rightChild = newNode;
        }
        newNode.parent = parent;
    }


    /**
     * 3、遍历元素
     */
    public void midOrderTravels(){
        midOrderTravels(rootNode);
    }


    /**
     * 遍历元素中序遍历
     */
    private void midOrderTravels(Node node){
        if(node == null){
            return;
        }
        //访问左子树
        midOrderTravels(node.leftChild);
        //访问根节点
        System.out.print(" " + node.data);
        //访问右子树
        midOrderTravels(node.rightChild);
    }


    /**
     * 删除节点：
     *   1、节点是叶子 ： 可能树上只有一个节点或是一个空树
     *   2、只有左孩子
     *   3、只有右孩子
     *   4、左右孩子都有
     */
    public void deleteNode(Node node){
        if(node == null){
            throw new NoSuchElementException();
        }
        //获取父节点
        Node parent = node.parent;

        //要删除元素的左右子树都是空，是一个叶子节点
        //有三种情况：
        //  1、该节点是跟节点，没有其他元素
        //  2、该节点是左子树
        //  3、该节点是右子树
        if(node.leftChild == null && node.rightChild == null){
            if(parent == null){
                //则是根节点
                rootNode = null;
            }else if(parent.leftChild == node){
                parent.leftChild = null;
            }else if(parent.rightChild == node){
                parent.rightChild = null;
            }
            //该节点指向父节点为空
            node.parent = null;
        }
        //要删除元素只有左孩子
        //  有三种情况：
        //   1、要删除元素是根节点，则左子树的父节点直接置为空，父节点指向该节点的左子树
        //   2、如果不是根节点，是父节点的左子树
        //   3、如果不是根节点，是父节点的右子树
        else if(node.leftChild != null && node.rightChild == null){
            //要删除元素是根节点，则将该节点的左子树当做根节点
            if(parent == null){
                node.leftChild.parent = null;
                rootNode = node.leftChild;
            }else{
                //该节点是左子树
                if(parent.leftChild == node){
                    parent.leftChild = node.leftChild;
                    node.leftChild.parent = parent;
                }
                //该节点是右子树
                else{
                    parent.rightChild = node.leftChild;
                    node.leftChild.parent = parent;
                }
            }
        }
        //只有右孩子
        //  有三种情况：
        //   1、要删除元素是根节点，则右子树的父节点直接置为空，父节点指向该节点的左子树
        //   2、如果不是根节点，是父节点的左子树
        //   3、如果不是根节点，是父节点的右子树
        else if(node.rightChild != null && node.leftChild == null){
            //则说明删除的是根节点
            if(parent == null){
                node.rightChild.parent = null;
                rootNode = node.rightChild;
            }else{
                //如果是左节点
                if(parent.leftChild == node){
                    parent.leftChild = node.rightChild;
                    node.rightChild.parent = parent;
                }
                //如果是右节点
                else{
                    parent.rightChild = node.rightChild;
                    node.rightChild.parent = parent;
                }
            }
        }
        //左右孩子都不为空
        else{
            //如果右子树的左子树为空，则直接取右子树填上去。
            if(node.rightChild.leftChild == null){
                //将该节点的左子树，当成新节点的左子树
                node.rightChild.leftChild = node.leftChild;
                node.leftChild.parent = node.rightChild;
                //如果是根节点
                if(node.parent == null){
                    //根节点指向该节点的右子树的
                    rootNode = node.rightChild;
                }else{
                    //如果该节点是个左子树
                    if(parent.leftChild == node){
                        parent.leftChild = node.rightChild;
                        node.rightChild.parent = parent;
                    }
                    //该节点是个右子树
                    else{
                        parent.rightChild = node.rightChild;
                        node.rightChild.parent = parent;
                    }
                }
            }
            //该节点右子树的左子树不为空，则需要从右子树中，查找一个最小的节点。
            else{
                //获取最小的节点
                Node minNode = getMinNode(node.rightChild.leftChild);
                //1、要删除节点的坐节点，变成新的节点的左节点
                minNode.leftChild = node.leftChild;
                //2、将这个新的节点的右节点变成，这个新节点父节点的左节点
                Node minNodeParent = minNode.parent;
                minNodeParent.leftChild = minNode.rightChild;
                //3、要删除节点的右节点，变成新的阶段的右节点
                minNode.rightChild = node.rightChild;
                //4、跟根节点连接起来
                if(parent == null){
                    rootNode = minNode;
                }else{
                    if(parent.leftChild == node){
                        parent.leftChild = minNode;
                    }else{
                        parent.rightChild = minNode;
                    }
                }
            }
        }
        //将无用的引用置为空
        node.parent = null;
        node.leftChild = null;
        node.rightChild = null;
    }


    /**
     * 获取最小的节点
     * @param node  节点
     * @return 获取最小的节点
     */
    private Node getMinNode(Node node){
        Node curRoot=null;
        if(node==null){
            return null;
        }else{
            curRoot=node;
            while(curRoot.leftChild!=null){
                curRoot=curRoot.leftChild;
            }
        }
        return curRoot;
    }



    /**
     * 节点类
     */
    public static class Node{
        //数据
        public int data;
        //左子树节点
        public Node leftChild;
        //右子树节点
        public Node rightChild;
        //父节点
        public Node parent;

        public Node(int data) {
            this.data = data;
        }
    }


}
