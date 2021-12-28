package com.bgg.xmlapi.demo.utils;

import org.junit.Assert;
import org.junit.Test;

public class XMLParserTest {

    @Test
    public void testJacksonParser() {
        // Given
        String id = "13";
        JacksonXMLParser jacksonXMLParser = new JacksonXMLParser();
        String expected = "https://cf.geekdo-images.com/W3Bsga_uLP9kO91gZ7H8yw__thumb/img/8a9HeqFydO7Uun_le9bXWPnidcA=/fit-in/200x150/filters:strip_icc()/pic2419375.jpg";

        // When
        String actual = jacksonXMLParser.jacksonParser(id);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
