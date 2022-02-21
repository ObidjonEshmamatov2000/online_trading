package com.star.online_trading.entity.category;

import com.star.online_trading.entity.BaseEntity;
import com.star.online_trading.entity.product.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category_shop")
public class CategoryEntity extends BaseEntity {

    private String name;
    private long parentId;

    @OneToMany(
            mappedBy = "categoryEntity",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<ProductEntity> productEntityList;
}
