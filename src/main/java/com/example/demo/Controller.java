package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.ServletSecurity;
import java.io.IOException;

@ServletSecurity
@RequestMapping(value = "/invoke")
@RestController
//@org.springframework.stereotype.Controller
//@ResponseBody
public class Controller {

    POJO pojo = new POJO();

    @PostMapping

    @RequestMapping(value = "/create")
    public void putmethod(@RequestBody byte[] data) throws IOException {

//        ObjectMapper objectMapper = new ObjectMapper();
//        POJO pojo1 = objectMapper.readValue(data,POJO.class);

        System.out.println(new String(data));


    }


    @GetMapping
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public void getmethod(@RequestParam(value = "id") String id, @RequestParam String name) {
//        pojo.getId();
        System.out.println(id);
        System.out.println(name);
    }


    @GetMapping
    @RequestMapping(value = "/delete/{id}")
    public void deletemethod(@PathVariable String id) {

        System.out.println("deleted " + id);

//        POJO pojo = new POJO();
    }
}
