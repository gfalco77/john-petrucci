package com.phoenix.inventory.domain;import jakarta.persistence.Id;import lombok.Builder;import lombok.Data;import lombok.ToString;@ToString@Data@Builderpublic class Location {  @Id  private Integer id;  private String name;  private LocationType type;  private String addressLine1;  private String addressLine2;  private String city;  private String postcode;}