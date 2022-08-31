package com.equipobeta.friendzone.users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;



import static org.hamcrest.Matchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTest {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private MockMvc mockMvc;

    @MockBean
    UserService userService;

    @Autowired
    private final UserRepository userRepository;


    UserControllerTest(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;

    }

//    @BeforeEach
//      void findById() {
//        userRepository.deleteAll();
//    }
//
//    @Test
//    void findById() throws Exception {
//        User user = userRepository.save(new User(
//                1L,
//                "Bea",
//                "bea@gmail.com",
//                "123456",
//                "BeaBootcamp"
//        ));
//        mockMvc.perform(get("/user/"+user.getId()))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", equalTo(1L)))
//                .andExpect(jsonPath("$.name", equalTo("Bea")))
//                .andExpect(jsonPath("$.email", equalTo("bea@gmail.com")))
//                .andExpect(jsonPath("$.password", equalTo("123456")))
//                .andExpect(jsonPath("$.username", equalTo("BeaBootcamp")));
//    }
}
