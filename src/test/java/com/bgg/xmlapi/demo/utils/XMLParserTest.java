package com.bgg.xmlapi.demo.utils;

import org.junit.Assert;
import org.junit.Test;

public class XMLParserTest {
    @Test
    public void testParser() {
        // Given
        String id = "13";
        XMLParser xmlParser = new XMLParser();
        String expected = "";

        // When
        String actual = xmlParser.parser(id);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
