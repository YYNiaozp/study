package yyniao.original;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/5/10 5:16 下午
 */
public class ZkConnection {
    private ZooKeeper zk;
    final CountDownLatch connectedSingal = new CountDownLatch(1);

    public ZooKeeper connect(String host) throws IOException, InterruptedException {
        zk = new ZooKeeper(host, 5000, watchedEvent -> {
            if (watchedEvent.getState() == Watcher.Event.KeeperState.SyncConnected){
                connectedSingal.countDown();
            }
        });

        connectedSingal.await();
        System.out.println(zk.getState());
        return zk;
    }

    public void close() throws InterruptedException {
        zk.close();
    }

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        ZooKeeper zooKeeper = new ZkConnection().connect("192.168.1.110");
        zooKeeper.exists("/admin", true);
    }
}
