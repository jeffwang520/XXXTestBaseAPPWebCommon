package com.cs.jeff.test.tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class TestTool {

    public static void sendResponseText(final HttpServletResponse response, final String message) {

        PrintWriter pw;
        try {
            pw = response.getWriter();
            pw.write(message);
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
