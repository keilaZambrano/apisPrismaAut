package helpers;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ConfigHeader {

    private static Document doc = null;

    private static Document readXml() {
        if (doc == null) {
            File file = new File("configHeader.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                doc = dBuilder.parse(file);
                return doc;
            } catch (ParserConfigurationException | SAXException | IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        } else {
            return doc;
        }
    }

    public static String getBaseUrl() {
        return readXml().getElementsByTagName("baseurl").item(0).getTextContent();
    }

    public static String getKey() {
        return readXml().getElementsByTagName("key").item(0).getTextContent();
    }

    public static String getToken() {
        return readXml().getElementsByTagName("token").item(0).getTextContent();
    }

    public static String getUsername() {
        return readXml().getElementsByTagName("username").item(0).getTextContent();
    }

    public static String getContentType() {
        return readXml().getElementsByTagName("contenttype").item(0).getTextContent();
    }

    public static String getAccounNumber() {
        return readXml().getElementsByTagName("accountnumber").item(0).getTextContent();
    }

    public static String getCloseDateSince() {
        return readXml().getElementsByTagName("closedatesince").item(0).getTextContent();
    }

    public static String getCloseDateUntil() {
        return readXml().getElementsByTagName("closedateuntil").item(0).getTextContent();
    }

    public static String getPlatform() {
        return readXml().getElementsByTagName("platform").item(0).getTextContent();
    }

    public static String getBankcode() {
        return readXml().getElementsByTagName("bankcode").item(0).getTextContent();
    }

    public static String getUrl() {
        return readXml().getElementsByTagName("url").item(0).getTextContent();
    }

}
