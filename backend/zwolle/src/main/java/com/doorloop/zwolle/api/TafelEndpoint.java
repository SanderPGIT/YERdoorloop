package com.doorloop.zwolle.api;

import com.doorloop.zwolle.domein.Tafel;
import com.doorloop.zwolle.persistence.TafelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TafelEndpoint {
    @Autowired
    TafelService tafelService;

    @GetMapping("/alletafels")
    public Iterable<Tafel> geefTafels(){
        return tafelService.geefMeAlleTafels();
    }

    @PostMapping("/nieuwetafel")
    public Tafel extratafel(Tafel tafel){
        Tafel result = tafelService.save(tafel);
        return result;
    }
}
