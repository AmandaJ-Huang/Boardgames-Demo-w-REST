package com.bgg.xmlapi.demo.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;

public class DOMXMLParser {

    private String rootURL = "https://www.boardgamegeek.com/xmlapi2/thing?id=0";
    private String statsURI = "&stats=1";

    public String parser(String id) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        String result = "";

        try {

            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(rootURL + id + statsURI).openStream());
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("poll");
            Node node = nodeList.item(0);
            NodeList childList = node.getChildNodes();

            System.out.print(node.getNodeName() + " "); // poll
            System.out.print(node.getAttributes().item(0) + " "); //name="suggested_numplayers"
            System.out.print(node.getAttributes().item(1) + " "); //title="User Suggested Number of Players"
            System.out.println(node.getAttributes().item(2)); //totalvotes="1647"

            //"results" --> numPlayers1?
//            Node node1 = nodeList.item(0).getChildNodes().item(1);
//            System.out.println(node1); //[results: null]
//
//            Node node2 = node1.getAttributes().item(0);
//            System.out.println(node2.getNodeName() + " : " + node2.getTextContent()); //"numPlayers 1"
//
//            Node node3 = nodeList.item(0).getChildNodes().item(1).getChildNodes().item(1);
//            System.out.println(node3.getAttributes().item(0).getTextContent() + " : " + node3.getAttributes().item(1).getTextContent()); //numvotes "1" : value "Best" --> sorted by nodeName in alphabetical order?
//
//            Node node4 = nodeList.item(0).getChildNodes().item(1).getChildNodes().item(3);
//            System.out.println(node4.getAttributes().item(0).getTextContent() + " : " + node4.getAttributes().item(1).getTextContent()); //numvotes "3" : value "Recommended" --> sorted by nodeName in alphabetical order?
//
//            Node node5 = nodeList.item(0).getChildNodes().item(1).getChildNodes().item(5);
//            System.out.println(node5.getAttributes().item(0).getTextContent() + " : " + node5.getAttributes().item(1).getTextContent()); //numvotes "1122" : value "Not Recommended" --> sorted by nodeName in alphabetical order?


            for (int i = 0; i < node.getChildNodes().getLength(); i++) {
                Node currNode = node.getChildNodes().item(i);

                if(currNode.getNodeType() == Node.ELEMENT_NODE) {
                    String str = currNode.getNodeName();

                    for (int j = 0; j < currNode.getAttributes().getLength(); j++) {
                        Node currAttribute = currNode.getAttributes().item(j);

                        if(currAttribute.getNodeType() == Node.ATTRIBUTE_NODE){
                            str += " : " + currAttribute.getNodeName() + " " + currAttribute.getTextContent();
                        }
                        System.out.println(str);
                    }

                    for (int j = 0; j < currNode.getChildNodes().getLength(); j++) {
                        Node currChild = currNode.getChildNodes().item(j);

                        if(currChild.getNodeType() == Node.ELEMENT_NODE){
                            String childStr = "\t" + currChild.getNodeName();

                            for (int k = 0; k < currChild.getAttributes().getLength(); k++) {
                                Node childAttribute = currChild.getAttributes().item(k);

                                if(childAttribute.getNodeType() == Node.ATTRIBUTE_NODE){
                                    childStr += " : " + childAttribute.getNodeName() + " " + childAttribute.getTextContent();
                                }
                            }

                            System.out.println(childStr);
                        }


                    }
                }

            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return "nada mas";
    }
}
