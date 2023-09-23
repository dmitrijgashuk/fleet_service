package com.agromat.fleetservise;


import com.agromat.fleetservise.controller.rest.DriverRestController;
import com.agromat.fleetservise.dto.DriverDTO;
import com.agromat.fleetservise.service.DriverService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DriverRestController.class)
public class MvcTestDriverRestController {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    DriverService driverService;

    @Test
    public void should_create_new_driver() throws Exception {
        DriverDTO inputDriver = DriverDTO.builder()
                .phone("0689834808")
                .firstName("Костюк")
                .lastName("Анатолий").build();

        when(driverService.createDriver(inputDriver)).thenReturn(DriverDTO.builder()
                .phone("0689834808")
                .firstName("Костюк")
                .lastName("Анатолий")
                .id(1L).build());

        mockMvc.perform(get("/driver/1"))
                .andExpect(status().is2xxSuccessful())
                .andReturn();
    }

}
