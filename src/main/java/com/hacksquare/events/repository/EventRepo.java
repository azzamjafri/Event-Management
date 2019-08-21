package com.hacksquare.events.repository;


import com.hacksquare.events.model.Events;
import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepo extends JpaRepository<Events, Integer>{

    Events findById(int id);

    List<Events> findAll();

//     Events findById(@Param(value = "id")int userId);
}