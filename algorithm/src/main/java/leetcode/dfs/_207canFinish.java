package leetcode.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/29 22:26
 */

/**
 * 207. 课程表
 * 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
 *
 * 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
 *
 * 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
 * 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
 */
public class _207canFinish {

    List<List<Integer>> list = new ArrayList<>();
    int visit[];
    boolean isvaild = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visit = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<Integer>());//初始化
        }
        for (int info[] : prerequisites) {
            //学info[0]之前要先学info[1],所以info[1]指向info[0],
            //所以在info[1]的ArrayList中存储它指向哪个科目
            list.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (visit[i] == 0) {//如果是未搜索的科目，则深搜
                dfs(i);
            }
        }
        return isvaild;
    }

    public void dfs(int v) {
        visit[v] = 1;//标记该科目为搜索中
        for (int w : list.get(v)) {//遍历该科目指向的学科
            if (visit[w] == 0) {//如果指向的某一学科未搜索过，则深搜
                dfs(w);
                if (!isvaild) {
                    return;
                }
            } else if (visit[w] == 1) {//如果指向的某一学科在搜索中，则有环，标记isValid
                isvaild = false;
                return;
            }
        }
        visit[v] = 2;//因为该科目已经完成深搜，所以标记它的状态未搜索过
    }

    public boolean canFinish2(int numCourses, int[][] pres) {
        // 本题转换为pres的有向无环图是否存在
        // = 求pres的对应图的拓扑排序，如果最后图非空或者已经不存在入度为0的结点，图必有环=返回false，否则返回true
        // graph：图邻接表，key是先修课程，value是必须先修课程之后才能学习的所有课程
        Map<Integer, List<Integer>> graph = new HashMap<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new LinkedList<>());
        }

        int[] inDegrees = new int[numCourses];
        for (int[] node : pres) {
            int cur = node[0];
            int pre = node[1];

            inDegrees[cur]++;
            graph.get(pre).add(cur);
        }

        // 拓扑排序(BFS)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            // 队列出队=入度为0的出队
            int node = queue.remove();

            // 课程完成拓扑数-1
            numCourses--;

            for (int next : graph.get(node)) {
                inDegrees[next]--;
                if (inDegrees[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        // 完成拓扑排序的课程数量减0，说明完成所有的先修课程
        return numCourses == 0;
    }
}

