package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domein.Stoel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StoelRepository  extends CrudRepository<Stoel,Long> {

}
