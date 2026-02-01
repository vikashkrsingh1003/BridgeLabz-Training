package com.chatmessage;

import java.util.*;

public class ChatAnalyzer {

    public static Map<String,List<String>> group(
            List<ChatMessage> msgs,
            MessageFilter<ChatMessage> filter) {

        Map<String,List<String>> map = new TreeMap<>();

        for (ChatMessage m : msgs) {
            if (!filter.allow(m)) continue;

            map.computeIfAbsent(m.user, k -> new ArrayList<>())
               .add(m.text);
        }

        return map;
    }
}

