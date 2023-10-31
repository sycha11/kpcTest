package com.ssafy.kpc.model.repository;

import com.ssafy.kpc.model.dto.UserDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(UserDto userDto){
        em.persist(userDto);
    }
}
