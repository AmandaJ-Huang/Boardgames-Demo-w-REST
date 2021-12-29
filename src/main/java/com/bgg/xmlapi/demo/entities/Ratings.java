package com.bgg.xmlapi.demo.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Ratings {

    @JacksonXmlProperty
    private BgElement usersrated;
    @JacksonXmlProperty
    private BgElement average;
    @JacksonXmlProperty
    private BgElement averageweight;

    //Ignored for database purposes
    @JacksonXmlProperty(isAttribute = true)
    private String bayesaverage;
    @JacksonXmlProperty
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


    //getters
    public BgElement getUsersrated() {
        return usersrated;
    }

    public BgElement getAverage() {
        return average;
    }

    public BgElement getAverageweight() {
        return averageweight;
    }
}
