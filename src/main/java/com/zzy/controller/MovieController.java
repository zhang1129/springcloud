package com.zzy.controller;

import com.zzy.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/11/23.
 */
@RestController
public class MovieController     {

        @Autowired
        private RestTemplate restTemplate;

        @GetMapping(path = "/movie/{id}")
        public UserDTO findByid(@PathVariable Long id) {
            //通过<span style="font-family: Arial, Helvetica, sans-serif;">restTemplate访问provider服务</span>
            return this.restTemplate.getForEntity("http://provider/simple/" + id, UserDTO.class).getBody();

        }
    }
