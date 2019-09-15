package com.lyj;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost/demo",new Demo());
        System.out.println("服务端接口说明访问地址:"+"http://localhost/demo?wsdl");
    }
}
