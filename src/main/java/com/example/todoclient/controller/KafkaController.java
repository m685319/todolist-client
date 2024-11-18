package com.example.todoclient.controller;

import com.example.todoclient.service.KafkaTodoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaTodoListService kafkaTodoListService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        kafkaTodoListService.sendMessage(message);
        return "Message sent!";
    }
}
