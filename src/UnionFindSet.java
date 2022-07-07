import java.util.Arrays;

/**
 * 这个类是一个并查集的模板
 * 并查集是一种解决图的连通性问题的好方法
 * UniFindSet是入口
 * union用来连通两个结点所存在的子图
 * find用于查询根结点
 * isConnected 用于查询两个结点是否连通
 * isolate 用于奖某个结点分离出他所在的连通子图
 */
class UnionFindSet {

    int[] father;
    int[] size;

    void UnionFindSet(int N) {
        father = new int[N];
        size = new int[N];
        Arrays.fill(size, 1);
        for (int i = 0; i < N; i++) father[i] = i;
    }

    int find(int x) {
        if (x == father[x]) return x;
        //路径压缩
        return father[x] = find(father[x]);
    }

    void union(int x, int y) {
        int u = find(x), v = find(y);
        if (u == v) return;
        if (size[u] < size[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
        father[v] = u;
        size[u] += size[v];
    }

    void isolate(int x) {
        father[x] = x;
        size[x] = 1;
    }

    boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }


}