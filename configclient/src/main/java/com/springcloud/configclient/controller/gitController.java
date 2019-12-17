package com.springcloud.configclient.controller;

import com.springcloud.configclient.config.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gitController {

    @Autowired
    private GitConfig gitConfig;

    @GetMapping(value = "show")
    public Object show() {
        return gitConfig;
    }
}
