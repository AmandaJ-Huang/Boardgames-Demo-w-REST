package com.bgg.xmlapi.demo.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.persistence.*;
import java.util.Objects;

//@Entity
//@Table(name = "boardgames", schema = "bgg_data_mine")
@JacksonXmlRootElement(localName = "items")
public class Boardgames {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JacksonXmlProperty(isAttribute = true)
    private Long id;

    @JacksonXmlProperty(isAttribute = true)
    private String termsofuse;

    @JacksonXmlElementWrapper(localName = "item")
    @JacksonXmlProperty(isAttribute = true)
    private String thumbnail;

    @JacksonXmlText
    private String thumbnailUrl;

    @JacksonXmlProperty(isAttribute = true)
    private String primary_name;

    @JacksonXmlProperty(isAttribute = true)
    private Integer minplayers;

    @JacksonXmlProperty(isAttribute = true)
    private Integer maxplayers;

    @JacksonXmlProperty(isAttribute = true)
    private Integer suggest_numplayers;

    @JacksonXmlProperty(isAttribute = true)
    private Integer playingtime;

    @JacksonXmlProperty(isAttribute = true)
    private Integer suggested_playerage;

    @JacksonXmlProperty(isAttribute = true)
    private Float rating;

    @JacksonXmlProperty(isAttribute = true)
    private Long rank;

    @JacksonXmlProperty(isAttribute = true)
    private Float averageweight;

    @JacksonXmlProperty(isAttribute = true)
    private String category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTermsofuse() {
        return termsofuse;
    }

    public void setTermsofuse(String termsofuse) {
        this.termsofuse = termsofuse;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getPrimary_name() {
        return primary_name;
    }

    public void setPrimary_name(String primary_name) {
        this.primary_name = primary_name;
    }

    public Integer getMinplayers() {
        return minplayers;
    }

    public void setMinplayers(Integer minplayers) {
        this.minplayers = minplayers;
    }

    public Integer getMaxplayers() {
        return maxplayers;
    }

    public void setMaxplayers(Integer maxplayers) {
        this.maxplayers = maxplayers;
    }

    public Integer getSuggest_numplayers() {
        return suggest_numplayers;
    }

    public void setSuggest_numplayers(Integer suggest_numplayers) {
        this.suggest_numplayers = suggest_numplayers;
    }

    public Integer getPlayingtime() {
        return playingtime;
    }

    public void setPlayingtime(Integer playingtime) {
        this.playingtime = playingtime;
    }

    public Integer getSuggested_playerage() {
        return suggested_playerage;
    }

    public void setSuggested_playerage(Integer suggested_playerage) {
        this.suggested_playerage = suggested_playerage;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Float getAverageweight() {
        return averageweight;
    }

    public void setAverageweight(Float averageweight) {
        this.averageweight = averageweight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
