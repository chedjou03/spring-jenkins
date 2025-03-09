package com.spring_Jenkins.demo.service;


import com.spring_Jenkins.demo.model.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientService {

    public List<Client> getClients(){
        List<Client> clients = new ArrayList<>();



        Client client1 = new Client(1,"simplice","Chedjou","chedjou@yahoo.com");

        Client client2 = new Client(2,"Daren","Joseph","dare@yahoo.com");

        Client client3 = new Client(3,"samera","florence","dflorance@yahoo.com");

        Client client4 = new Client(4,"Justin","Haper","justinHaper@yahoo.com");

        Client client5 = new Client(5,"jeff","wanf","jwanf@yahoo.com");

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);

        return clients;
    }
}
