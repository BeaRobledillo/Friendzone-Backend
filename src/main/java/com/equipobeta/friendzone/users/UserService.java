package com.equipobeta.friendzone.users;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById (Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
