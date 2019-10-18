package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domein.Tafel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TafelRepository extends CrudRepository<Tafel,Long> {

}
