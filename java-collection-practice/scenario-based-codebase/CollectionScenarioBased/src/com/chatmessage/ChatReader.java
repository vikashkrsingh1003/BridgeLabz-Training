package com.chatmessage;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatReader {

    static Pattern p = Pattern.compile("\\[(.*?)\\]\\s(.*?):\\s(.*)");

    public static List<ChatMessage> read(String file) throws Exception {

        List<ChatMessage> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            Matcher m = p.matcher(line);
            if (m.matches())
                list.add(new ChatMessage(m.group(1), m.group(2), m.group(3)));
        }
        br.close();
        return list;
    }
}

