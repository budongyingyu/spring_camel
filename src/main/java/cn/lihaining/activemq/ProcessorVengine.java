package cn.lihaining.activemq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component(value = "processorVengine")
public class ProcessorVengine implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String request = exchange.getIn().getBody(String.class);
        System.out.println("["+request+"]正在处理....");
        exchange.getIn().setBody("已处理");
    }
}
