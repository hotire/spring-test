package com.github.hotire.springtest.spring.restDocs;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.TestConstructor.AutowireMode;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.github.hotire.springtest.User;
import com.github.hotire.springtest.UserController;
import com.github.hotire.springtest.UserService;

@WebMvcTest(UserController.class)
@AutoConfigureRestDocs("target/generated-snippets")
@TestConstructor(autowireMode = AutowireMode.ALL)
class UserControllerTest {

    private final MockMvc mockMvc;

    public UserControllerTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @MockBean
    private UserService userService;

    @Test
    void findById() throws Exception {
        // when
        when(userService.findById(1L)).thenReturn(new User());
        mockMvc.perform(MockMvcRequestBuilders.get("/user/1"))
               .andDo(print());

    }

}
