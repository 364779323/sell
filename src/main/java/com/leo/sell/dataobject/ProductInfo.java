package com.leo.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    //状态 0正常 1下架
    private Integer productStatus;
    private Integer categoryType;
}
