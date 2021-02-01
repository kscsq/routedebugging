package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class TestProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
//        ReceivePackageData data = new ReceivePackageData();
//        data.setPackageData(exchange.getIn().getBody(String.class));
//        exchange.getIn().setBody(data);

        System.out.println();

    }
}
