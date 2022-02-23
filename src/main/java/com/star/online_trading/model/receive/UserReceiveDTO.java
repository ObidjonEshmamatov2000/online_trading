package com.star.online_trading.model.receive;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UserReceiveDTO {

    @NotEmpty(message = "first name must not be null")
    @JsonProperty("first_name")
    private String firstName;

    @NotEmpty
    @JsonProperty("last_name")
    private String lastName;

    @Size(min = 5, max = 14)
    @NotNull
    @JsonProperty("phone_number")
    private String phoneNumber;

    private String password;
}
