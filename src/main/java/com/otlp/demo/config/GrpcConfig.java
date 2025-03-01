package com.otlp.demo.config;

import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

	// it will export log to tracing url
    @Bean
    public OtlpGrpcSpanExporter otlpHttpSpanExporter(@Value("${tracing.url}") String url) {
        return OtlpGrpcSpanExporter.builder().setEndpoint(url).build();
    }

}

//gRPC is a high-performance, open-source RPC (Remote Procedure Call) 
//framework developed by Google. It allows different applications 
//to communicate efficiently over a network.

//Uses HTTP/2 
//Bi-directional Streaming -> Allows continuous data flow between client and server.
//Load Balancing and Interception → Supports built-in client-side load balancing.
