package com.cs.jeff.test.baseapp;

import com.cs.cloud.core.portal.annotation.CloudPath;
import com.cs.cloud.core.portal.handler.Request;
import com.cs.cloud.core.portal.handler.Response;

@CloudPath("/jefftest/TestPathInTypeNoInterfaceMatchParaType")
public class TestPathInTypeNoInterfaceMatchParaType {

    public Response testprocessAPILogic(final Request request) {

        System.out.println("In " + "/jefftest/TestPathInTypeNoInterfaceMatchParaType" + "--public Response testprocessAPILogic(final Request request) {");

        return null;
    }

}
