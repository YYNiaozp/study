package leetcode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/19 00:22
 */
public class _139wordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        return implDp(s, wordDict);
    }

    private boolean implDp(String s, List<String> wordDict){
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    private boolean implBfs(String s, List<String> wordDict){
        return false;
    }

    private boolean implDfs(String s, List<String> wordDict){
        return false;
    }

}
