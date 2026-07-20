package com.fleetmanagement.demo.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.api.OllamaChatOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {

    @Bean
    ChatClient chatClient(ChatClient.Builder builder){
        return builder.defaultOptions(OllamaChatOptions.builder().disableThinking().build()).build();
    }

}
