package com.cs.jeff.test.baseapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cs.cloud.core.portal.annotation.CloudAutowired;
import com.cs.cloud.core.portal.annotation.CloudPath;
import com.cs.cloud.core.portal.beans.APIRequest;
import com.cs.cloud.core.portal.beans.RequestURI;
import com.cs.cloud.core.portal.handler.Request;
import com.cs.cloud.core.portal.handler.Response;

@CloudPath("/jefftest/TestPathInTypeNoInterfaceNotMatchParaType")
public class TestPathInTypeNoInterfaceNotMatchParaType {

    @CloudAutowired
    private Request request;

    @CloudAutowired
    private APIRequest apiRequest;

    @CloudAutowired
    private RequestURI requestURI;

    @CloudAutowired
    private HttpServletRequest httpRequest;

    @CloudAutowired
    private HttpServletResponse httpResponse;

    public Response testNotMatchProcessAPILogic(final Request request) {

        System.out.println("In " + "/jefftest/TestPathInTypeNoInterfaceNotMatchParaType" + "--public Response testNotMatchProcessAPILogic(final Request request) {");

        return null;
    }

}
