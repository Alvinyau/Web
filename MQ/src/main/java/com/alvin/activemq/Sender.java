package com.alvin.activemq;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.*;

/*
 * Created by Alvinyau on 2015/9/11.
 */
public class Sender {

    public static void main(String args[]){
        ConnectionFactory connectionFactory;
        Connection connection;
        Session session;
        Destination destination;
        MessageProducer messageProducer;
        connectionFactory=new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,"tcp:localhost:61616");
        try{
            connection=connectionFactory.createConnection();
            connection.start();
            session=connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);
            destination=session.createQueue("FirstQueue");
            messageProducer=session.createProducer(destination);
            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            //sendMessage(messageProducer,session);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void sendMessage(MessageProducer messageProducer,Session session){

    }

}
