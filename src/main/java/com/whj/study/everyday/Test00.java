package com.whj.study.everyday;

/**
 * @description:
 * @author: whj
 * @time: 2020/8/18 19:41
 */
public class Test00 {

    static ListNode globalHead;

    public static void main(String[] args) {

//        ListNode head = new ListNode(1);
//
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//        head.next.next.next.next.next.next = new ListNode(7);
//        head.next.next.next.next.next.next.next = new ListNode(8);
//        head.next.next.next.next.next.next.next.next = new ListNode(9);
//        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
//        sortedListToBST(head);


        byte b1 = 0X1F;
        byte b2 = 0X1;
        System.out.println(b1*100+b2);
        System.out.println(0X1F1);
        System.out.println(16*16 + 15*16 +1);
    }



    public static TreeNode sortedListToBST(ListNode head) {
        globalHead = head;
        int length = getLength(head);
        return buildTree(0, length - 1);
    }

    public static int getLength(ListNode head) {
        int ret = 0;
        while (head != null) {
            ++ret;
            head = head.next;
        }
        return ret;
    }

    public static TreeNode buildTree(int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right + 1) / 2;
        TreeNode root = new TreeNode();
        root.left = buildTree(left, mid - 1);
        root.val = globalHead.val;
        globalHead = globalHead.next;
        root.right = buildTree(mid + 1, right);
        return root;
    }


    public  static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;

       TreeNode() {
       }

       TreeNode(int val) {
           this.val = val;
       }

       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
}
