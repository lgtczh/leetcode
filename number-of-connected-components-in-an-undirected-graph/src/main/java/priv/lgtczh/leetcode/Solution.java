package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/number-of-connected-components-in-an-undirected-graph/">LeetCode 323. 无向图中连通分量的数目</a>
 */
public class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
        int components = n;
        for (int[] edge : edges) {
            components -= combine(parents, edge[0], edge[1]);
        }
        return components;
    }

    private int find(int[] parents, int vertex) {
        if (vertex == parents[vertex])
            return vertex;
        return parents[vertex] = find(parents, parents[vertex]);
    }

    private int combine(int[] parents, int vertex1, int vertex2) {
        int root1 = find(parents, vertex1);
        int root2 = find(parents, vertex2);
        if (root1 == root2)
            return 0;
        parents[root1] = root2;
        return 1;
    }
}