package com.bgg.xmlapi.demo.utils;

import org.junit.Assert;
import org.junit.Test;

public class JacksonXMLParserTest {

    @Test
    public void testGetItemType() {
        // Given
        String gameId = "13";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "boardgame";

        // When
        String actual = jxp.getItemType();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetThumbnailCatan() {
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
    public void testGetThumbnailBetrayal() {
        // Given
        String gameId = "10547";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "https://cf.geekdo-images.com/lqmt2Oti_qJS65XqHcB8AA__thumb/img/EDOmDbRhLy4za2PHkJ5IbhNxZmk=/fit-in/200x150/filters:strip_icc()/pic5146864.png";

        // When
        String actual = jxp.getThumbnailUrl();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPrimaryNameCatan() {
        // Given
        String gameId = "13";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "Catan";

        // When
        String actual = jxp.getPrimaryName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPrimaryNameBetrayal() {
        // Given
        String gameId = "10547";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "Betrayal at House on the Hill";

        // When
        String actual = jxp.getPrimaryName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPrimaryNameTapestry() {
        // Given
        String gameId = "286096";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "Tapestry";

        // When
        String actual = jxp.getPrimaryName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetYearPublishedTapestry() {
        // Given
        String gameId = "286096";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "2019";

        // When
        String actual = jxp.getYearPublished();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMinPlayersTapestry() {
        // Given
        String gameId = "286096";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "1";

        // When
        String actual = jxp.getMinPlayers();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMaxPlayersTapestry() {
        // Given
        String gameId = "286096";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "5";

        // When
        String actual = jxp.getMaxPlayers();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPlaytimeTapestry() {
        // Given
        String gameId = "286096";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "120";

        // When
        String actual = jxp.getPlayingTime();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCategoriesCatan() {
        // Given
        String gameId = "13";
        JacksonXMLParser jxp = new JacksonXMLParser(gameId);
        String expected = "[Economic, Negotiation]";

        // When
        String actual = jxp.getGameCategories();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
