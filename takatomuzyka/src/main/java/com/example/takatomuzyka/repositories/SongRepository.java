package com.example.takatomuzyka.repositories;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<com.example.takatomuzyka.model.Song, Long> {
}