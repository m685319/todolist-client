package com.example.todoclient.controller;

import com.example.todoclient.service.KafkaTodoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaTodoListService kafkaTodoListService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaTodoListService.sendMessage(message);
        return "Message sent!";
    }
}
