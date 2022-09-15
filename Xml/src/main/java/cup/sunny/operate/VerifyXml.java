package cup.sunny.operate;

import cup.sunny.utils.XsdVerify;

/**
 * xsd校验xml
 */
public class VerifyXml {
    public static void main(String[] args) {
        String xmlFileName = "Xml/src/main/resources/courses.xml";
        String xsdFileName = "Xml/src/main/resources/courses.xsd";
        XsdVerify.xsdVerify(xmlFileName, xsdFileName);
    }
}
