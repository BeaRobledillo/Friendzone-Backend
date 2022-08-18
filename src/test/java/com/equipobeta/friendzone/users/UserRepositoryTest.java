package com.equipobeta.friendzone.users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(UserController.class)
public interface UserRepositoryTest {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    MockMvc mockMvc = null;


    @Autowired
    final UserRepository userRepository = null;


    @Test
    default void findById() throws Exception {
        User user = userRepository.save(new User(
                1L,
                "Bea",
                "bea@gmail.com",
                "123456",
                "BeaBootcamp"
        ));
        assert false;
        mockMvc.perform(get("/user/"+user.getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", equalTo(1L)))
                .andExpect(jsonPath("$.name", equalTo("Bea")))
                .andExpect(jsonPath("$.email", equalTo("bea@gmail.com")))
                .andExpect(jsonPath("$.password", equalTo("123456")))
                .andExpect(jsonPath("$.username", equalTo("BeaBootcamp")));

    }



}
