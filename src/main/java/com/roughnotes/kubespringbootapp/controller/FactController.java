package com.roughnotes.kubespringbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController()
@RequestMapping("/facts")
public class FactController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{id}")
    public String getFact(@PathVariable String id) {
        return restTemplate.getForObject("http://numbersapi.com/" + id, String.class);
    }
}
