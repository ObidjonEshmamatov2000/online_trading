package com.star.online_trading.entity.product;

import com.star.online_trading.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_discount_shop")
public class ProductDiscountEntity extends BaseEntity {

    private float discount; // % da
    private LocalDateTime startDate;
    private LocalDateTime endTime;

    private String name;

    @OneToMany
    private List<ProductEntity> productEntityList;

}
