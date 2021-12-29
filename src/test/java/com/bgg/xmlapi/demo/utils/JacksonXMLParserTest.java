package com.bgg.xmlapi.demo.utils;

import org.junit.Assert;
import org.junit.Test;

public class JacksonXMLParserTest {

    @Test
    public void testGetThumbnail() {
        // Given
        String gameId = "13";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "https://cf.geekdo-images.com/W3Bsga_uLP9kO91gZ7H8yw__thumb/img/8a9HeqFydO7Uun_le9bXWPnidcA=/fit-in/200x150/filters:strip_icc()/pic2419375.jpg";

        // When
        String actual = jxp.getThumbnailUrl();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPrimaryName() {
        // Given
        String gameId = "13";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "Catan";

        // When
        String actual = jxp.getPrimaryName();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
