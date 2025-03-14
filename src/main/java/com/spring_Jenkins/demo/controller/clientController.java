package com.spring_Jenkins.demo.controller;


import com.spring_Jenkins.demo.model.Client;
import com.spring_Jenkins.demo.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class clientController {

    public static Logger logger = LoggerFactory.getLogger(clientController.class);

    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getClients() throws IOException {
        List<Client> clients = clientService.getClients();
        return clients;
    }
}
