package com.bgg.xmlapi.demo.utils;

import com.bgg.xmlapi.demo.entities.Items;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.stream.Collectors;

public class JacksonXMLParser {
    private String rootURL = "https://www.boardgamegeek.com/xmlapi2/thing?id=0";
    private String statsURI = "&stats=1";
    private String gameId;

    public JacksonXMLParser() {
        this("1");
    }

    public JacksonXMLParser(String gameId) {
        this.gameId = gameId;
    }

    public Items parser() {

        try {
            JacksonXmlModule module = new JacksonXmlModule();
            module.setDefaultUseWrapper(false);
            ObjectMapper mapper = new XmlMapper(module);
            URL url = new URL(rootURL + gameId + statsURI);
            InputStream input = url.openStream();

            return mapper.readValue(input, Items.class);
        } catch (IOException e){
            e.printStackTrace();
        }
        return new Items();
    }

    public String getItemType() {
        return parser().getItem().getType();
    }

    public String getThumbnailUrl() {
        return parser()
                .getItem()
                .getThumbnail()
                .getThumbnailUrl();
    }

    public String getPrimaryName() {
        return parser()
                .getItem()
                .getNameList()
                .stream()
                .filter(name ->  name.getType().equals("primary"))
                .collect(Collectors.toList())
                .get(0)
                .getValue();
    }

    public String getYearPublished() {
        return parser()
                .getItem()
                .getYearpublished()
                .getValue();
    }

    public String getMinPlayers() {
        return parser()
                .getItem()
                .getMinPlayers()
                .getValue();
    }

    public String getMaxPlayers() {
        return parser()
                .getItem()
                .getMaxPlayers()
                .getValue();
    }

    public String getPlayingTime() {
        return parser()
                .getItem()
                .getPlayingTime()
                .getValue();
    }

    public String getMinPlaytime() {
        return parser()
                .getItem()
                .getMinPlaytime()
                .getValue();
    }

    public String getMaxPlaytime() {
        return parser()
                .getItem()
                .getMaxPlaytime()
                .getValue();
    }

    public String getMinAge() {
        return parser()
                .getItem()
                .getMinAge()
                .getValue();
    }

    public String getGameCategories() {
        return parser()
                .getItem()
                .getLinkList()
                .stream()
                .filter(link -> link.getType().equals("boardgamecategory"))
                .collect(Collectors.toList())
                .toString();
    }

    public String getUsersRated() {
        return parser()
                .getItem()
                .getUsersRated()
                .getValue();
    }

    public String getAverageRating() {
        return parser()
                .getItem()
                .getAverage()
                .getValue();
    }

    public String getDifficulty() {
        return parser()
                .getItem()
                .getAverageWeight()
                .getValue();
    }
}
