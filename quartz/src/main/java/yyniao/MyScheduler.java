package yyniao;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/5/31 3:51 下午
 */
public class MyScheduler {

    public static void main(String[] args) throws Exception {
        // 1、创建调度器Scheduler
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        // 2、创建JobDetail实例，并与PrintWordsJob类绑定(Job执行内容)
        JobDetail jobDetail = JobBuilder.newJob(PrintWordsJob.class)
                .usingJobData("jobDetail1", "这个Job用来测试的")
                .withIdentity("job1", "group1").build();

        // 3、构建Trigger实例，每隔1s执行一次
        Date startDate = new Date();
        startDate.setTime(startDate.getTime() + 5000);

        Date endDate = new Date();
        endDate.setTime(startDate.getTime() + 10000);

        // simpleTrigger
        Trigger trigger1 = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggerGroup1")
                .usingJobData("trigger1", "这是jobDetail1的trigger")
                .startAt(startDate)
                .endAt(endDate)
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(2)
                        .repeatForever())
                .build();

        // cronExpr
        Trigger trigger2 = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggerGroup1")
                .usingJobData("trigger1", "这是jobDetail1的trigger")
                .startAt(startDate)
                .endAt(endDate)
                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ? "))
                .build();

        // 4、执行
        scheduler.scheduleJob(jobDetail,trigger1);
        System.out.println("-------start-------");
        scheduler.start();

        //    睡眠
        TimeUnit.MINUTES.sleep(1);
        scheduler.shutdown();
        System.out.println("--------end--------");
    }
}
