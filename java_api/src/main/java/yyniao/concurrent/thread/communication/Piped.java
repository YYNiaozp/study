package yyniao.concurrent.thread.communication;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 10:00 下午
 */
public class Piped {
    public static void main(String[] args) throws Exception {
        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();
        out.connect(in);

        //将输出流和输入流进行连接，否则在使用时会抛出IOExceptionout.connect(in);
        Thread printThread = new Thread(new Print(in), "PrintThread");
        printThread.start();
        int receive = -1;
        try {
            while ((receive = System.in.read()) != 0) {
                out.write(receive);
            }
        } finally {
            out.close();
        }
    }

    static class Print implements Runnable {
        private PipedReader in;
        public Print(PipedReader in) {
            this.in = in;
        }
        public void run() {
            int receive = -1;

            try {
                while ((receive = in.read()) != 0) {
                    System.out.println((char) receive);
                }
            } catch (IOException e) {
            }
        }
    }
}
