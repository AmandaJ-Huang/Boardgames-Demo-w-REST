package com.bgg.xmlapi.demo.utils;

import org.junit.Assert;
import org.junit.Test;

public class XMLParserTest {
    @Test
    public void testParser() {
        // Given
        String URI = "=010547";
        String tagName = "results";
        String tagValue = "numplayers";
        XMLParser xmlParser = new XMLParser();
        String expected = "10547";

        // When
        String actual = xmlParser.parser(URI, tagName, tagValue);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParserResultOfNumPlayers() {
        // Given
        String URI = "=010547";
        String tagName = "poll";
        String tagValue = "name";
        XMLParser xmlParser = new XMLParser();
        String expected = "10547";

        // When
        String actual = xmlParser.parser(URI, tagName, tagValue);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
