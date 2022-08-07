package yyniao.concurrent.lock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/23 2:24 下午
 */
public class FairAndUnfairTest {
    private static Lock fair = new ReentrantLock(true);
    private static Lock unfair = new ReentrantLock(false);

    public void fair () {
        testLock(fair);
    }

    public void unfair () {
        testLock(unfair);
    }

    private void testLock(Lock lock){
        //启动5个job
    }

    private static class Job extends Thread {
        private Lock lock;
        public Job(Lock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            //连续2次打印当前的Thread和等待队列中的Thread
        }
    }

    private static class ReentrantLock2 extends ReentrantLock{
        public ReentrantLock2(boolean fair){
            super(fair);
        }

        @Override
        protected Collection<Thread> getQueuedThreads() {
            List<Thread> list = new ArrayList<>(super.getQueuedThreads());
            Collections.reverse(list);
            return list;
        }
    }


}
