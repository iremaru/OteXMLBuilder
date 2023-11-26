package com.ote.rexeni.XMLBuilder;

import jakarta.xml.bind.JAXBException;

public class XMLBuilderHandleExceptions {

    public static void handleException(JAXBException e) {
        System.out.println("--------------------------------");
        System.out.println("ERROR AL CREAR EL FICHERO XML");
        System.out.println("-- CAUSA:");
        System.out.println( e.getCause() );
        System.out.println("-- ERROR:");
        System.out.println( e.getErrorCode() );
        System.out.println("--------------------------------");

    }
}
