package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domein.Stoel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class StoelService{
    @Autowired
    StoelRepository stoelRepository;

    public Iterable<Stoel> geefMeAlleStoelen(){
        return stoelRepository.findAll();
    }

    public Stoel save(Stoel stoel){
        return stoelRepository.save(stoel);
    }
}



