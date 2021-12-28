package com.bgg.xmlapi.demo.entities;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "items")
public class Items {

    @JacksonXmlProperty(localName = "termsofuse")
    private String termsOfUse;

    @JacksonXmlProperty(localName = "item")
    private Item item;

    public Item getItem() {
        return item;
    }
}
