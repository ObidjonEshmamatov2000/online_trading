package com.star.online_trading.service;

import com.star.online_trading.entity.user.UserEntity;
import com.star.online_trading.exception.UserNotFoundException;
import com.star.online_trading.model.receive.UserReceiveDTO;
import com.star.online_trading.model.response.ApiResponse;
import com.star.online_trading.repository.UserRepository;
import com.star.online_trading.util.ResponseUtils;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public ApiResponse addUser(
            UserReceiveDTO userReceiveDTO
    ) {
        checkUser(userReceiveDTO.getPhoneNumber());
        UserEntity userEntity = modelMapper.map(userReceiveDTO, UserEntity.class);
        userRepository.save(userEntity);
        return ResponseUtils.SUCCESS;
    }

    private void checkUser(String username){
        Optional<UserEntity> optionalUserEntity = userRepository.findByPhoneNumber(username);

        if (optionalUserEntity.isPresent())
            throw new UserNotFoundException(username + " user is exist");
    }
}
