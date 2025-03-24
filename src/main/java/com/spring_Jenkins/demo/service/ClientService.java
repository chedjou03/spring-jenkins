package com.spring_Jenkins.demo.service;


import com.spring_Jenkins.demo.controller.clientController;
import com.spring_Jenkins.demo.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientService {
    public static Logger logger = LoggerFactory.getLogger(ClientService.class);

    public List<Client> getClients(){

        logger.info("*********** in client Service");

        List<Client> clients = new ArrayList<>();



        Client client1 = new Client(1,"simplice","Chedjou","chedjou@yahoo.com");

        Client client2 = new Client(2,"Daren","Joseph","dare@yahoo.com");

        Client client3 = new Client(3,"samera","florence","dflorance@yahoo.com");

        Client client4 = new Client(4,"Justin","Haper","justinHaper@yahoo.com");

        Client client5 = new Client(5,"jeff","wanf","jwanf@yahoo.com");

        Client client6 = new Client(6,"Hermann","Fongoum","hermann@yahoo.com");

        Client client7 = new Client(7,"jamie","Raina","jamie@yahoo.com");

        Client client8 = new Client(8,"thierry","Henry","titi@yahoo.com");

        Client client9 = new Client(9,"Andre","Braxton","andre@yahoo.com");

        Client client10 = new Client(10,"Jimmy","Borrow","jimmy@yahoo.com");

        Client client11 = new Client(11,"steph","curry","steph@yahoo.com");

        Client client12 = new Client(12,"klay","thompson","klay@yahoo.com");

        Client client13 = new Client(13,"Oceanne","Mpiana","oceanne@yahoo.com");

        Client client14 = new Client(14,"jean paul","bissebo","jpbissebo@yahoo.com");

        Client client15 = new Client(15,"patrick","bologna","patricbologna@yahoo.com");

        Client client16 = new Client(16,"nichole","longondo","nicholelongodo@yahoo.com");

        Client client17 = new Client(17,"jean marie","lukulassi","jmlukulassi@yahoo.com");

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);
        clients.add(client6);
        clients.add(client7);
        clients.add(client8);
        clients.add(client9);
        clients.add(client10);
        clients.add(client11);
        clients.add(client12);
        clients.add(client13);
        clients.add(client14);
        clients.add(client15);
        clients.add(client16);
        clients.add(client17);

        return clients;
    }
}
