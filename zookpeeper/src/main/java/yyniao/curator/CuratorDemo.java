package yyniao.curator;


import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.data.Stat;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/1 10:50 上午
 */
public class CuratorDemo {

    public static void main(String[] args) throws Exception{
        CuratorFramework curator = CuratorFrameworkFactory.builder()
                .connectString("192.168.1.110")
                .sessionTimeoutMs(4000)
                .retryPolicy(new ExponentialBackoffRetry(1000, 3))
                .namespace("")
                .build();
        curator.start();

        Stat stat = new Stat();
        // 写
        curator.create().orSetData(1).forPath("/test");
        // 查
        byte[] bytes = curator.getData().storingStatIn(stat).forPath("/test");
        System.out.println(new String(bytes));
        curator.close();
    }
}
