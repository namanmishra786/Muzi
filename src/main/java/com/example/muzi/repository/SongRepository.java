package com.example.muzi.repository;

import com.example.muzi.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    // Custom query method to find songs by group ID
    List<Song> findByGroupId(Long groupId);
}
