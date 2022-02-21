package com.star.online_trading.entity.order;

import com.star.online_trading.entity.product.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_product_shop")
public class OrderProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
 
    @ManyToOne
    private ProductEntity productEntity;
    
    private double amount;
    
}
