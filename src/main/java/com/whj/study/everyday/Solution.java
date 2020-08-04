package com.whj.study.everyday;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: whj
 * @time: 2020/6/15 11:18
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] arr = {"flower","flow","flight"};
//        String[] arr = {"dog","racecar","car"};
//        System.out.println(longestCommonPrefix(arr));
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(patternMatching("babbbbbbbbbbbabbbbbabbaaabbabbabab",
//                "wuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwuwuwuwuwuwuwuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwuwuwewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuywewujvvuuulhhgflelgvhyggulpfgjuuuluyguwjgyvggwphggphghgyfpeyvwgggvlgvwyvlhvhghvujghuhwywpuwu"
//        ));

//        System.out.println(addBinary("101111","10"));
//        int[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};
//        quickSort(arr, 0, arr.length - 1);
//        for (int a:arr) {
//            System.out.print(a + ",");
//        }

//        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
//        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
//        System.out.println(findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
//        int[][] arr = new int[][]{{ 1,  5,  9},{10, 11, 13},{12, 13, 15}};
//        System.out.println(kthSmallest(arr, 4));
//        int[] boards = divingBoard(1, 2, 3);
//        for (int i: boards ) {
//            System.out.print(i +"  ");
//        }
//        System.out.println(respace(new String[]{"ouf","uucuocucoouoffcpuuf","pf","o","fofopupoufuofffffocpocfccuofuupupcouocpocoooupcuu","cf","cffooccccuoocpfupuucufoocpocucpuouofffpoupu","opoffuoofpupcpfouoouufpcuocufo","fopuupco","upocfucuucfucofufu","ufoccopopuouccupooc","fffu","uuopuccfocopooupooucfoufop","occ","ppfcuu","o","fpp","o","oououpuccuppuococcpoucccffcpcucoffupcoppoc","ufc","coupo","ufuoufofopcpfoufoouppffofffuupfco","focfcfcfcfpuouoccupfccfpcooup","ffupfffccpffufuuo","cufoupupppocou","upopupopccffuofpcopouofpoffopcfcuooocppofofuuc","oo","pccc","oupupcccppuuucuuouocu","fuop","ppuocfuppff","focofooffpfcpcupupuuooufu","uofupoocpf","opufcuffopcpcfcufpcpufuupffpp","f","opffp","fpccopc"},
//                "fofopupoufuofffffocpocfccuofuupupcouocpocoooupcuufffufffufpccopc"));

//        Solution solution = new Solution();
//        int[] intersect = solution.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
//        printArray(intersect);

//        System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 0));
//        int[] locations = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
//        printArray(locations);
//        List<TreeNode> treeNodes = solution.generateTrees(3);
//        treeNodes.forEach(treeNode -> {
//            System.out.println(treeNode);
//        });

//        System.out.println(solution.divisorGame(10));
//        System.out.println(solution.isSubsequence("abc", "ahbgdc"));
//        System.out.println(solution.addStrings("99","1"));
//        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
//        System.out.println(solution.minPathSum(arr));
//        int[][] arr = {{1,0}};
//        int[][] arr = {{1,0},{0,2},{2,1}};
        int[][] arr = {{1,0},{2,1}};
        System.out.println(solution.canFinish(3, arr));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 1) {
            return true;
        }
        int[] counts = new int[numCourses];
        List<Integer>[] lists = new ArrayList[numCourses];
        for (int i = 0; i < prerequisites.length ; i++) {
            int index = prerequisites[i][1];
            if (lists[index] == null) {
                lists[index] = new ArrayList<>();
            }
            lists[index].add(prerequisites[i][0]);

            counts[prerequisites[i][0]] += 1;
        }
        List<Integer> hasPush = new ArrayList<>();
        boolean hasZero = true;
        while (hasPush.size() < numCourses && hasZero) {
            hasZero = false;
            for (int i = 0; i < numCourses; i++) {
                if (hasPush.contains(i)) {
                    continue;
                }
                Integer nums = counts[i];
                if (nums == null || nums.intValue() == 0) {
                    hasPush.add(i);
                    hasZero = true;
                    if (lists[i] == null || lists[i].isEmpty()) {
                        continue;
                    }
                    for (Integer m: lists[i]) {
                        counts[m] -= 1;
                        if (counts[m] == 0) {
                            hasPush.add(m);
                        }
                    }
                }
            }
        }




        return hasPush.size() == numCourses;
    }




    /**
     * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
     *
     * 说明：每次只能向下或者向右移动一步。
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] minArr = new int[m][n];
        minArr[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            minArr[0][i] = minArr[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            minArr[i][0] = minArr[i-1][0] + grid[i][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                minArr[i][j] = Math.min(minArr[i-1][j], minArr[i][j-1]) + grid[i][j];
            }
        }

        return minArr[m-1][n-1];
    }

    /**
     * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
     *
     * 注意：
     *
     *     num1 和num2 的长度都小于 5100.
     *     num1 和num2 都只包含数字 0-9.
     *     num1 和num2 都不包含任何前导零。
     *     你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.length() == 0 ){
            return num2;
        }
        if (num2 == null || num2.length() == 0 ){
            return num1;
        }
        StringBuilder builder = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j>= 0 || carry != 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            builder.insert(0,carry%10);
            carry /= 10;
        }
        return builder.toString();
        
    }

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                return new int[]{map.get(sub), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     *
     * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
     *
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j=0;
        while (i<n && j<m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }


    /**
     * 爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。
     *
     * 最初，黑板上有一个数字 N 。在每个玩家的回合，玩家需要执行以下操作：
     *
     *     选出任一 x，满足 0 < x < N 且 N % x == 0 。
     *     用 N - x 替换黑板上的数字 N 。
     *
     * 如果玩家无法执行这些操作，就会输掉游戏。
     *
     * 只有在爱丽丝在游戏中取得胜利时才返回 True，否则返回 false。假设两个玩家都以最佳状态参与游戏。
     * 输入：2
     * 输出：true
     * 解释：爱丽丝选择 1，鲍勃无法进行操作。
     * 输入：3
     * 输出：false
     * 解释：爱丽丝选择 1，鲍勃也选择 1，然后爱丽丝无法进行操作。
     * @return
     */
    public boolean divisorGame(int N) {
        /**
         * return N%2 == 0;
         */
        if (N == 1) {
            return false;
        }
        if (N == 2) {
            return true;
        }
        boolean[] win = new boolean[N+1];
        win[1] = false;
        win[2] = true;

        for (int i = 3; i <= N; i++) {
            for (int j = 1; j <= i/2 ; j++) {
                if (i%j  == 0 && !win[i-j]) {
                    win[i] = true;
                    break;
                }
            }
        }

        return win[N];
    }


    /**
     * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
     *
     * @param n
     * @return
     */
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> treeNodes = new ArrayList<>();
        if (n==0) {
            return treeNodes;
        }
        return generateTrees(1, n);
    }
    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = start; i <= end ; i++) {
            List<TreeNode> leftTree = generateTrees(start, i - 1);
            List<TreeNode> rightTree = generateTrees(i+1, end);
            for (TreeNode left: leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode treeNode = new TreeNode(i);
                    treeNode.left = left;
                    treeNode.right = right;
                    allTrees.add(treeNode);
                }
            }
        }
        return allTrees;
    }







    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "{val:"+val + ", left:" +left + ", right:" + right +"}";
        }
    }

    /**
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     *
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     *
     * 说明:
     *
     *     返回的下标值（index1 和 index2）不是从零开始的。
     *     你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low+1, high+1};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }

        return new int[]{-1,-1};
    }

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length == 0 || target <= nums[0]) {
            return 0;
        }
        if (target == nums[length - 1]) {
            return length -1;
        }
        if (target > nums[length - 1]) {
            return length;
        }
        for (int i = 1; i < length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return length;
    }

    public static void printArray(int[] array) {
        for (int i:array) {
            System.out.print(i+"  ");
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> numsMap1 = getNumCountMap(nums1);
        Map<Integer, Integer> numsMap2 = getNumCountMap(nums2);

        int index = 0;
        if (numsMap1.size() > numsMap2.size()) {
            int[] list = new int[numsMap1.size()];
            for (Map.Entry<Integer, Integer> entry1: numsMap1.entrySet()) {
                if (!numsMap2.containsKey(entry1.getKey())){
                    continue;
                }
                int min = Math.min(entry1.getValue(), numsMap2.get(entry1.getKey()));
                for (int i = 0; i < min; i++) {
                    list[index++] = entry1.getKey();
                }
            }

            return Arrays.copyOfRange(list, 0, index);
        } else {
            int[] list = new int[numsMap2.size()];
            for (Map.Entry<Integer, Integer> entry2: numsMap2.entrySet()) {
                if (!numsMap1.containsKey(entry2.getKey())){
                    continue;
                }
                int min = Math.min(entry2.getValue(), numsMap1.get(entry2.getKey()));
                for (int i = 0; i < min; i++) {
                    list[index++] = entry2.getKey();
                }
            }

            return Arrays.copyOfRange(list, 0, index);
        }

    }

    private Map<Integer, Integer> getNumCountMap(int[] nums1) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        for (int i: nums1) {
            if (nums1Map.containsKey(i)) {
                nums1Map.put(i, nums1Map.get(i) + 1);
            } else {
                nums1Map.put(i, 1);
            }
        }
        return nums1Map;
    }

    /**
     * 哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，并且大写也弄成了小写。像句子"I reset the computer. It still didn’t boot!"已经变成了"iresetthecomputeritstilldidntboot"。在处理标点符号和大小写之前，你得先把它断成词语。当然了，你有一本厚厚的词典dictionary，不过，有些词没在词典里。假设文章用sentence表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。
     * 注意：本题相对原题稍作改动，只需返回未识别的字符数
     * 输入：
     * dictionary = ["looked","just","like","her","brother"]
     * sentence = "jesslookedjustliketimherbrother"
     * 输出： 7
     * 解释： 断句后为"jess looked just like tim her brother"，共7个未识别字符。
     * @param dictionary
     * @param sentence
     * @return
     */
    public static int respace(String[] dictionary, String sentence) {
        int length = sentence.length();
        Trie root = new Trie();
        for (String word: dictionary) {
            root.insert(word);
        }
        int[] dp = new int[length + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        char a = 'a';
        for (int i = 0; i < length; i++) {
            dp[i + 1] = dp[i] + 1;
            Trie curPos = root;
            for (int j = i; j >= 0; j--) {
                int index = sentence.charAt(j) - a;
                Trie curWord = curPos.next[index];
                if (curWord == null) {
                    break;
                } else if (curWord.isEnd) {
                    dp[i + 1] = Math.min(dp[i+1], dp[j]);
                }
                if (dp[i+1] == 0) {
                    break;
                }
                curPos = curWord;
            }
        }
        return dp[length];
    }

    public static class Trie{
        private Trie[] next = new Trie[26];
        private boolean isEnd = false;

        public void insert(String str) {
            if (str == null || str.length() == 0) {
                return;
            }

            Trie curPos = this;
            for (int i = str.length() - 1; i >= 0 ; i--) {
                int index = str.charAt(i) - 'a';
                if (curPos.next[index] == null) {
                    curPos.next[index] = new Trie();
                }
                curPos = curPos.next[index];
            }
            curPos.isEnd = true;
        }
    }
//    public static int respace(String[] dictionary, String sentence) {
//        List<String>[] array = new ArrayList[sentence.length()];
//
//        for (int i = 0; i < sentence.length() ; i++) {
//            char c = sentence.charAt(i);
//            StringBuilder builder = new StringBuilder();
//            builder.append(c);
//            int has = hasStr(builder.toString(), dictionary);
//            if (has == -1) {
//                array[i]= null;
//                continue;
//            }
//            for (int j = i+1; j < sentence.length(); j++) {
//                builder.append(sentence.charAt(j));
//                int has2 = hasStr(builder.toString(), dictionary);
//                if (has2 == -1) {
//                   break;
//                } else if (has2 == 2) {
//                    List<String> values = getValue(i, array);
//                    values.add(builder.toString());
//                }
//            }
//        }
//
//
//
//
//
//
//    }


    public static int count(int index, Integer count, String sentence, Map<Integer, List<String>> map, List<Integer> counts) {
        if (index >= sentence.length() - 1) {
            counts.add(count);
            return count;
        }
        for (int i = index; i < sentence.length() ; ) {

            List<String> values = map.get(i);
            if (values == null) {
                count = count == null ? 1 : count+1;
                i++;
                continue;
            }
            for (int j = 0; j < values.size(); j++) {
                String value = values.get(j);

                    j += value.length();
                    int num = count(j,count, sentence, map, counts);

            }


        }
        return count;
    }

    public static int countUnknow() {
        // 不存在 +1
        // 包含

        return 0;
    }


    public static List<String> getValue(int i,List<String>[] map){
        List<String> list = map[i];
        if (list == null) {
            list = new ArrayList<>();
            map[i] = list;
        }
        return list;
    }
    public static int hasStr(String str, String[] dictionary){
        for (String d: dictionary) {
            if (d.equals(str)) {
                return 2;
            }
            if (d.startsWith(d)) {
                return 1;
            }
        }

        return -1;
    }




    public static int page(String[] dictionary, String sentence, int start, int length) {
        return 0;
    }

    /**
     * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
     *
     * 返回的长度需要从小到大排列。
     *输入：
     * shorter = 1
     * longer = 2
     * k = 3
     * 输出： {3,4,5,6}
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter*k};
        }
        int[] lengthArr = new int[k+1];
        for (int i = 0; i <= k ; i++) {
            lengthArr[i] = longer * i + shorter * (k-i);
        }
        return lengthArr;
    }

    /**
     * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
     * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = rows;//matrix[0].length;
        if (k == 0) {
            return matrix[0][0];
        } else if (k == rows * cols) {
            return matrix[rows][cols];
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < rows; i++) {
            pq.offer(new int[]{matrix[i][0], i, 0});
        }
        for (int i = 0; i < k-1; i++) {
            int[] poll = pq.poll();
            if (poll[2] < cols - 1) {
                pq.offer(new int[]{matrix[poll[1]][poll[2] + 1], poll[1], poll[2]+1});
            }
        }



        return pq.poll()[0];
    }




    /**
     * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
     * @param A
     * @param B
     * @return
     */
    public static int findLength(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) {
            return 0;
        }
        int[][] dp = new int[A.length][B.length];
        int maxLength = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                boolean same = A[i] == B[j];
                if (!same) {
                    dp[i][j] = 0;
                    continue;
                }
                if (i== 0 || j == 0) {
                    dp[i][j] = 1 ;
                } else {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                maxLength = dp[i][j] > maxLength ? dp[i][j] : maxLength;
            }
        }
        return maxLength;
    }
    public static int findLength0(int[] A, int[] B) {
        int maxLength = 0;
        for (int i = 0; i < A.length; i++) {
            int numA = A[i];
            for (int j = 0; j < B.length; j++) {
                int numB = B[j];
                if (numA != numB) {
                    continue;
                }
                int index = 1;
                while (true) {
                    if (i+index >= A.length || j+index >= B.length) {
                        break;
                    }
                    int numANext = A[i+index];
                    int numBNext = B[j+index];
                    if (numANext!=numBNext) {
                        break;
                    }
                    index++;
                }
                maxLength = index > maxLength ? index : maxLength;

            }
        }
        return maxLength;
    }

    /**
     * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {

        quickSort(nums, 0, nums.length - 1);


        return nums[nums.length - k];
    }

    public static int threeSumClosest(int[] nums, int target) {
        quickSort(nums, 0, nums.length - 1);

        Integer best = null;
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            int a = nums[i];

            int j=i+1,k=length-1;
            int sum = a + nums[j]+nums[k];
            if (sum == target) {
                return sum;
            }
            if (best== null || Math.abs(Math.subtractExact(sum,target)) < Math.abs(Math.subtractExact(best,target))) {
                best = sum;
            }
            boolean isOver = sum > target;
            for (; j<k;){
                if (isOver) {
                    for (k--;k>j;k--) {
                        if (nums[k+1] == nums[k]) {
                            continue;
                        }
                        int sum0 = a + nums[j]+nums[k];
                        if (sum0 == target) {
                            return sum0;
                        }
                        if (Math.abs(Math.subtractExact(sum0,target)) < Math.abs(Math.subtractExact(best,target))) {
                            best = sum0;
                        }
                        if (sum0 < target) {
                            j++;
                            k++;
                            break;
                        }

                    }

                } else {
                    for (j++;j<k;j++){
                        if (nums[j-1] == nums[j]) {
                            continue;
                        }
                        int sum0 = a + nums[j]+nums[k];
                        if (sum0 == target) {
                            return sum0;
                        }
                        if (Math.abs(Math.subtractExact(sum0,target)) < Math.abs(Math.subtractExact(best,target))) {
                            best = sum0;
                        }
                        if (sum0 > target) {
                            k--;
                            j--;
                            break;
                        }
                    }

                }

            }
        }
        return best;
    }

    /**
     * 快排
     * @param nums
     * @param start
     * @param end
     */
    public static void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int hole = nums[start];
        int left = start;
        int right = end;
        for (;left<right; right--) {
            if (nums[right] > hole) {
                continue;
            }
            nums[left] = nums[right];
            for (;left<right;left++) {
                if (nums[left] <= hole) {
                    continue;
                }
                nums[right] = nums[left];
                break;
            }
            if (left >= right) {
                break;
            }
        }
        nums[right] = hole;

        quickSort(nums, start, right - 1);
        quickSort(nums, right+1, end);
    }



    /**
     * 给你两个二进制字符串，返回它们的和（用二进制表示）。
     * 输入为 非空 字符串且只包含数字 1 和 0。
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {


        StringBuilder sum = new StringBuilder();
        char next = '0';
        char numZero = '0';
        char numOne = '1';
        int aLength = a.length();
        int bLength = b.length();
        int min = aLength <= bLength ? aLength : bLength;
        for (int i = 0; i < min; i++) {
            char one  = a.charAt(aLength - i - 1);
            char another = b.charAt(bLength - i - 1);
            if (one != another) {
                if (next == numOne) {
                    sum.insert(0, numZero);
                    next = numOne;
                } else {
                    sum.insert(0, numOne);
                    next = numZero;
                }
            } else if (one == numZero) {
                sum.insert(0, next);
                next = numZero;
            } else {
                sum.insert(0, next);
                next = numOne;
            }
        }

        // 判断长度
        if (aLength == bLength) {
          if (next == numOne) {
              sum.insert(0, numOne);
          }
        } else {
            String remain = aLength < bLength ? b.substring(0, bLength - aLength) : a.substring(0, aLength - bLength);
            if (next == numZero) {
                for (int i = remain.length() - 1; i >= 0 ; i--) {
                    sum.insert(0, remain.charAt(i));
                }
            } else {
                for (int i = remain.length() - 1; i >= 0 ; i--) {
                    char c = remain.charAt(i);
                    if (c==numOne) {
                        sum.insert(0, next==numOne ? numZero : numOne);
                        // next不变，原来进位仍进位，原来不进仍不进
                    } else {
                        sum.insert(0, next);
                        next = numZero;
                    }
                }
                if (next == numOne) {
                    sum.insert(0, numOne);
                }
            }
        }

        return sum.toString();

    }

    /**
     * 你有两个字符串，即pattern和value。 pattern字符串由字母"a"和"b"组成，用于描述字符串中的模式。
     * 例如，字符串"catcatgocatgo"匹配模式"aabab"（其中"cat"是"a"，"go"是"b"），
     * 该字符串也匹配像"a"、"ab"和"b"这样的模式。但需注意"a"和"b"不能同时表示相同的字符串。
     * 编写一个方法判断value字符串是否匹配pattern字符串。
     *
     * @param pattern
     * @param value
     * @return
     */
    public static boolean patternMatching(String pattern, String value) {
        if ("".equals(value) && "".equals(pattern)) {
            return true;
        } else if ("".equals(value) && pattern.length() == 1) {
            return true;
        } else if (isBlank(value) || isBlank(pattern)) {
            return false;
        }
        int patternLenth = pattern.length();
        int valueLength = value.length();
        if (patternLenth == 1) {
            return true;
        }

        char[] chars = pattern.toCharArray();

        int aLenth = pattern.replace("b", "").length();
        int bLenth = pattern.replace("a", "").length();
        // 不包含a或b
        if (!pattern.contains("b") || !pattern.contains("a")) {
            return  page(value, valueLength, patternLenth);
        }
        // a是空字符串
        if (valueLength % bLenth == 0) {
            if (page(value, valueLength, bLenth)) {
                return true;
            }
        }
        // b是空字符串
        if (valueLength % aLenth == 0) {
            if (page(value, valueLength, aLenth)) {
                return true;
            }
        }

        // 仅考虑a，b都有且都不为空字符串的情况，若有为空，则一定是false
        char start = pattern.charAt(0);
        int firstCount = start == 'a' ? aLenth : bLenth;
        int secondCount = start == 'a' ? bLenth : aLenth;
        double max = Math.ceil(valueLength/(aLenth<=bLenth ? aLenth : bLenth));
        for (int firstLength = 1; firstLength <= max ; firstLength++) {
            int mod = (valueLength - firstCount * firstLength) % secondCount;
            if (mod != 0) {
                continue;
            }
            int secondLength  = (valueLength - firstCount * firstLength) / secondCount;
            if (secondLength <= 0) {
                return false;
            }
            String startValue = value.substring(0, firstLength);
            int index = firstLength;
            boolean correct = true;
            String secondValue = null;
            for (int i = 1; i < chars.length; i++) {
                char next = chars[i];

                if (next == start) {
                    if (index >= valueLength || index+firstLength > valueLength) {
                        correct = false;
                        break;
                    }
                    if (!startValue.equals(value.substring(index, index+firstLength))) {
                        correct = false;
                        break;
                    }
                    index += firstLength;
                } else {
                    if (index >= valueLength || index+secondLength > valueLength) {
                        correct = false;
                        break;
                    }
                    if (secondValue == null) {
                        secondValue = value.substring(index, index+secondLength);
                    } else {
                        if (!secondValue.equals(value.substring(index, index+secondLength))) {
                            correct = false;
                            break;
                        }
                    }
                    index += secondLength;
                }
            }
            if (correct) {
                return true;
            }
        }

        return false;
    }

    private static boolean page(String value, int valueLength, int divisionLength) {
        int length = valueLength/divisionLength;
        if (length == 0 || valueLength % divisionLength != 0) {
            return false;
        }
        String b = value.substring(0, length);
        boolean same = true;
        for (int i = length; i < valueLength; i+=length) {
            if (!b.equals(value.substring(i, i+length))) {
                same = false;
            }

        }

        return same;
    }

    public static class Pattern{
        char pattern;
        String value;
    }
    /**
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        String blankReg = "\\s+";
        if (s == null || "".equals(s) || s.matches(blankReg) || s.length() == 1) {
            return true;
        }
        String target = s.replaceAll("[^a-zA-Z0-9]","").toUpperCase();
        int length = target.length();
        if (length == 1 || "".equals(target) || target.matches(blankReg)) {
            return true;
        }
        int half = length/2;
        char[] chars = target.toCharArray();
        for (int i = 0; i < half; i++) {
            if (chars[i] != chars[length - i - 1]) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPalindrome1(String s) {
        if (s == null || "".equals(s) || s.length() == 1) {
            return true;
        }
        String target = s.replaceAll("[^a-zA-Z0-9]","").toUpperCase();
        int length = target.length();
        if (length == 1 || "".equals(target)) {
            return true;
        }
        int half = length/2;
        int another = length - half;
        String prefix = target.substring(0, half);
        String suffixReverse = new StringBuilder(target.substring(another)).reverse().toString();
        if (prefix.equals(suffixReverse)) {
            return true;
        }

        return false;
    }


    /**
     * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
     *
     * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
     *
     * 返回一对观光景点能取得的最高分。
     * @param A
     * @return
     */
    public int maxScoreSightseeingPair(int[] A) {
        int length = A.length;

        int leftMax = A[0] + 0;
        int sum = Integer.MIN_VALUE;

        for (int j = 1; j < length; j++) {
            sum = Math.max(sum, leftMax + A[j] -j );
            leftMax = Math.max(leftMax, A[j] + j);
        }

        return sum;
    }
    public int maxScoreSightseeingPair_fail_overtime(int[] A) {
        int length = A.length;

        int max = 0;
        for (int i=0; i<length; i++) {
            for(int j = i+1; j<length; j++) {
                int total = A[i] +  A[j] + i - j;
                max = max >= total ? max : total;
            }
        }
        return max;
    }

    /**
     * 查找最长前缀
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length <= 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        String shortStr = getShortString(strs);
        if (isBlank(shortStr)) {
            return "";
        }
        char s = shortStr.charAt(0);
        boolean hasSame = true;
        int j = 0;
        while (hasSame) {

            for (int i = 0; i < strs.length; i++) {
                String str = strs[i];
                if (str.charAt(j) != s) {
                    hasSame = false;
                    break;
                }
            }
            if (!hasSame) {
                break;
            }
            builder.append(s);
            if (++j >= shortStr.length()) {
                break;
            }
            s = shortStr.charAt(j);

        }
        return builder.toString();

    }
    public static String getShortString(String[] strs) {
        String str = strs[0];
        for (String s: strs) {
            if (isBlank(s)) {
                return "";
            }
            if (s.length() < str.length()) {
                str = s;
            }
        }
        return str;
    }
    public static boolean isBlank(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

}
