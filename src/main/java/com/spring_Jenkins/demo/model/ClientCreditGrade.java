package com.spring_Jenkins.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.Objects;

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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public char getCreditGrade() {
        return creditGrade;
    }

    public void setCreditGrade(char creditGrade) {
        this.creditGrade = creditGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientCreditGrade)) return false;
        ClientCreditGrade that = (ClientCreditGrade) o;
        return getCreditGrade() == that.getCreditGrade() && Objects.equals(getClient(), that.getClient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClient(), getCreditGrade());
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
