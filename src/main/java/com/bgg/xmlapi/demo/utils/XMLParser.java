package com.bgg.xmlapi.demo.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;

public class XMLParser {

    private String rootURL = "https://www.boardgamegeek.com/xmlapi2/thing?id=";
    private String statsURI = "&stats=1";

    public String parser(String URI, String tagName, String item) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        String result = "";

        try {
//            DocumentBuilder db = dbf.newDocumentBuilder();
//            Document doc = db.parse(new URL(rootURL + URI).openStream());
//            doc.getDocumentElement().normalize();
//            NodeList nodeList = doc.getElementsByTagName(tagName);

//            for (int i = 0; i < nodeList.getLength(); i++) {
//                Node node = nodeList.item(i);
//                if (node.getNodeType() == Node.ELEMENT_NODE) {
//                    Element element = (Element) node;
//                    result += (element.getAttribute(item) + "\n");
//                }
//            }
//            System.out.println(result);

            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL("https://www.boardgamegeek.com/xmlapi2/thing?id=013").openStream());
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("poll");
            Node node = nodeList.item(0);
            NodeList childList = node.getChildNodes();

//            System.out.println(node.getNodeName());
//            System.out.println(node.getAttributes().item(0));
//            System.out.println(node.getAttributes().item(1));
//            System.out.println(node.getAttributes().item(2));

            //"results" --> numPlayers1?
            Node node1 = nodeList.item(0).getChildNodes().item(1);
            Node node2 = node1.getAttributes().item(0);
            System.out.println(node1);
            System.out.println(node2.getTextContent());

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return "nada mas";
    }
}
