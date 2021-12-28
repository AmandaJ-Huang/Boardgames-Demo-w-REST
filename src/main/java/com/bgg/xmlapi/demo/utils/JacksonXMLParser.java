package com.bgg.xmlapi.demo.utils;

import com.bgg.xmlapi.demo.entities.Boardgames;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class JacksonXMLParser {
    private String rootURL = "https://www.boardgamegeek.com/xmlapi2/thing?id=0";
    private String statsURI = "&stats=1";

    public String jacksonParser(String id) {
        Boardgames output = new Boardgames();
        try {
            InputStream is = new URL(rootURL + id + statsURI).openStream();
            JacksonXmlModule module = new JacksonXmlModule();
            module.setDefaultUseWrapper(false);
            XmlMapper xmlMapper = new XmlMapper(module);
            output = xmlMapper.readValue(is, Boardgames.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return output.getThumbnail_url();
    }
}
