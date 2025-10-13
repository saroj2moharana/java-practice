package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;

public class MaxNonAdjNodeSum {
    public static void main(String[] args) {
        Node node = TreeUtil.getDefaultNode();
        MaxNonAdjNodeSum m = new MaxNonAdjNodeSum();
        int r = m.getMaxSum(node);
        System.out.println("Result : " + r);
    }

    public int getMaxSum(Node root) {
        // code here
        int[] both = dfs(root);
        return Math.max(both[0], both[1]);
    }

    private int[] dfs(Node root) {
        if (root == null) return new int[]{0, 0};
        int[] left = dfs(root.leftNode);
        int[] right = dfs(root.rightNode);
        int include = root.getData() + left[1] + right[1];
        int exclude = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{include, exclude};
    }
}
