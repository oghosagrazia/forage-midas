package com.jpmc.midascore.component;
import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class TransactionListener {

    // Kafka listener for Midas-core application.
    // Listens to the configured kafka topic and receives deserialised Transaction objects.
    @KafkaListener(
            topics = "${general.kafka-topic}", groupId = "midas-core-group")

    public void listen (Transaction transactions){

        // Handles transactions.
    }
}
