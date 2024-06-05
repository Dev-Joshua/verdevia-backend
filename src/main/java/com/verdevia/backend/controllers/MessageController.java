package com.verdevia.backend.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verdevia.backend.models.MessageDto;

@RestController
public class MessageController {
    @GetMapping("/api/message")
	public MessageDto messageView() {
		return new MessageDto(LocalDateTime.now(), "Hola mundo");
	}
}
