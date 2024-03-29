package com.example.apipetstore.utils;

import com.example.apipetstore.models.Pet;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFiles {

    public static final String PATH_PET_REQUEST= "src/test/resources/data/request_pet.json";

    public static Pet getPetTemplate(){
        Pet pet = null;
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(PATH_PET_REQUEST));
            pet = gson.fromJson(reader,Pet.class);
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return pet;
    }


}
