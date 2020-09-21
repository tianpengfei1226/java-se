package com.tpf.designpattern.递归;

import java.util.Stack;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  快速从1加到100.java,v 1.0, 2020/8/13-17:17 Exp $
 */
public class 快速从1加到100 {

    public static void main(String[] args) {
        System.out.println(sumCircle(1, 100));
        System.out.println(sumCircle2(1, 100));
        System.out.println(sumCircle3(1, 100));
    }

    private static int sumCircle(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    private static int sumCircle2(int min, int max) {
        // 边界条件
        if (min >= max) {
            return min;
        }
        // 问题规模缩小
        int sum = sumCircle2(min, max - 1);
        // 加上当前值
        sum += max;
        // 返回
        return sum;
    }


    private static int sumCircle3(int min, int max) {
        return min >= max ? min : sumCircle3(min, max - 1) + max;
    }


    /**
     * 修改递归为非递归的套路
     * 还是使用上面的例子，现在我们需要把递归修改成非递归，且不是使用for循环的那种形式，要怎么实现呢？
     *
     * 首先，我们要自己模拟一个栈；
     *
     * 然后，找到边界条件；
     *
     * 最后，朝着边界条件的方向缩小问题规模；
     * @param min
     * @param max
     * @return
     */
    private static int sumNonRecursive(int min, int max) {
        int sum = 0;
        // 声明一个栈
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(max);
        while (!stack.isEmpty()) {
            if (max > min) {
                // 要计算max，先计算max-1
                stack.push(--max);
            } else {
                // 问题规模缩小到一定程度，计算返回
                sum += stack.pop();
            }
        }
        return sum;
    }


}


/**
 * 其实跟递归的套路是一样的，只不过改成自己模拟栈来实现。
 *
 * 这个例子可能不是那么明显，我们再举个二叉树遍历的例子来看一下
 */
class BinaryTree {

    Node root;

    // 插入元素
    void put(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node parent = root;
            while (true) {
                if (value <= parent.value) {
                    if (parent.left == null) {
                        parent.left = new Node(value);
                        return;
                    } else {
                        parent = parent.left;
                    }
                } else {
                    if (parent.right == null) {
                        parent.right = new Node(value);
                        return;
                    } else {
                        parent = parent.right;
                    }
                }

            }
        }
    }

    // 先序遍历
    void preTraversal(Node x) {
        if (x == null) return;
        System.out.print(x.value + ",");
        preTraversal(x.left);
        preTraversal(x.right);
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.put(3);
        binaryTree.put(1);
        binaryTree.put(2);
        binaryTree.put(7);
        binaryTree.put(8);
        binaryTree.put(5);
        binaryTree.put(4);
        binaryTree.put(6);
        binaryTree.put(9);
        binaryTree.put(0);

        binaryTree.preTraversal(binaryTree.root);
    }

    /**
     * 所以，这个二叉树的先序遍历结果为3,1,0,2,7,5,4,6,8,9,。
     *
     * 可以看到，使用递归先序遍历二叉树非常简单，而且代码清晰易懂，那么，它如何修改为非递归实现呢？
     *
     * 首先，我们要自己模拟一个栈；
     *
     * 然后，找到边界条件，为节点等于空时；
     *
     * 最后，缩小问题规模，这里是先把右子树压栈，再把左子树压栈，因为先左后右；
     *
     * 好了，来看代码实现：
     * @param x
     */
    // 先序遍历非递归形式
    void nonRecursivePreTraversal(Node x) {
        // 自己模拟一个栈
        Stack<Node> stack = new Stack<Node>();
        stack.push(x);
        while (!stack.isEmpty()) {
            Node tmp = stack.pop();
            // 隐含的边界条件
            if (tmp != null) {
                System.out.print(tmp.value + ",");
                // 缩小问题规模
                stack.push(tmp.right);
                stack.push(tmp.left);
            }
        }
    }

}