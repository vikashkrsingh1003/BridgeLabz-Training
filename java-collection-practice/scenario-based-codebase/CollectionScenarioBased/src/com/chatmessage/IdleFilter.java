package com.chatmessage;

import java.util.*;

public class IdleFilter implements MessageFilter<ChatMessage> {

    Set<String> words = Set.of("lol","brb","ok","haha");

    public boolean allow(ChatMessage m) {
        String t = m.text.toLowerCase();
        for (String w : words)
            if (t.contains(w)) return false;
        return true;
    }
}

