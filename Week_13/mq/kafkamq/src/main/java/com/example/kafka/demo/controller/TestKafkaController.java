package com.example.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class TestKafkaController {
    @Autowired
    private KafkaTemplate kafkaTemplate;
}
