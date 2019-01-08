package org.newegg.tpl.groceries.crypto.controller;

import org.newegg.tpl.groceries.crypto.entity.CryptoInfo;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CryptoController {

    @PostMapping("/crypto")
    public Object crypto(@RequestBody CryptoInfo cryptoInfo){
        Map<String,String> map = new HashMap<>();
        map.put("message","123456789");
        return map;
    }
}
