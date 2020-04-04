package com.kafka.consumer.kafkaconsumer.listener;

import com.kafka.consumer.kafkaconsumer.model.User;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
  public void consume(String message) {
    System.out.println(message);
  }

  @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
      containerFactory = "userKafkaListenerFactory")
  public void consumeJson(User user) {
    System.out.println(user);
  }
}
