package com.evaitcs.content.repository;

import com.evaitcs.content.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepository {

    private final Map<Long, User> userMap = new HashMap<>();

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(long id) {

    }
}
