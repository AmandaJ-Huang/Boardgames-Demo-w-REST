package com.bgg.xmlapi.demo.utils;

import org.junit.Assert;
import org.junit.Test;

public class XMLParserTest {
    @Test
    public void testParser() {
        // Given
        String id = "13";
        DOMXMLParser xmlParser = new DOMXMLParser();
        String expected = "";

        // When
        String actual = xmlParser.parser(id);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testJacksonParser() {
        // Given
        String id = "13";
        JacksonXMLParser jacksonXMLParser = new JacksonXMLParser();
        String expected = "";

        // When
        String actual = jacksonXMLParser.jacksonParser(id);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
