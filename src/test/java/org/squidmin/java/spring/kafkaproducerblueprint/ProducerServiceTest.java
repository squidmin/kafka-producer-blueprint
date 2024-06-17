package org.squidmin.java.spring.kafkaproducerblueprint;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.kafka.core.KafkaTemplate;

@ExtendWith(MockitoExtension.class)
public class ProducerServiceTest {

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @InjectMocks
    private ProducerService producerService;

    @Test
    public void testSendMessage() {
        String topic = "topic-name", message = "HelloKafka";
        producerService.sendMessage(topic, message);
        Mockito.verify(kafkaTemplate).send(topic, message);
    }

}
