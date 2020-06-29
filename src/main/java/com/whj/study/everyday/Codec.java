package com.whj.study.everyday;

import lombok.val;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 *
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 *
 * 示例:
 *
 * 你可以将以下二叉树：
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * 序列化为 "[1,2,3,null,null,4,5]"
 * @author: whj
 * @time: 2020/6/16 14:24
 */
public class Codec {

    public static void main(String[] args) {
//        Codec codec = new Codec();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(5);

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);

//        String result = codec.serialize(root);
//        System.out.println(result);


        Codec codec = new Codec();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(7);
//        root.right.right = new TreeNode(8);
//        root.left.left.left = new TreeNode(6);
//        root.right.left.left = new TreeNode(9);
//        String result = codec.serialize(root);
//        System.out.println(result);
//        TreeNode node = codec.deserialize(result);
//        System.out.println(node);

//        String serialize = codec.serialize(codec.deserialize("[1,2,4,6,null,null,null,5,null,null,3,7,9,null,null,null,8,null,null]"));
//        System.out.println(serialize);

        recoverFromPreorder("1-401--349---90--88");

    }

    /**
     * Encodes a tree to a single string.
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        printTree(builder, root);
        String result = builder.substring(0, builder.length() - 1);
        return result + "]";
    }



    private void printTree(StringBuilder builder, TreeNode treeNode) {
        if (treeNode == null) {
            myPrint(builder, null);
            return;
        }
        myPrint(builder,treeNode.val);
        printTree(builder,treeNode.left);
        printTree(builder,treeNode.right);
    }

    private void myPrint(StringBuilder builder, Integer val) {
        builder.append(val).append(",");
    }


    /**
     * Decodes your encoded data to tree.
     * @param data
     * @return
     */
    public TreeNode deserialize(String data) {
        String emptyStr = "[]";
        if (emptyStr.equals(data)) {
            return null;
        }
        String[] split = data.substring(1, data.length() - 1).split(",");

        int[] index = {0};
        TreeNode root = generateTree(split, index);



        return root;
    }


    private TreeNode generateTree(String[] split, int[] index) {

        if (index[0] >= split.length || "null".equals(split[index[0]]) ) {
            return null;
        }

        TreeNode treeNode = new TreeNode(Integer.parseInt(split[index[0]]));
        index[0] = index[0]+1;
        treeNode.left = generateTree(split, index);
        index[0] = index[0]+1;
        treeNode.right = generateTree(split, index);
        return treeNode;

    }


    /**
     * 我们从二叉树的根节点 root 开始进行深度优先搜索。
     *
     * 在遍历中的每个节点处，我们输出 D 条短划线（其中 D 是该节点的深度），然后输出该节点的值。（如果节点的深度为 D，则其直接子节点的深度为 D + 1。根节点的深度为 0）。
     *
     * 如果节点只有一个子节点，那么保证该子节点为左子节点。
     *
     * 给出遍历输出 S，还原树并返回其根节点 root。
     * @param S
     * @return
     */
    public static TreeNode recoverFromPreorder(String S) {
        char splitStr = '-';
        int firstSplitIndex = S.indexOf(splitStr);
        if (firstSplitIndex < 0) {
            TreeNode root = new TreeNode(Integer.parseInt(S));
            return root;
        }
        String first = S.substring(0, firstSplitIndex);

        Map<Integer, TreeNode> levels = new HashMap<>();
        TreeNode root = new TreeNode(Integer.parseInt(first));
        levels.put(0, root);
        String treeStr = S;
        int location = firstSplitIndex;
        while (true) {
            int index = 0;
            // 查找--
            char split = treeStr.charAt(location);
            while (split == splitStr) {
                index++;
                split = treeStr.charAt(location+index);
            }
            // 截取--
            String str = treeStr.substring(location, location + index);
            location += index;
            // 存储--，并指向位置
            int level = str.length();


            int splitIndex = treeStr.indexOf(splitStr, location);
            String num = splitIndex > 0 ? treeStr.substring(location,splitIndex) : treeStr.substring(location);
            location += num.length();
            TreeNode node = new TreeNode(Integer.parseInt(num));
            levels.put(level, node);


            TreeNode parentNode = levels.get(level - 1);
            if (parentNode.left == null) {
                parentNode.left = node;
            } else {
                parentNode.right = node;
            }

            if (splitIndex < 0) {
                break;
            }


        }

        return root;
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
