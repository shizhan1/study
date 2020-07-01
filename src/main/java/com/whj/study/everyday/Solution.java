package com.whj.study.everyday;


import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: whj
 * @time: 2020/6/15 11:18
 */
public class Solution {

    public static void main(String[] args) {
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
        System.out.println(findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
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
