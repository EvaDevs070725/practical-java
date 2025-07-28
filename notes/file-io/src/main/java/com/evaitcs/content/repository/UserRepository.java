package com.evaitcs.content.repository;

import com.evaitcs.content.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findByName(String name);
    void save(User user);
    void delete(long id);
}
