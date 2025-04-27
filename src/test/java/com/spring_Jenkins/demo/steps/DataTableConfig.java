package com.spring_Jenkins.demo.steps;

import com.spring_Jenkins.demo.model.Client;
import com.spring_Jenkins.demo.model.ClientCreditGrade;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableConfig {

    @DataTableType
    public Client mapToClient(Map<String, String> row) {
        return new Client(
                Integer.parseInt(row.get("id")),
                row.get("firstName"),
                row.get("lastName"),
                row.get("email"),
                Long.parseLong(row.get("creditLimit")),
                Long.parseLong(row.get("creditUsage"))
        );
    }

    @DataTableType
    public ClientCreditGrade mapToClientCreditGrade(Map<String, String> row) {
        return new ClientCreditGrade(
                new Client(Integer.parseInt(row.get("id")),null,null,null,null,null),
                row.get("creditGrade").charAt(0)
        );
    }
}
