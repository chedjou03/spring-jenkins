package com.spring_Jenkins.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
@JsonSerialize
public class ClientCreditGrade {

    private Client client;
    private char creditGrade;

    public ClientCreditGrade(){}

    public ClientCreditGrade(Client client, char creditGrade){
        this.client = client;
        this.creditGrade = creditGrade;
    }

    public ClientCreditGrade calculateClientCreditGrade(Client client){
        ClientCreditGrade aClientCreditGrade = new ClientCreditGrade();
        aClientCreditGrade.setClient(client);

        long creditUsagePercentage = (client.getCreditUsage()/client.getCreditLimit())*100;

        if(creditUsagePercentage <= 30 ){
            aClientCreditGrade.setCreditGrade('A');
        }
        else if(creditUsagePercentage > 30 && creditUsagePercentage <= 60){
            aClientCreditGrade.setCreditGrade('B');
        }
        else if(creditUsagePercentage > 60 && creditUsagePercentage <= 90){
            aClientCreditGrade.setCreditGrade('C');
        }
        else if(creditUsagePercentage > 90 && creditUsagePercentage <= 100){
            aClientCreditGrade.setCreditGrade('D');
        }
        else{
            aClientCreditGrade.setCreditGrade('F');
        }


        return aClientCreditGrade;
    }

}
