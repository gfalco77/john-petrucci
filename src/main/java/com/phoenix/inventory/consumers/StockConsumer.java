package com.phoenix.inventory.consumers;

import com.phoenix.inventory.mappers.InventoryRequestMapper;
import com.phoenix.inventory.services.InventoryService;
import com.phoenix.schema.stock.ProductStock;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StockConsumer {

    private final InventoryService inventoryService;

    @KafkaListener(id = "myListener", topics = "stock-topic", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(@Payload ProductStock productStock) {
        var inventoryRequest = InventoryRequestMapper.mapper.toInventoryRequest(productStock);
        inventoryService.createInventoryLevel(inventoryRequest).subscribe();
    }
}
