package yyniao.original;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/5/10 5:15 下午
 */
public class ZkTest {
    private static ZooKeeper zk;
    private static ZkConnection conn;

    public static void main(String[] args) {
        String path = "/MyFirstZnode";
        byte[] data = "My First Znode".getBytes();

        try {
            conn = new ZkConnection();
            zk = conn.connect("localhost");

            delete(path);
            exists(path);

            create(path, data);
            exists(path);

            getData(path);

            setData(path, "New Data".getBytes());

            getData(path);

            create(path + "/children","Children Data".getBytes());
            getChildren(path);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String create(String path, byte[] data) throws KeeperException, InterruptedException {
        String s = zk.create(path, data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(s);
        return s;
    }

    public static Stat exists(String path) throws KeeperException, InterruptedException {
        Stat stat = zk.exists(path, true);
        if (stat != null) {
            System.out.println("Node exists and the node version is " + stat.getVersion());
        } else {
            System.out.println("Node does not exists");
        }
        return stat;
    }

    public static void delete(String path) throws KeeperException, InterruptedException {
        zk.delete(path, zk.exists(path, true).getVersion());
    }

    public static String getData(String path) throws Exception {
        Stat stat = exists(path);
        if (stat == null) {
            return null;
        }

        final CountDownLatch connectedSignal = new CountDownLatch(1);
        byte[] data = zk.getData(path, watchedEvent -> {
            if (watchedEvent.getType() == Watcher.Event.EventType.None) {
                if (watchedEvent.getState() == Watcher.Event.KeeperState.Expired) {
                    connectedSignal.countDown();
                }
            } else {
                try {
                    byte[] data1 = zk.getData(path, false, null);
                    new String(data1, StandardCharsets.UTF_8);
                    System.out.println(Arrays.toString(data1));
                    connectedSignal.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, null);

        String s = new String(data, StandardCharsets.UTF_8);
        System.out.println(s);
        return s;
    }

    public static void setData(String path, byte[] data) throws Exception {
        zk.setData(path, data, zk.exists(path, true).getVersion());
    }

    public static void getChildren(String path) throws Exception {
        if (exists(path) == null) {
            return;
        }
        zk.getChildren(path, false).forEach(System.out::println);
    }

}
