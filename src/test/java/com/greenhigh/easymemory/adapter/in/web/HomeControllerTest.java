package com.greenhigh.easymemory.adapter.in.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(HomeController.class)
class HomeControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testFirst() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/").accept(MediaType.TEXT_PLAIN);
        MvcResult mvcResult = mockMvc.perform(request).andExpect(status().isOk()).andReturn();
        assertEquals("Hello, GreenHigh!", mvcResult.getResponse().getContentAsString());
    }

}