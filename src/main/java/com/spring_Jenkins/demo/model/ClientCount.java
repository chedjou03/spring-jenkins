package com.spring_Jenkins.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
@JsonSerialize
public class ClientCount {
 int clientCount;

    public  ClientCount(){}

    public  ClientCount(int clientCount){
     this.clientCount = clientCount;
    }
}
