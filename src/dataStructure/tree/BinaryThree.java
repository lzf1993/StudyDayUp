package dataStructure.tree;

/**
 * 二叉树:
 *     叉树是每个结点最多有两个子树的树结构。通常子树被称作“左子树”（left subtree）和“右子树”（right subtree）。
 *     二叉树常被用于实现二叉查找树和二叉堆。
 */
class BinaryThree {

    public Node<String> root;

    public static void main(String args[]){
        BinaryThree three = new BinaryThree("A");
        three.createThree();
        three.midOrderTraverse(three.root);
    }


    public BinaryThree(String data) {
        this.root = new Node<>(data,null,null);
    }

    /**
     * 创建树
     */
    public void createThree(){
        Node<String> nodeB = new Node<>("B",null,null);
        Node<String> nodeC = new Node<>("C",null,null);
        Node<String> nodeD = new Node<>("D",null,null);
        Node<String> nodeE = new Node<>("E",null,null);
        Node<String> nodeF = new Node<>("F",null,null);
        Node<String> nodeG = new Node<>("G",null,null);
        Node<String> nodeH = new Node<>("H",null,null);
        Node<String> nodeI = new Node<>("I",null,null);
        Node<String> nodeJ = new Node<>("J",null,null);
        Node<String> nodeK = new Node<>("K",null,null);


        root.lefChild = nodeB;
        root.rightChild = nodeC;

        nodeB.lefChild = nodeD;
        nodeB.rightChild = nodeE;

        nodeC.lefChild = nodeF;
        nodeC.rightChild = nodeG;

        nodeD.lefChild = nodeH;
        nodeD.rightChild = nodeI;

        nodeG.lefChild = nodeJ;
        nodeG.rightChild = nodeK;
    }


    /**
     * 中序遍历：左 - 中 - 右 ： 汉罗塔
     * @param root
     */
    public void midOrderTraverse(Node<String> root){
        if(root == null){
            return;
        }
        //执行一遍
        midOrderTraverse(root.lefChild);
        //处理逻辑
        System.out.println(" "+root.data);
        //再执行一遍
        midOrderTraverse(root.rightChild);
    }


    /**
     * 前序遍历： 中 - 左 - 右 ： Arrays.sort、 快速排序
     * @param root
     */
    public void proOrderTraverse(Node<String> root){
        if(root == null){
            return;
        }
        //执行逻辑
        System.out.println(" "+root.data);
        //处理一遍
        midOrderTraverse(root.lefChild);
        //再处理一遍
        midOrderTraverse(root.rightChild);
    }


    /**
     * 后序遍历： 左 - 右 - 中 ： 归并排序法
     * @param root
     */
    public void endOrderTraverse(Node<String> root){
        if(root == null){
            return;
        }
        //处理一遍
        midOrderTraverse(root.lefChild);
        //再处理一遍
        midOrderTraverse(root.rightChild);
        //执行逻辑
        System.out.println(" "+root.data);
    }


    public static class Node<T>{
        public T data;
        public Node<T> lefChild;
        public Node<T> rightChild;

        public Node(T data, Node<T> lefChild, Node<T> rightChild) {
            this.data = data;
            this.lefChild = lefChild;
            this.rightChild = rightChild;
        }
    }
}
