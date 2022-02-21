package com.star.online_trading.entity.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_shop")
public class OrderEntity extends CartEntity{

    @Enumerated(EnumType.STRING)
    private OrderStatusEnum orderStatusEnum;
}
