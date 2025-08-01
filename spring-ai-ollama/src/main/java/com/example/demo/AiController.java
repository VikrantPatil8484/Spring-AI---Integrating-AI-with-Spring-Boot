package com.example.demo;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai")
public class AiController {

	private final OllamaChatClient client;

	public AiController(OllamaChatClient client) {
		this.client = client;
	}

	@GetMapping("/prompt")
	public Flux<ChatResponse> promptResponse(@RequestParam("prompt") String prompt) {
		Prompt promptObj = new Prompt(prompt);
		return client.stream(promptObj);
	}
}