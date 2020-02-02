package com.leo.sell.dataobject;

import com.leo.sell.enums.OrderStatusEnum;
import com.leo.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    private String orderId;
    //买家姓名
    private String buyerName;
    //买家电话
    private String buyerPhone;
    //买家地址
    private String buyerAddress;
    //买家openid
    private String buyerOpenid;
    //订单总价
    private BigDecimal orderAmount;
    //订单状态  默认为新下单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    //支付状态 默认为0 未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    private Date createTime;
    private Date updateTime;
}
