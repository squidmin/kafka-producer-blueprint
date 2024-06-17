package org.squidmin.java.spring.kafkaproducerblueprint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class ProducerController {

    private final String topic;

    private final ProducerService producerService;

    public ProducerController(@Value("${spring.kafka.topic.name}") String topic, ProducerService producerService) {
        this.topic = topic;
        this.producerService = producerService;
    }

    @PostMapping
    public String publishMessage(@RequestParam("message") String message) {
        producerService.sendMessage(topic, message);
        return "Message published: " + message;
    }

}
