package com.spring_Jenkins.demo.service;


import com.spring_Jenkins.demo.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class ClientService {
    public static Logger logger = LoggerFactory.getLogger(ClientService.class);

    public List<Client> getClients(){

        logger.info("*********** in client Service");

        List<Client> clients = new ArrayList<>();



        Client client1 = new Client(1,"simplice","Chedjou","chedjou@yahoo.com",40000,25000);

        Client client2 = new Client(2,"Daren","Joseph","dare@yahoo.com",40000,60000);

        Client client3 = new Client(3,"samera","florence","dflorance@yahoo.com",40000,15000);

        Client client4 = new Client(4,"Justin","Haper","justinHaper@yahoo.com",40000,50000);

        Client client5 = new Client(5,"jeff","wanf","jwanf@yahoo.com",40000,35000);

        Client client6 = new Client(6,"Hermann","Fongoum","hermann@yahoo.com",40000,100000);

        Client client7 = new Client(7,"jamie","Raina","jamie@yahoo.com",40000,40000);

        Client client8 = new Client(8,"thierry","Henry","titi@yahoo.com",40000,25000);

        Client client9 = new Client(9,"Andre","Braxton","andre@yahoo.com",40000,40000);

        Client client10 = new Client(10,"Jimmy","Borrow","jimmy@yahoo.com",40000,75000);

        Client client11 = new Client(11,"steph","curry","steph@yahoo.com",40000,2000);

        Client client12 = new Client(12,"klay","thompson","klay@yahoo.com",40000,10000);

        Client client13 = new Client(13,"Oceanne","Mpiana","oceanne@yahoo.com",40000,45000);

        Client client14 = new Client(14,"jean paul","bissebo","jpbissebo@yahoo.com",40000,5000);

        Client client15 = new Client(15,"patrick","bologna","patricbologna@yahoo.com",40000,35000);

        Client client16 = new Client(16,"nichole","longondo","nicholelongodo@yahoo.com",40000,25000);

        Client client17 = new Client(17,"jean marie","lukulassi","jmlukulassi@yahoo.com",40000,25000);

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

    public  Client getClient(int clientId){
        Client foundClient = new Client();
        List<Client> clients =  this.getClients();
        for(Client aClient : clients){
            if(aClient.getId() == clientId){
                foundClient = aClient;
                break;
            }
        }
        return  foundClient;
    }


}
