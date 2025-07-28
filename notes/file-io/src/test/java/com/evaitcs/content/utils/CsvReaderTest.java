package com.evaitcs.content.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CsvReaderTest {

    private CsvReader csvReader;

    @Test
    void readFile() {
        String file = "users.csv";

        csvReader = new CsvReader();

        List<String> read = csvReader.read(file);


        assertEquals(read.size(), 6);
    }


}