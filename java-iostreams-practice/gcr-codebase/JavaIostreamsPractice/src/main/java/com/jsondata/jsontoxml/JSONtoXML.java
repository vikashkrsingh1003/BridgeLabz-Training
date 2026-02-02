package com.jsondata.jsontoxml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.*;

public class JSONtoXML {

    public static void main(String[] args) {
        try {
            InputStream is = JSONtoXML.class.getClassLoader()
                    .getResourceAsStream("Sample.json");

            if (is == null) {
                throw new RuntimeException("Sample.json not found in resources folder");
            }

            ObjectMapper jsonMapper = new ObjectMapper();
            JsonNode node = jsonMapper.readTree(is);

            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File("Sample.xml"), node);

            System.out.println("JSON converted to XML successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
