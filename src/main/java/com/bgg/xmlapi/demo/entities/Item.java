package com.bgg.xmlapi.demo.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "item")
public class Item {

    @JacksonXmlProperty(isAttribute = true)
    private Thumbnail thumbnail;

    @JacksonXmlProperty(isAttribute = true, localName = "name")
    private List<Name> nameList;

    @JacksonXmlProperty(isAttribute = true)
    private YearPublished yearpublished;

    @JacksonXmlProperty(isAttribute = true)
    private String minplayers;

    @JacksonXmlProperty(isAttribute = true)
    private String maxplayers;

    @JacksonXmlProperty(isAttribute = true)
    private String poll;

    @JacksonXmlProperty(isAttribute = true)
    private String results;

    @JacksonXmlProperty(isAttribute = true)
    private String result;

    @JacksonXmlProperty(isAttribute = true)
    private String playingtime;

    @JacksonXmlProperty(isAttribute = true)
    private String minplaytime;

    @JacksonXmlProperty(isAttribute = true)
    private String maxplaytime;

    @JacksonXmlProperty(isAttribute = true)
    private String minage;
    @JacksonXmlProperty(isAttribute = true)
    private String link;
    @JacksonXmlProperty(isAttribute = true)
    private String statistics;
    @JacksonXmlProperty(isAttribute = true)
    private String ratings;
    @JacksonXmlProperty(isAttribute = true)
    private String usersrated;
    @JacksonXmlProperty(isAttribute = true)
    private String average;
    @JacksonXmlProperty(isAttribute = true)
    private String bayesaverage;
    @JacksonXmlProperty(isAttribute = true)
    private String ranks;
    @JacksonXmlProperty(isAttribute = true)
    private String rank;
    @JacksonXmlProperty(isAttribute = true)
    private String stddev;
    @JacksonXmlProperty(isAttribute = true)
    private String median;
    @JacksonXmlProperty(isAttribute = true)
    private String owned;
    @JacksonXmlProperty(isAttribute = true)
    private String trading;
    @JacksonXmlProperty(isAttribute = true)
    private String wanting;
    @JacksonXmlProperty(isAttribute = true)
    private String wishing;
    @JacksonXmlProperty(isAttribute = true)
    private String numcomments;
    @JacksonXmlProperty(isAttribute = true)
    private String numweights;
    @JacksonXmlProperty(isAttribute = true)
    private String averageweight;

    // Necessary values for parsing XML properly, but ignored for purposes of database
    @JacksonXmlProperty(isAttribute = true)
    private String type;
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private Image image;
    @JacksonXmlProperty(isAttribute = true)
    private String description;

    // Getters
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public List<Name> getNameList() {
        return nameList;
    }

    public YearPublished getYearpublished() {
        return yearpublished;
    }
}
