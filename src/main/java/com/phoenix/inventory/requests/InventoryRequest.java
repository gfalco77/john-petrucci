package com.phoenix.inventory.requests;import com.phoenix.inventory.domain.LocationType;import lombok.Data;@Datapublic class InventoryRequest {  private String productId;  private String locationName;  private Long quantity;  private LocationType type;}