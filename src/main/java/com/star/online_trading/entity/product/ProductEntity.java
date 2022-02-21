package com.star.online_trading.entity.product;

import com.star.online_trading.entity.BaseEntity;
import com.star.online_trading.entity.category.CategoryEntity;
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
@Table(name = "product_shop")
public class ProductEntity extends BaseEntity {

    private String name;
    private double price;
    private double quantity;

    @Enumerated(EnumType.STRING)
    private ProductUnitEnum productUnitEnum;

    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryEntity categoryEntity;
}
