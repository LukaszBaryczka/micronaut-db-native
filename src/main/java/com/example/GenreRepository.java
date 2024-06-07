package com.example;

import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.Optional;

public interface GenreRepository {

    Optional<Genre> findById(long id);

    Genre save(@NotBlank String name);

    Genre saveWithException(@NotBlank String name);

    void deleteById(long id);

    List<Genre> findAll();

    int update(long id, @NotBlank String name);
}
