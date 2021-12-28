package com.bgg.xmlapi.demo.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Name {

    @JacksonXmlProperty(isAttribute = true)
    private String type;

    @JacksonXmlProperty(isAttribute = true, localName = "sortindex")
    private String sortIndex;

    @JacksonXmlProperty(isAttribute = true)
    private String value;
}
