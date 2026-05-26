package com.lucileudo.workshopmongo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.lucileudo.workshopmongo.domain.User;
import com.lucileudo.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> findAll() {
        List<User> list1 = repo.findAll();
        List<User> list2 = mongoTemplate.findAll(User.class);
        System.out.println("### VIA REPOSITORY: " + list1.size());
        System.out.println("### VIA MONGOTEMPLATE: " + list2.size());
        return list2;
    }
}