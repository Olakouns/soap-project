package io.foot.footstat.controllers;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

import io.foot.footstat.wsdl.*;


@Endpoint
public class FootsController {

    private static final String NAMESPACE_URI = "http://localhost:8080/myservice";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "requestFootMatch")
    public @ResponsePayload FootMatch getMatch(@RequestPayload String requestFootMatch){
        return new FootMatch();
    }

}
