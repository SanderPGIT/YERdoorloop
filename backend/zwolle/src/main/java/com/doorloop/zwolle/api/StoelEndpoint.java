package com.doorloop.zwolle.api;

import com.doorloop.zwolle.domein.Stoel;
import com.doorloop.zwolle.persistence.StoelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class StoelEndpoint {
    @Autowired
    StoelService stoelService;

    @GetMapping("/allestoelen")
    public Iterable<Stoel> geefstoelen(){
        return stoelService.geefMeAlleStoelen();
    }

    @PostMapping("/nieuwestoel")
    public Stoel extrastoel(@RequestBody Stoel stoel){
        Stoel result = stoelService.save(stoel);
        return result;
    }

}
