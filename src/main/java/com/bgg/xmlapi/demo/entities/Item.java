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

    @JacksonXmlProperty(isAttribute = true, localName = "yearpublished")
    private BgElement yearPublished;

    @JacksonXmlProperty(isAttribute = true, localName = "minplayers")
    private BgElement minPlayers;

    @JacksonXmlProperty(isAttribute = true, localName = "maxplayers")
    private BgElement maxPlayers;

    @JacksonXmlProperty(isAttribute = true, localName = "playingtime")
    private BgElement playingTime;

    @JacksonXmlProperty(isAttribute = true, localName = "minplaytime")
    private BgElement minPlaytime;

    @JacksonXmlProperty(isAttribute = true, localName = "maxplaytime")
    private BgElement maxPlaytime;

    @JacksonXmlProperty(isAttribute = true, localName = "minage")
    private BgElement minAge;

    @JacksonXmlProperty(isAttribute = true, localName = "link")
    private List<Link> linkList;

    @JacksonXmlProperty(isAttribute = true, localName = "usersrated")
    private BgElement usersRated;

    @JacksonXmlProperty(isAttribute = true)
    private BgElement average;

    @JacksonXmlProperty(isAttribute = true, localName = "averageweight")
    private BgElement averageWeight;

    // Necessary values for parsing XML properly, but ignored for purposes of database
    @JacksonXmlProperty(isAttribute = true)
    private String type;
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    @JacksonXmlProperty(isAttribute = true)
    private String image;
    @JacksonXmlProperty(isAttribute = true)
    private String description;
    @JacksonXmlProperty(isAttribute = true)
    private String poll;
    @JacksonXmlProperty(isAttribute = true)
    private String results;
    @JacksonXmlProperty(isAttribute = true)
    private String result;
    @JacksonXmlProperty(isAttribute = true)
    private String statistics;
    @JacksonXmlProperty(isAttribute = true)
    private String ratings;
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

    // Getters
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public List<Name> getNameList() {
        return nameList;
    }

    public BgElement getYearpublished() {
        return yearPublished;
    }

    public BgElement getMinPlayers() {
        return minPlayers;
    }

    public BgElement getMaxPlayers() {
        return maxPlayers;
    }

    public BgElement getPlayingTime() {
        return playingTime;
    }

    public BgElement getMinPlaytime() {
        return minPlaytime;
    }

    public BgElement getMaxPlaytime() {
        return maxPlaytime;
    }

    public BgElement getMinAge() {
        return minAge;
    }

    public List<Link> getLinkList() {
        return linkList;
    }

    public BgElement getUsersRated() {
        return usersRated;
    }

    public BgElement getAverage() {
        return average;
    }

    public BgElement getAverageWeight() {
        return averageWeight;
    }
}
