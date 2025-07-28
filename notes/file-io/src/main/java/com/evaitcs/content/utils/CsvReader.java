package com.evaitcs.content.utils;

import com.evaitcs.content.entity.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader implements Reader<List<String>> {

    public List<String> read(String filepath) {
        List<String> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            boolean hasKeys = false;
            String[] keys; // have keys been set yet

            while ((line = reader.readLine())  != null) {
                if (!hasKeys) {
                    keys = line.split(",");
                    hasKeys = true;
                    continue;
                }

                data.add(line);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return data;
    }

    @Override
    public void write(List<String> strings) {

    }

    @Override
    public List<String> map() {
        return List.of();
    }

}
