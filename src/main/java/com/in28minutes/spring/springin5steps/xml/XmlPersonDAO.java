package com.in28minutes.spring.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XmlPersonDAO {

    @Autowired
    XmlJdbcConnection xmlJdbcConnectionn;

    public XmlJdbcConnection getXmlJdbcConnectionn() {
        return xmlJdbcConnectionn;
    }

    public void setXmlJdbcConnectionn(XmlJdbcConnection xmlJdbcConnectionn) {
        this.xmlJdbcConnectionn = xmlJdbcConnectionn;
    }
}
