package yyniao;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/5/11 3:43 下午
 */
public class SimpleProducer {
    public static void main(String[] args) {
        String topicName = "Topic1";

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 0; i < 100; i++) {
            try {
                Future<RecordMetadata> send = producer.send(new ProducerRecord<>(topicName, Integer.toString(i), "msg:" + i));
                System.out.println(send.get().offset());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
                break;
            }
            System.out.println("Message sent successfully " + i);
        }
        producer.close();
    }
}
