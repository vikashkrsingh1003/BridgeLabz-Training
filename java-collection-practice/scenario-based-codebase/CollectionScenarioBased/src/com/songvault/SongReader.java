package com.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class SongReader {

    static Pattern title = Pattern.compile("Title:\\s*(.*)");
    static Pattern artist = Pattern.compile("Artist:\\s*(.*)");
    static Pattern duration = Pattern.compile("Duration:\\s*(.*)");
    static Pattern genre = Pattern.compile("Genre:\\s*(.*)");

    public static List<Song> readFolder(String folder) throws Exception {

        List<Song> list = new ArrayList<>();

        for (File f : new File(folder).listFiles()) {

            BufferedReader br = new BufferedReader(new FileReader(f));

            String t="",a="",d="",g="";
            String line;

            while ((line = br.readLine()) != null) {
                Matcher m1 = title.matcher(line);
                Matcher m2 = artist.matcher(line);
                Matcher m3 = duration.matcher(line);
                Matcher m4 = genre.matcher(line);

                if (m1.matches()) t = m1.group(1);
                if (m2.matches()) a = m2.group(1);
                if (m3.matches()) d = m3.group(1);
                if (m4.matches()) g = m4.group(1);
            }

            br.close();
            list.add(new Song(t,a,d,g));
        }

        return list;
    }
}

