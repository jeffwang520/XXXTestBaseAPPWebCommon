package com.cs.jeff.test.baseapp.testmethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cs.cloud.core.portal.annotation.CloudAutowired;
import com.cs.cloud.core.portal.annotation.CloudPath;
import com.cs.cloud.core.portal.beans.APIRequest;
import com.cs.cloud.core.portal.beans.RequestURI;
import com.cs.cloud.core.portal.handler.Request;
import com.cs.cloud.core.portal.handler.Response;

public class TestPathInMethodFullMatch {

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

    @CloudPath("/jefftest/testinmethod/fullmatch")
    public Response testProcessAPILogic_FullMatch(final Request request) {

        System.out.println("In " + "/jefftest/testinmethod/fullmatch" + "--public Response testProcessAPILogic_FullMatch(final Request request) {");

        return null;
    }

    @CloudPath("/jefftest/testinmethod/halfmatch")
    public Response testProcessAPILogic_HalfMatch() {

        System.out.println("In " + "/jefftest/testinmethod/halfmatch" + "--public Response testProcessAPILogic_HalfMatch() {");

        return null;
    }
}
