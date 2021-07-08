package com.whj.study.everyday;


import javax.validation.constraints.Max;
import java.util.*;
import java.util.function.Consumer;
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
//        int[][] arr = {{1,0},{2,1}};
//        System.out.println(solution.canFinish(3, arr));
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int[] nums1 = {1,2,4,5,6,0};
//        int[] nums2 = {3};
//        solution.merge(nums1, 5, nums2, 1);
//        printArray(nums1);
//        System.out.println(solution.countBinarySubstrings("10101"));

//        char[][] board = {{'O','X','O','O','X','X'},{'O','X','X','X','O','X'},{'X','O','O','X','O','O'},{'X','O','X','X','X','X'},{'O','O','X','O','X','X'},{'X','X','O','O','O','O'}};
//        printArray(board);
//        System.out.println("----------------------");
//        solution.solve(board);
//        printArray(board);

//        System.out.println(solution.isValid("{[]}"));

//        int[][] image = {{0,0,0},{0,1,1}};
//        solution.floodFill(image, 1, 1, 1);
//        printArray(image);
//        System.out.println(solution.repeatedSubstringPattern("bb"));
//        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        System.out.println(solution.findSubsequences(nums));

//        System.out.println(solution.judgeCircle("LL"));


//        System.out.println(solution.isNumber(".e1"));

//        int[] nums = {1,1,1,2,2,3};
//        int[] results = solution.topKFrequent(nums, 2);
//        printArray(results);

//        int[] candidates = {14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12};
//        System.out.println(solution.combinationSum2(candidates, 27));

//        int[] candidates = {10,1,2,7,6,1,5};
//        System.out.println(solution.combinationSum2(candidates, 8));


//        int[] inorder = {9,3,15,20,7};
//        int[] postorder = {9,15,7,20,3};
//        System.out.println(solution.buildTree(inorder, postorder));

//        Node root = new Node(3);
//        root.left = new Node(9);
//        root.right = new Node(20);
//        root.right.left = new Node(15);
//        root.right.right = new Node(7);
//        System.out.println(solution.connect(root));

//        List<Integer> list = new ArrayList<>();
//
//        list.add(0,0);
//        System.out.println(list);

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        solution.swapPairs(head);
//        System.out.println(solution.backspaceCompare2("ab#c",  "ad#c"));

//        int[] nums = {100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
//        solution.nextPermutation(nums);
//        printArray(nums);

//        int[] nums = {2,1};
//        int result = solution.findShortestSubArray(nums);
//        System.out.println(result);
//        System.out.println(solution.removeDuplicates("abbbaca"));
//        System.out.println(solution.calculate("1- (1-2)"));
//        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] arr = {{3},{2}};
        int[][] arr = {{1},{2},{3},{4},{6},{7},{8},{9}};
        System.out.println(solution.spiralOrder(arr));

    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        // 遍历行
        int index = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int min = rows >= cols ? (cols - 1)/2 : (rows - 1)/2;

        int pointer = 0;
        while (pointer <= min) {

            for (int i = pointer; i < cols - pointer; i++) {
                matrix[pointer][i] = index;
                index++;

            }
            for (int i = pointer + 1; i< rows - pointer; i++) {
                matrix[i][cols - 1 - pointer] = index;
                index++;
            }
            for (int i = cols - 2 - pointer; i >= pointer && rows - 1 - pointer > pointer ; i--) {
                matrix[rows - 1 - pointer][i] = index;
                index++;
            }
            for (int i = rows - 2 - pointer; i > pointer && pointer <cols - 1 -pointer ; i--) {
                matrix[i][pointer] = index;
                index++;
            }
            pointer += 1;
        }

        return matrix;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int min = rows >= cols ? (cols - 1)/2 : (rows - 1)/2;

        int pointer = 0;
        while (pointer <= min) {

            for (int i = pointer; i < cols - pointer; i++) {
                list.add(matrix[pointer][i]);
            }
            for (int i = pointer + 1; i< rows - pointer; i++) {
                list.add(matrix[i][cols - 1 - pointer]);
            }
            for (int i = cols - 2 - pointer; i >= pointer && rows - 1 - pointer > pointer ; i--) {
                list.add(matrix[rows - 1 - pointer][i]);
            }
            for (int i = rows - 2 - pointer; i > pointer && pointer <cols - 1 -pointer ; i--) {
                list.add(matrix[i][pointer]);
            }
            pointer += 1;
        }



        return list;
    }

    public int calculate(String s) {
        Deque stack = new LinkedList();
        int num =0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }
            if (!Character.isDigit(c) && c != ' ' || i == s.length()-1) {
                stack.push(num);

                if (c == ')') {
                    int sum = 0;
                    Object obj;
                    Stack<Integer> child = new Stack();
                    while (!(obj=stack.pop()).equals('(')) {
                        if (obj.equals('-')) {
                            child.push(-child.pop());
                        } else if (obj.equals('+')) {

                        } else {
                            child.push((Integer) obj);
                        }
                    }
                    while (!child.isEmpty()) {
                        sum += child.pop();
                    }
                    stack.push(sum);
                } else {
                    stack.push(c);
                }
            }
        }

        int sum =0;
        char preSign = '+';

        while (!stack.isEmpty()) {
            Object o = stack.pop();

        }

        return sum;
    }

//    public int calculate(String s) {
//
//        Stack stack = new Stack();
//        int num =0;
//        int preSign = '+';
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (Character.isDigit(c)) {
//                num = num * 10 + c - '0';
//            }
//
//            if (!Character.isDigit(c) && c != ' ' || i == s.length()-1) {
//                switch (preSign) {
//                    case '+':
//                        stack.push(num);
//                        preSign = c;
//                        break;
//                    case '-':
//                        stack.push(-num);
//                        preSign = c;
//                        break;
//                    case '(':
//                        stack.push('(');
//                        stack.push(num);
//                        break;
//                    case ')':
//                        Object obj = null;
//                        int sum = 0;
//                        while (!(obj = stack.pop()).equals('(') ) {
//                            sum += (Integer) obj;
//                        }
//                        stack.push(sum);
//                        stack.push(num);
//                }
//                num = 0;
//
//            }
//
//        }
//        int sum = 0;
//        while (!stack.isEmpty()) {
//            sum += (Integer) stack.pop();
//        }
//
//        return sum;
//
//
//
//
//
//    }



    public int calculateSimple(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int sLength = s.length();
        char preSign = '+';
        int num = 0;
        for (int i = 0; i < sLength; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }
            if (!Character.isDigit(c) && c != ' ' || i == sLength - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }
                preSign = c;
                num = 0;
            }
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.poll();
        }
        return ans;
    }


    public String removeDuplicates(String S) {
        StringBuilder builder = new StringBuilder();
        builder.append(S.charAt(0));
        for(int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);
            if (builder.length() > 0 && builder.charAt(builder.length() - 1) == c) {
                builder.deleteCharAt(builder.length() - 1);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public int findShortestSubArray(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        // int[] 起始位置 长度 共几个
        Map<Integer, int[]> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int[] model = countMap.get(value);
            if (model == null) {
                model = new int[]{i,1, 1};
                countMap.put(value, model);
            } else {
                model[2] = model[2] + 1;
                model[1] = i - model[0] + 1;
                countMap.put(value, model);
            }
        }
        // 出现频数的最大值
        int max = 1;
        // 最大值对应的跨度
        int minLength = 1;
        for (Integer key: countMap.keySet()) {
            int[] model = countMap.get(key);
            int count = model[2];

            if (count == max) {
                minLength = Math.min(minLength, model[1]);
            } else if (count > max) {
                max = count;
                minLength = model[1];
            }
        }
        return minLength;

    }
    public static class Model{
        public int start;
        public int end;
        public int max;
    }



    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0;
        int sIndex = 0;
        for (; sIndex < s.length && gIndex < g.length ; ) {
            if(g[gIndex] <= s[sIndex]) {
                sIndex++;
                gIndex++;
            } else {
                sIndex++;
            }
        }
        return gIndex;

    }

    public char findTheDifference(String s, String t) {
        if (s.length() == 0) {
            return t.charAt(0);
        }
        int ret = 0;

        for (int i = 0; i < s.length(); i++) {
            ret ^= s.charAt(i);
            ret ^= t.charAt(i);
        }
        ret ^= t.charAt(t.length() - 1);
        return (char)ret;
    }

    /**
     * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
     *
     * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
     * 输入: pattern = "abba", str = "dog cat cat dog"
     * 输出: true
     * @param pattern
     * @param s
     * @return
     */
    public boolean wordPattern(String pattern, String s) {

        if (pattern == null || "".equals(pattern) || s == null || "".equals(s)) {
            return false;
        }

        String[] splitArr = pattern.split("");
        String[] strArr = s.split(" ");
        if (splitArr.length != strArr.length) {
            return false;
        }
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < splitArr.length; i++) {
            String split = splitArr[i];
            String str = strArr[i];
            if (!map.containsKey(split)) {
                if (map.values().contains(str)) {
                    return false;
                }
                map.put(split, str);
            } else if (!str.equals(map.get(split))) {
                return false;
            }
        }


        return true;
    }

    public boolean lemonadeChange(int[] bills) {
        //0 : 5 1:10 2:20
        int[] money = new int[3];
        for (int bill : bills) {
            switch (bill) {
                case 5: money[0] += 1; continue;
                case 10:
                    if (money[0] > 0) {
                        money[0] -= 1;
                        money[1] += 1;
                        continue;
                    } else {
                        return false;
                    }
                case 20:
                    if (money[1] > 0 && money[0] > 0) {
                        money[1] -= 1;
                        money[0] -= 1;
                        money[2] += 1;
                        continue;
                    } else if (money[0]>= 3){
                        money[0] -= 3;
                        money[2] += 1;
                        continue;
                    } else {
                        return false;
                    }

            }

        }
        return true;
    }

    public int uniquePaths(int m, int n) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1-1", 1);


        return uniquePathCount(m, n, map);
    }

    public int uniquePathCount(int m, int n, Map<String, Integer> map) {
        String key = m + "-" + n;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        if (m < 1 || n < 1) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        int count = uniquePathCount(m - 1, n, map) + uniquePathCount(m, n - 1, map);
        map.put(key, count);
        return count;
    }


    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count ++;
                continue;
            }
            if (count > 0) {
                nums[i-count] = nums[i];
                nums[i] = 0;
            }

        }

    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int count = 0;
        for (int i = 0; i < gas.length ; i++) {
            count = gas[i] - cost[i];
            if (count < 0) {
                continue;
            }
            for (int j = i + 1; j != i; j++) {
                if (j==gas.length) {
                    if (i==0) {
                        return 0;
                    } else {
                        j = 0;
                    }
                }
                count += gas[j] - cost[j];
                if (count < 0) {
                    break;
                }

            }
            if (count >= 0) {
                return i;
            }
        }
        return -1;
    }

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int length = nums.length;
        boolean change = false;
        for (int i = length - 2; i >= 0 ; i--) {
            int cur = nums[i];
            int index = i + 1;
            if (cur >= nums[i+1]) {
                continue;
            }
            for (int j = index; j < length; j++) {
                if (cur >= nums[j]) {
                    break;
                }
                change = true;
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            if (change) {
                nums[i] = nums[index];

                nums[index] = cur;

                Arrays.sort(nums, i+1, length);
                break;
            }

        }
        if (!change) {
            for (int i = 0; i <length/2 ; i++) {
                int max = nums[i];
                nums[i] = nums[length - 1 - i];
                nums[length - 1 - i] = max;
            }
        }
    }

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        if (grid == null || grid.length == 0 ) {
            return count;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int g = grid[i][j];
                if (g == 0) {
                    continue;
                }
                // 上
                if (i-1 < 0 || grid[i-1][j] == 0) {
                    count++;
                }
                // 下
                if (i+1 > grid.length - 1 || grid[i+1][j] == 0) {
                    count++;
                }
                // 左
                if (j-1 < 0 || grid[i][j-1] == 0) {
                    count++;
                }

                // 右
                if (j+1 > grid[i].length - 1 || grid[i][j+1] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean backspaceCompare2(String S, String T) {
        int skipS = 0;
        int skipT = 0;
        int i = S.length() -1, j = T.length()-1;
        while (i>=0 || j >= 0) {
            while (i >=0) {
                char c = S.charAt(i);
                if (c == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >=0) {
                char c = T.charAt(j);
                if (c == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i>=0 && j>=0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            }else if (i >= 0 || j >=0) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    public boolean backspaceCompare1(String S, String T) {
        return build(S).equals(build(T));
    }

    private String build(String t) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < t.length() ; i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (builder.length()> 0) {
                    builder.deleteCharAt(builder.length() - 1);
                }
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }


//    public List<String> commonChars(String[] A) {
//        List<String> list = new ArrayList<>();
//        if (A == null || A.length <= 1) {
//            return list;
//        }
//
//
//        String minStr = A[0];
//        for (int i = 1; i<A.length; i++) {
//            minStr = A[i].length() > minStr.length() ? minStr : A[i];
//        }
////        Map<Character, Integer> indexMap = new HashMap<>();
////        for (char c: minStr.toCharArray()) {
////            indexMap.containsKey(c) ?
////        }
//    }


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode root = head.next;
        while(head != null && head.next != null) {

            ListNode cur = head;
            ListNode next = head.next;
            cur.next = next.next;
            next.next = cur;
            if (prev != null) {
                prev.next = next;
            }
            prev = cur;
            head = cur.next;
        }

        return root;
    }

    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return min;
        }
        if (root.left != null) {
            min = root.val - root.left.val > min ? min : root.val - root.left.val;

        }
        if (root.right != null) {
            min = root.right.val - root.val > min ? min : root.right.val - root.val;

        }
        //查找左分支的最右节点
        if (root.left != null && root.left.right != null) {
            TreeNode right = root.left.right;
            for (; right.right != null; right = right.right ) {

            }
            min = root.val - right.val > min ? min : root.val - right.val;
        }
        //查找右分支的最左节点
        if (root.right != null && root.right.left != null) {
            TreeNode left = root.right.left;
            for (; left.left != null; left = left.left ) {

            }
            min = left.val - root.val > min ? min : left.val - root.val;
        }

        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        return min;
    }

    public void findMinLeft(TreeNode root){
        int min = Integer.MIN_VALUE;
        if (root.left != null) {
            min = root.val - root.left.val > min ? min : root.val - root.left.val;
        }
        TreeNode right = root.right;
        while (right != null) {
            min = right.val - root.val > min ? min : right.val - root.val;
            right = right.right;
        }


    }

    public void findMinRight(TreeNode root){
        int min = Integer.MIN_VALUE;
        if (root.left != null) {
            min = root.val - root.left.val > min ? min : root.val - root.left.val;
        }
        TreeNode right = root.right;
        while (right != null) {
            min = right.val - root.val > min ? min : right.val - root.val;
            right = right.right;
        }


    }


    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode quick = head;

        while (true) {
            quick = quick.next;
            if (quick == null) {
                return false;
            }
            quick = quick.next;
            if (quick == null) {
                return false;
            }
            slow = slow.next;
            if (slow == quick) {
                return true;
            }

        }

    }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        postorderTraversalCursion(root, list);
        return list;
    }

    private void postorderTraversalCursion(TreeNode root,List<Integer> list ){
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        postorderTraversalCursion(root.left, list);
        postorderTraversalCursion(root.right, list);
        list.add(root.val);

    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }

        List<Node> parents = new ArrayList<>();
        parents.add(root);
        List<Node> children = new ArrayList<>();
        connectRecursion(parents, children);
        return root;
    }

    private void connectRecursion(List<Node> parents, List<Node> children) {
        if (parents.isEmpty()) {
            return;
        }
        for (Node node: parents) {
            Node left = node.left;
            Node right = node.right;
            if (left == null && right == null) {
                continue;
            }
            Node next = left != null ? left : right;


            if (!children.isEmpty()) {
                Node prev = children.get(children.size() - 1);
                if (prev.next == null) {
                    prev.next = next;
                }
            }

            if (left != null) {
                if (right != null) {
                    left.next = right;
                }
                children.add(left);
            }
            if (right != null) {
                children.add(right);
            }
        }
        parents.clear();
        parents.addAll(children);
        children.clear();
        connectRecursion(parents, children);

    }


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }
        int val = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(val);
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length ; i++) {
            indexMap.put(inorder[i], i);
        }
        findSubNode(root, inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 2, indexMap);
        return root;
    }

    private void findSubNode(TreeNode root, int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd, Map<Integer, Integer> indexMap) {


        int index = indexMap.get(root.val);
        if (index > inorderStart) {
            int leftIndex = postorderStart + (index - inorderStart) - 1;
            TreeNode left = new TreeNode(postorder[leftIndex]);
            root.left = left;
            findSubNode(left, inorder, inorderStart, index -1, postorder, postorderStart, leftIndex - 1, indexMap);
        }
        if (index < inorderEnd) {
            int rightIndex = postorderEnd;
            TreeNode right = new TreeNode(postorder[rightIndex]);
            root.right = right;
            findSubNode(right, inorder, index + 1, inorderEnd, postorder, postorderEnd - (inorderEnd - index) + 1, postorderEnd - 1, indexMap);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.asList(nums);
        permuteUniqueRecursion(nums, used, new ArrayList<>(), lists, nums.length);
        return lists;
    }

    public void permuteUniqueRecursion(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> lists, int unUsed) {
        if (unUsed == 0) {
            lists.add(list);
            return;
        }
        List<Integer> thisNums = new ArrayList<>();
        for (int i = 0; i < used.length ; i++) {
            boolean hasUsed = used[i];
            if (hasUsed) {
                continue;
            }
            if (thisNums.contains(nums[i])){
                continue;
            }
            thisNums.add(nums[i]);
            List<Integer> newList = new ArrayList<>();
            newList.addAll(list);
            newList.add(nums[i]);



        }


    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }
    public void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorderTraversal(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right, list);
        }
    }


    /**
     * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
     * candidates 中的每个数字在每个组合中只能使用一次。
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> times = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i : candidates) {
            if (times.containsKey(i)) {
                times.put(i, times.get(i)+1);
            } else {
                times.put(i, 1);
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {

            queryAll2(list, times, target, result, i, new ArrayList<>());
        }
        return result;
    }

    private void queryAll2(List<Integer> candidates, Map<Integer, Integer> times, int target, List<List<Integer>> result, int i, List<Integer> list) {
        if (i >= candidates.size()) {
            return;
        }
        if (target == 0) {
            if (!list.isEmpty()) {
                result.add(list);
            }
            return;
        }


        int num = candidates.get(i);

        int oneTimes = times.get(num) > target/num ? target/num : times.get(num);
        for (int j = 0; j <= oneTimes ; j++) {
            int sum = 0;
            List<Integer> newList = new ArrayList<>(list);
            for (int k = 0; k < j; k++) {
                sum += num;
                newList.add(num);
            }

            if (sum == target ) {

                if (!newList.isEmpty() && !result.contains(newList)) {
                    result.add(newList);
                }
                continue;
            }
            queryAll2(candidates, times, target - sum, result, i+1, newList);
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < candidates.length ; i++) {

            queryAll(candidates, target, result, i, new ArrayList<>());
        }
        return result;

    }

    private void queryAll(int[] candidates, int target, List<List<Integer>> result, int i, List<Integer> list) {
        if (i >= candidates.length) {
            return;
        }
        if (target == 0) {
            if (!list.isEmpty() && !result.contains(list)) {
                result.add(list);
            }
            return;
        }
        if (target < 0) {
            queryAll(candidates, target, result, i+1, list);
            return;
        }

        int num = candidates[i];
        int times = target/num;


        for (int j = 0; j <= times; j++) {
            int sum = 0;
            List<Integer> newList = new ArrayList<>(list);
            for (int k = 0; k < j; k++) {
                sum += num;
                newList.add(num);
            }

            if (sum == target ) {

                if (!newList.isEmpty() && !result.contains(newList)) {
                    result.add(newList);
                }
//                result.add(newList);
                continue;
            }
            queryAll(candidates, target - sum, result, i+1, newList);
        }

    }


    /**
     * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        countMap.forEach((key,value)->{

            int[] arr = {key, value};
            if (pq.size() == k) {
                if (pq.peek()[1] < value) {
                    pq.poll();
                    pq.offer(arr);
                }
            } else {
                pq.offer(arr);
            }

        });
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }
        return result;

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    public void constructPaths(TreeNode current, String path, List<String> paths) {
        if (current == null) {
            return;
        }
        StringBuilder builder = new StringBuilder(path);
        if (path.length() != 0) {
            builder.append("->");
        }
        builder.append(current.val);
        if (current.left == null && current.right == null) {
            paths.add(builder.toString());
            return;
        }
        if (current.left != null) {
            constructPaths(current.left, builder.toString(), paths);
        }
        if (current.right != null) {
            constructPaths(current.right, builder.toString(), paths);
        }

    }

    public boolean isNumber(String s) {
        if (s==null || s.length() == 0 || s.trim().length() == 0) {
            return false;
        }
        s = s.trim();
        if (s.matches("[+-]?\\d+") || (!s.matches("[+-]?.") && s.matches("[+-]?\\d*\\.\\d*"))) {
            return true;
        }
        if (s.matches("[+-]?\\d+\\.?\\d*e[+-]?\\d+") || s.matches("[+-]?\\d+\\.?\\d*E[+-]?\\d+")
            || s.matches("[+-]?\\.\\d+e[+-]?\\d+") || s.matches("[+-]?\\.\\d+E[+-]?\\d+")) {
            return true;
        }

        return false;
    }

    public boolean PredictTheWinner(int[] nums) {
        // 递归
        // return total(nums, 0, nums.length - 1, 1) >= 0;
        // 动态规划
        int length = nums.length;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = nums[i];
        }

        for (int i = length - 2; i >= 0 ; i--) {
            for (int j = i+1; j < length ; j++) {
                dp[i][j] = Math.max(nums[i] - dp[i+1][j], nums[j] - dp[i][j-1]);
            }
        }
        return dp[0][length - 1] >= 0;
    }

    /**
     * 求双方分数和差值最大
     * @param nums
     * @param start
     * @param end
     * @param turn
     * @return
     */
    public int total(int[] nums, int start, int end, int turn) {
        if (start == end) {
            return nums[start] * turn;
        }
        int startScore = nums[start]* turn + total(nums, start + 1, end, -turn);
        int endScore = nums[end] * turn + total(nums, start, end - 1, -turn);
        return Math.max(startScore * turn, endScore * turn) * turn;
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms == null || rooms.isEmpty() || rooms.size() == 1) {
            return true;
        }
        int size = rooms.size();
        boolean[] openDoors = new boolean[size];
        openDoor(rooms, 0, openDoors);
        for (boolean open: openDoors) {
            if (!open) {
                return false;
            }
        }

        return true;
    }

    private void openDoor(List<List<Integer>> rooms, int i, boolean[] openDoors) {
        if (openDoors[i]) {
            return;
        }
        openDoors[i] = true;
        List<Integer> subRooms = rooms.get(i);
        for (int j = 0; j < subRooms.size(); j++) {
            openDoor(rooms, subRooms.get(j), openDoors);
        }


    }


    public boolean judgeCircle(String moves) {

        if (moves == null || moves.length() == 0) {
            return true;
        }
        int length = moves.length();
        if ( length% 2 == 1) {
            return false;
        }

        int x = 0, y = 0;
        for (int i = 0; i < length; i++) {
            char move = moves.charAt(i);
            if (move == 'U') {
                y--;
            } else if (move == 'D') {
                y++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;

//        String rStr = moves.replaceAll("R", "");
//        int rNum = length - rStr.length();
//        String lStr = moves.replaceAll("L", "");
//        int lNum = length - lStr.length();
//        if (rNum != lNum) {
//            return false;
//        }
//
//        String uStr = moves.replaceAll("U", "");
//        int uNum = length - uStr.length();
//        String dStr = moves.replaceAll("D", "");
//        int dNum = length - dStr.length();
//        if (uNum != dNum) {
//            return false;
//        }
//        return true;
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> values = new HashSet<>();
        int[] binaryArr = {2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768};
        Set<Integer> binary = new HashSet(Arrays.asList(binaryArr));
        StringBuilder tempStr = new StringBuilder();
        List<Integer> tempList = new ArrayList<>();
        int length = nums.length;
        if (length<=1) {
            return result;
        }
        int num = 1<<length;
        for (int i = 3; i < num; i++) {
            // 校验表示的数字个数是否大于2  --> 若为2的n次幂，则数字数为1
            if (binary.contains(i)) {
                continue;
            }

            int temp = i;

            tempList.clear();
            tempStr.delete(0, tempStr.length());
            for (int j = 0; j < i; j++) {
                if ((temp & 1) != 0) {
                    if (j > 0 && nums[j] < nums[j-1]) {
                        tempList.clear();
                        break;
                    }
                    tempList.add(nums[j]);
                    tempStr.append(nums[i]).append(",");
                    temp = temp >> 1;
                }
            }
            if (!tempList.isEmpty() && !values.contains(tempStr.hashCode())) {
                result.add(tempList);
            }

        }

        return result;

    }


    public List<List<Integer>> findSubsequences_moretime(int[] nums) {
        List<List<Integer>> prevSubs = new ArrayList<>();
        List<List<Integer>> nextSubs = new ArrayList<>();

        if (nums == null ) {
            return nextSubs;
        }

        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        prevSubs.add(first);

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            nextSubs.clear();
            nextSubs.addAll(prevSubs);

            for (List<Integer> ele: prevSubs) {
                int old = ele.get(ele.size() - 1);
                if ( old > cur ) {
                    continue;
                }
                if (cur == nums[i-1]) {
                    if (old != cur) {
                        continue;
                    }
                }
                List<Integer> newEle = new ArrayList<>();
                newEle.addAll(ele);
                newEle.add(cur);
                if (nextSubs.contains(newEle)) {
                    continue;
                }
                nextSubs.add(newEle);
            }
            prevSubs.clear();
            prevSubs.addAll(nextSubs);
            List<Integer> single = new ArrayList<>();
            single.add(cur);
            if (!prevSubs.contains(single)) {
                prevSubs.add(single);
            }
        }
        Iterator<List<Integer>> iterator = nextSubs.iterator();
        while (iterator.hasNext()) {
            List<Integer> next = iterator.next();
            if (next.size() <= 1) {
                iterator.remove();
            }
        }
        return nextSubs;
    }


    public boolean repeatedSubstringPattern(String s) {

        if (s==null || s.length()<=1) {
            return false;
        }

        int length = s.length();
        for (int i = 1; i < length ; i++) {
            if (length % i != 0) {
               continue;
            }
            String sub = s.substring(0,i);
            boolean isMatch = true;
            for (int j = i; j <= length-i ; j+=i) {
                String next = s.substring(j, j+i);
                if (!sub.equals(next)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                return true;
            }
        }

        return false;
    }

    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head, null);
    }

    public TreeNode buildTree(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode rootNode = getMedium(left, right);
        TreeNode tree = new TreeNode(rootNode.val);
        tree.left = buildTree(left, rootNode);
        tree.right = buildTree(rootNode.next, right);
        return tree;
    }

    public ListNode getMedium(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }
    Map<TreeNode, Integer> nodeChildNums = new HashMap<>();
    public boolean isBalanced_old(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            nodeChildNums.put(root, 1);
            return true;
        }

        if (!nodeChildNums.containsKey(root.left)) {
            boolean leftIsBalanced = isBalanced(root.left);
            if (!leftIsBalanced) {
                return false;
            }
        }
        if (!nodeChildNums.containsKey(root.right)) {
            boolean rightIsBalanced = isBalanced(root.right);
            if (!rightIsBalanced) {
                return false;
            }
        }

        int left = nodeChildNums.getOrDefault(root.left, 0);
        int right = nodeChildNums.getOrDefault(root.right, 0);

        nodeChildNums.put(root, Math.max(left, right) + 1);
        if (Math.abs(left-right) > 1) {
            return false;
        }
        return true;
    }



    /**
     * 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。
     * 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。
     * 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。
     * 最后返回经过上色渲染后的图像。
     * 示例 1:
     * 输入:
     * image = [[1,1,1],[1,1,0],[1,0,1]]
     * sr = 1, sc = 1, newColor = 2
     * 输出: [[2,2,2],[2,2,0],[2,0,1]]
     * 解析:
     * 在图像的正中间，(坐标(sr,sc)=(1,1)),
     * 在路径上所有符合条件的像素点的颜色都被更改成2。
     * 注意，右下角的像素没有更改为2，
     * 因为它不是在上下左右四个方向上与初始点相连的像素点。
     * @param image
     * @param sr
     * @param sc
     * @param newColor
     * @return
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        Set<String> dealSet = new HashSet<>();
        changeColor(image, sr, sc, newColor, oldColor, dealSet);
        return image;
    }


    public void changeColor(int[][] image, int sr, int sc, int newColor, int oldColor,Set<String> dealSet) {
        String key = sr + "," + sc;
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor || dealSet.contains(key)) {
            return;
        }
        image[sr][sc] = newColor;
        dealSet.add(key);
        // 上
        changeColor(image, sr - 1, sc, newColor, oldColor, dealSet);
        // 下
        changeColor(image, sr + 1, sc, newColor, oldColor, dealSet);
        // 左
        changeColor(image, sr, sc - 1, newColor, oldColor, dealSet);
        // 右
        changeColor(image, sr, sc + 1, newColor, oldColor, dealSet);
    }


    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     *     左括号必须用相同类型的右括号闭合。
     *     左括号必须以正确的顺序闭合。
     *
     * 注意空字符串可被认为是有效字符串。
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put(')','(');
        dictionary.put('}','{');
        dictionary.put(']','[');
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char c = s.charAt(i);

            if (dictionary.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty()){
                System.out.println("空");
                return false;
            } else if (c != dictionary.get(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
     *
     * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
     *
     * 示例:
     *
     * X X X X
     * X O O X
     * X X O X
     * X O X X
     *
     * 运行你的函数后，矩阵变为：
     *
     * X X X X
     * X X X X
     * X X X X
     * X O X X
     *
     * @param board
     */
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int rows = board.length;
        int cols = board[0].length;
        List<String> noTrans = new ArrayList<>();
        //判断上下哪些是不需要替换的
        for (int i = 1; i < cols-1; i++) {
            int j = 1;
            if (board[0][i] == 'O' ){
                for (; j < rows - 1 ; j++) {
                    if (board[j][i] == 'X') {
                        break;
                    }
                    pageArroud(noTrans, board, j, i);
                }
            }
            if (j == rows - 1) {
                continue;
            } else {
                j = rows - 2;
            }
            if (board[rows-1][i] == 'O'){
                for (; j > 0 ; j--) {
                    if (board[j][i] == 'X') {
                        break;
                    }
                    pageArroud(noTrans, board, j, i);
                }
            }
        }
        for (int i = 1; i < rows-1; i++) {
            int j = 1;
            if (board[i][0] == 'O' ){
                for (; j < cols - 1 ; j++) {
                    if (board[i][j] == 'X') {
                        break;
                    }
                    pageArroud(noTrans, board, i, j);
                }
            }
            if (j == cols - 1) {
                continue;
            } else {
                j = cols - 2;
            }
            if (board[i][cols-1] == 'O'){
                for (; j > 0 ; j--) {
                    if (board[i][j] == 'X') {
                        break;
                    }
                    pageArroud(noTrans, board, i, j);
                }
            }
        }

        for (int i = 1; i < rows - 1 ; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (board[i][j] == 'X') {
                    continue;
                }
                if (noTrans.contains(i+"-"+j)) {
                    continue;
                }
                board[i][j] = 'X';
            }
        }

    }

    public void pageArroud(List<String> noTrans, char[][] board, int i, int j) {

        String key = i+"-"+j;
        if (i <= 0 || i >= board.length -1 || j <= 0 || j >= board[0].length -1 ||board[i][j] == 'X' || noTrans.contains(key)) {
            return;
        }
        if (!noTrans.contains(key)) {
            noTrans.add(key);
        }
        pageArroud(noTrans, board, i - 1, j);
        pageArroud(noTrans, board, i + 1, j);
        pageArroud(noTrans, board, i, j - 1);
        pageArroud(noTrans, board, i, j+1);
    }


    /**
     * 给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
     * 重复出现的子串要计算它们出现的次数。
     *输入: "00110011"
     * 输出: 6
     * 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
     *
     * 请注意，一些重复出现的子串要计算它们出现的次数。
     *
     * 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
     *
     * @param s
     * @return
     */
    public int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<>();
        int sameNum = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                sameNum++;
            } else{
                counts.add(sameNum);
                sameNum = 1;
            }
            if (i == s.length() - 1) {
                counts.add(sameNum);
            }
        }
        int count = 0;
        for (int i = 0; i < counts.size() -1 ; i++) {
            count += Math.min(counts.get(i), counts.get(i+1));
        }
        return count;
    }
    public int countBinarySubstrings_del(String s) {
        if (s == null || s.length() == 1) {
            return 0;
        }
        int max = 1;
        int num = 0;
        int sameNum = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                sameNum++;
            } else{
                num = Math.max(num, sameNum);
                sameNum = 1;
            }
        }
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                String sameStr = String.valueOf(c);
                String otherStr = c == '0' ? "1" : "0";
                if (j+i > s.length() || j+i*2 > s.length()) {
                    continue;
                }
                if (s.charAt(j+i) == c) {
                    continue;
                }
                if (s.substring(j, j+i).contains(otherStr)) {
                    continue;
                }
                if (s.substring(j+i, j+i*2).contains(sameStr)) {
                    continue;
                }
                count++;
            }
        }
        return count;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
           System.arraycopy(nums2,0, nums1, m, n);
           return;
        }
        int i = 0;
        int start = 0;
        int end;
        int length = m;
        while (i<m+n && start < n) {
            while (start<n) {
                // num1小，继续往后找
                if (nums2[start]>= nums1[i]) {
                    i++;
                    if (i>=length) {
                        System.arraycopy(nums2, start, nums1, i, n - start);
                        length += n-start;
                        return;
                    }
                    continue;
                }
                //找到第一个比start大的位置
                end = start + 1;
                while (end<n) {
                    if (nums2[end] > nums1[i]) {
                       break;
                    }
                    end++;
                }
                int move = end-start;
                System.arraycopy(nums1, i, nums1, i+ move, length - i);
                System.arraycopy(nums2, start, nums1, i, move);
                start = end;
                i += move;
                length += move;
            }
        }
    }
    /**
     *
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
        // root被选中时
        Map<TreeNode, Integer> f = new HashMap<>();
        // root不被选中时
        Map<TreeNode, Integer> g = new HashMap<>();

        df(root, f, g);
        return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));
    }

    private void df(TreeNode root, Map<TreeNode, Integer> f, Map<TreeNode, Integer> g) {
        if (root == null) {
            return;
        }
        df(root.left, f, g);
        df(root.right, f, g);
        /*
        当 o 被选中时，o 的左右孩子都不能被选中，故 o 被选中情况下子树上被选中点的最大权值和为 l 和 r 不被选中的最大权值和相加，即 f(o)=g(l)+g(r)f(o) = g(l) + g(r)f(o)=g(l)+g(r)。
         */
        f.put(root, root.val + g.getOrDefault(root.left, 0) + g.getOrDefault(root.right, 0));
        /*
        当 o 不被选中时，o 的左右孩子可以被选中，也可以不被选中。对于 o 的某个具体的孩子 x，它对 o 的贡献是 x 被选中和不被选中情况下权值和的较大值。故 g(o)=max⁡{f(l),g(l)}+max⁡{f(r),g(r)}g(o) = \max \{ f(l) , g(l)\}+\max\{ f(r) , g(r) \}g(o)=max{f(l),g(l)}+max{f(r),g(r)}
         */
        g.put(root, Math.max(f.getOrDefault(root.left, 0), g.getOrDefault(root.left, 0)) +
                Math.max(f.getOrDefault(root.right, 0), g.getOrDefault(root.right, 0)));
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

    public static void printArray(int[][] array) {
        for (int[] i:array) {
            for (int c: i) {
                System.out.print(c + "   ");
            }
            System.out.println();
        }
    }
    public static void printArray(char[][] array) {
        for (char[] i:array) {
            for (char c: i) {
                System.out.print(c + "   ");
            }
            System.out.println();
        }
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
