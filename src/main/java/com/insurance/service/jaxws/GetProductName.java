
package com.insurance.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.17
 * Fri Nov 13 12:07:26 IST 2015
 * Generated source version: 2.7.17
 */

@XmlRootElement(name = "getProductName", namespace = "http://service.insurance.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductName", namespace = "http://service.insurance.com/")

public class GetProductName {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}

