package com.miskevich.tomcatexample.web.servlet;

import javax.servlet.ServletException;

public class Test {


    public static void main(String[] args) throws ServletException {
        ExampleServlet servlet = new ExampleServlet();
        servlet.init();
        servlet.service();
    }
}
