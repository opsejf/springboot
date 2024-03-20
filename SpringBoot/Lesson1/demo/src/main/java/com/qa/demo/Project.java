package com.qa.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Project {

    @GetMapping("/project")
    public String index(){
        return "the projects controller";
    }

    @GetMapping("/project/{id}")
    public String projectGet(@PathVariable int id){
        return "(GET) Project ID:" + id;
    }


    @PostMapping("/project/{id}")
    public String projectUpdate(@PathVariable int id){
        return "(POST) Project ID:" + id;
    }


    //this one only works in postman because it needs the details of extra inputting
    //you create a request, change it to post, paste url as below
    // enter extra details under body, then x-www-form-urlencoded
    //then send and should see result
    @PostMapping("/project1/{id}")
    public String projectUpdate(@PathVariable int id, @RequestBody String extra){
        return "(POST) Project ID:" + id + "<br/>Extra: " + extra;
    }

    @DeleteMapping("/project/{id}")
    public String index(@PathVariable int id){
        return "(DELETE) Project ID:" + id;
    }
}
