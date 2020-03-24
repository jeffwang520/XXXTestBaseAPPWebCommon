package com.cs.jeff.test.baseapp;

import com.cs.cloud.core.portal.annotation.CloudPath;
import com.cs.cloud.core.portal.handler.Request;
import com.cs.cloud.core.portal.handler.Response;

@CloudPath("/jefftest/TestPathInTypeNoInterface")
public class TestPathInTypeNoInterface {

    public Response processAPILogic(final Request request) {

        System.out.println("In " + "/jefftest/TestPathInTypeNoInterface" + "-- public Response processAPILogic(final Request request) {");
        return null;
    }

}
