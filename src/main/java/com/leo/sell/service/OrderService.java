package com.leo.sell.service;

import com.leo.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    /*
     * 创建订单
     * 查询单个订单
     * 查询订单列表
     * 取消订单
     * 完结订单
     * 支付订单
     * */
    OrderDTO create(OrderDTO orderDTO);

    OrderDTO findOne(String orderId);

    //查询某个人的订单列表
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    OrderDTO cancel(OrderDTO orderDTO);

    OrderDTO finish(OrderDTO orderDTO);

    OrderDTO paid(OrderDTO orderDTO);

    //查询所有订单列表
    Page<OrderDTO> findList(Pageable pageable);
}
