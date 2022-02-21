package com.star.online_trading.controller.user;

import com.star.online_trading.entity.user.UserEntity;
import com.star.online_trading.model.receive.UserReceiveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    @PostMapping("/add")
    public ResponseEntity<?> addUser(
            @Valid @RequestBody UserReceiveDTO userReceiveDTO
    ) {

        return ResponseEntity.ok(new UserEntity());
    }
}
