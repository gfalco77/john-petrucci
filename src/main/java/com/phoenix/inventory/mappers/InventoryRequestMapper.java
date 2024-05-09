package com.phoenix.inventory.mappers;

import com.phoenix.inventory.requests.InventoryRequest;
import com.phoenix.schema.stock.ProductStock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface InventoryRequestMapper {

    InventoryRequestMapper mapper = Mappers.getMapper(InventoryRequestMapper.class);

    @Mapping(source = "sku", target = "productId")
    InventoryRequest toInventoryRequest(ProductStock productStock);
}
