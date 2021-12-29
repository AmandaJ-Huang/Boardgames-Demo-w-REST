package com.bgg.xmlapi.demo.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BgElement {

    @JacksonXmlProperty(isAttribute = true)
    private String value;

    public String getValue() {
        return value;
    }
}
