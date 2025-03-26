package com.spring_Jenkins.demo.service;


import com.spring_Jenkins.demo.model.Client;
import com.spring_Jenkins.demo.model.ClientCreditGrade;
import org.springframework.stereotype.Component;

@Component
public class ClientCreditGradeService {

    public ClientCreditGrade calculateClientCreditGrade(Client aClient) {
        ClientCreditGrade aClientCreditGrade = new ClientCreditGrade();
        aClientCreditGrade = aClientCreditGrade.calculateClientCreditGrade(aClient);
        return aClientCreditGrade;
    }
}
