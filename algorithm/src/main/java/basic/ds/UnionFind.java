package basic.ds;

/**
 * 并查集，用一个数组表示森林。根节点标识一个集合
 * - 元素都指向根节点，深度只有1，是快速查找的实现；合并时，a节点指向b节点，则是快速合并的实现
 * - 新增sz数组，合并时少的指向多的，减少层级
 * - size的判断不完全正确，新增rank数组，记录层级
 * - 路径压缩，1.子节点指向爷爷节点; 2.子节点指向根节点
 * @Author: zhangpeng
 * @Date: 2022/8/29 02:21
 */
public class UnionFind {
    private int[] id;
    private int count;

    public UnionFind(int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    private int find(int p) {
        assert p >= 0 && p < count;
        return id[p];
    }

    // O(1)
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    // O(n)
    public void unionElements(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID) {
            return;
        }

        for (int i = 0; i < count; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
    }
}
