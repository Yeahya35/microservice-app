package com.kafein.intern.warehouse.service;

import com.kafein.intern.warehouse.dto.SimpleEmailDTO;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
public class NotificationProducerService {

    private final Source source;

    public NotificationProducerService(Source source) {
        this.source = source;
    }

    public void sendToQueue(SimpleEmailDTO simpleEmailDTO) {
        source.output().send(MessageBuilder.withPayload(simpleEmailDTO).build());
    }
}
