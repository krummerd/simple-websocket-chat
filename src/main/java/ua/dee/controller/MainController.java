package ua.dee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.dee.model.ChatWebsite;
import ua.dee.service.ChatService;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class MainController {

    @Autowired
    private ChatService chatService;

    @RequestMapping
    public List<ChatWebsite> getProvidersList() {
        return chatService.findAll();
    }
}
