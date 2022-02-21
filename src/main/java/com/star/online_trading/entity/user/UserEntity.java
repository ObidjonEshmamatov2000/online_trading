package com.star.online_trading.entity.user;

import com.star.online_trading.entity.BaseEntity;
import com.star.online_trading.entity.role.RoleEntity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_shop")
public class UserEntity extends BaseEntity {

    private String firstName;
    private String lastName;

    @Size(min = 5, max = 14)
    @NotBlank
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @NotEmpty
    @Column(nullable = false)
    private String password;

    private String smsCode;

    private boolean isActive;


    @ManyToMany
    @JoinTable(
            name = "user_role_shop",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roleEntityList;
}
