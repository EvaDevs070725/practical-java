package com.evaitcs.content.repository;

import com.evaitcs.content.entity.User;
import com.evaitcs.content.utils.CsvReader;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CsvUserRepository implements UserRepository {

    private static final String CSV_FILE_NAME = "users.csv";

    private final CsvReader reader;

    public CsvUserRepository() {

        this.reader = new CsvReader();
    }

    @Override
    public List<User> findAll() {
        List<String> data = reader.read(CSV_FILE_NAME);
        return data.stream()
                .map(userString -> {
                    String[] split = userString.split(",");
                    long id = Long.parseLong(split[0]);
                    String name = split[1];
                    return new User(id, name);
                }).collect(Collectors.toList());
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
