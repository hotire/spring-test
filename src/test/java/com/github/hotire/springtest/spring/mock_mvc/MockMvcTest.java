package com.github.hotire.springtest.spring.mock_mvc;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import com.github.hotire.springtest.UserController;
import com.github.hotire.springtest.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class MockMvcTest {

    @Test
    void get() throws Exception {
        MockMvcBuilders
            .standaloneSetup(new UserController(new UserService()))
            .build()
            .perform(MockMvcRequestBuilders.get("/user/1"))
            .andDo(print());
    }

}
