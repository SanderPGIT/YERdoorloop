package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domein.Tafel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TafelService {
    @Autowired
    TafelRepository tafelRepository;

    public Iterable<Tafel> geefMeAlleTafels(){
        return tafelRepository.findAll();

    }

    public Tafel save(Tafel tafel){
        return tafelRepository.save(tafel);
    }
}
