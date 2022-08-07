package yyniao;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/5/31 3:48 下午
 */
public class PrintWordsJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        System.out.println(jobExecutionContext.getJobDetail().getJobDataMap().get("jobDetail1"));
        System.out.println(jobExecutionContext.getTrigger().getJobDataMap().get("trigger1"));

        String printTime = new SimpleDateFormat("yy-MM-dd HH-mm-ss").format(new Date());
        System.out.println("PrintWordsJob start at:" + printTime + ", prints: Hello Job-" + new Random().nextInt(100));
    }
}
