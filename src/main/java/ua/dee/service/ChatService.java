package ua.dee.service;

import org.springframework.stereotype.Service;
import ua.dee.model.ChatWebsite;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private static List<ChatWebsite> chatWebsites = new ArrayList<>();

    static {
        chatWebsites.add(new ChatWebsite("apple", "http://apple.stackexchange.com", "http://cdn.sstatic.net/Sites/android/img/favicon.ico", "Ask Different (StackExchange)", "for power users of Apple hardware and sftware"));
        chatWebsites.add(new ChatWebsite("ru.stackoverflow", "http://ru.stackoverflow.com", "http://cdn.sstatic.net/Sites/ru/img/favicon.ico", "Stack Overflow на русском (StackExchange)", "для разработчиков"));
    }

    public List<ChatWebsite> findAll() {
        return chatWebsites;
    }
}
