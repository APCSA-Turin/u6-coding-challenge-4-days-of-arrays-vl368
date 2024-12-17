package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name) {
        if (name.equals("") || name.equals(null)) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return elf_names[(int) ((Math.random() * 5))] + name;  
    }
}