package com.bgg.xmlapi.demo.utils;

import com.bgg.xmlapi.demo.entities.Item;
import com.bgg.xmlapi.demo.entities.Items;
import com.bgg.xmlapi.demo.entities.Thumbnail;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;

import java.io.InputStream;
import java.net.URL;

public class JacksonXMLParserTest {

    @Test
    public void readXmlToPojo() throws Exception {
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        ObjectMapper mapper = new XmlMapper(module);
        URL url = new URL("https://www.boardgamegeek.com/xmlapi2/thing?id=013");
        InputStream input = url.openStream();

//        String item = mapper.readValue(input, Items.class).getItem().getThumbnail();
        String minPlaytime = mapper.readValue(input, Items.class).getItem().getMinplaytime();

//        System.out.println(item);
        System.out.println(minPlaytime);
    }
}
