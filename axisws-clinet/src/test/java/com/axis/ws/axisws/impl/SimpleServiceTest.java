/**
 * SimpleServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.axis.ws.axisws.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/*
 *  SimpleServiceTest Junit test case
 */
public class SimpleServiceTest {
    /**
     * Auto generated test method
     */
	@Test
    public void testgetCity() throws java.lang.Exception {
        com.axis.ws.axisws.impl.SimpleServiceStub stub = new com.axis.ws.axisws.impl.SimpleServiceStub(); //the default implementation should point to the right endpoint

        com.axis.ws.axisws.impl.SimpleServiceStub.GetCity getCity4 = (com.axis.ws.axisws.impl.SimpleServiceStub.GetCity) getTestObject(com.axis.ws.axisws.impl.SimpleServiceStub.GetCity.class);
        // TODO : Fill in the getCity4 here
        assertNotNull(stub.getCity(getCity4));
    }

    /**
     * Auto generated test method
     */
	@Test
    public void testhelloService() throws java.lang.Exception {
        com.axis.ws.axisws.impl.SimpleServiceStub stub = new com.axis.ws.axisws.impl.SimpleServiceStub(); //the default implementation should point to the right endpoint

        com.axis.ws.axisws.impl.SimpleServiceStub.HelloService helloService6 = (com.axis.ws.axisws.impl.SimpleServiceStub.HelloService) getTestObject(com.axis.ws.axisws.impl.SimpleServiceStub.HelloService.class);
        // TODO : Fill in the helloService6 here
        assertNotNull(stub.helloService(helloService6));
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
        java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }
}
