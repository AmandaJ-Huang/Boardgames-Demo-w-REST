package com.bgg.xmlapi.demo.utils;

import org.junit.Assert;
import org.junit.Test;

public class XMLParserTest {
    @Test
    public void testParser() {
        // Given
        String URI = "/thing?id=010547";
        String tagName = "item type=boardgame";
        String id = "id";
        XMLParser xmlParser = new XMLParser();
        String expected = "10547";

        // When
        String actual = xmlParser.parser(URI, tagName, id);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
