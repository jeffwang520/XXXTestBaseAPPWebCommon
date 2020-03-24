package com.cs.jeff.test.baseapp;

import com.cs.cloud.core.portal.annotation.CloudPath;
import com.cs.cloud.core.portal.handler.APIProcessHandler;
import com.cs.cloud.core.portal.handler.Request;
import com.cs.cloud.core.portal.handler.Response;

@CloudPath("/jefftest/TestPathInTypeHasInterface")
public class TestPathInTypeHasInterface implements APIProcessHandler {

    @Override
    public Response processAPILogic(final Request request) {

        System.out.println("In " + "/jefftest/TestPathInTypeHasInterface" + "-- public Response processAPILogic(final Request request) {");

        return null;
    }

}
