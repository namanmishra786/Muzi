package com.example.muzi.service;

import com.example.muzi.entity.Group;
import com.example.muzi.entity.Song;
import com.example.muzi.repository.GroupRepository;
import com.example.muzi.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private GroupRepository groupRepository;

    public List<Song> getSongsByGroup(Long groupId) {
        return songRepository.findByGroupId(groupId);
    }

    public Song addSong(Long groupId, Song song) { // ✅ Ensure method signature matches
        Group group = groupRepository.findById(groupId)
                .orElseThrow(() -> new RuntimeException("Group not found"));
        song.setGroup(group);
        return songRepository.save(song);
    }

    public Song voteSong(Long songId, boolean upvote) {
        Song song = songRepository.findById(songId)
                .orElseThrow(() -> new RuntimeException("Song not found"));

        if (upvote) {
            song.setUpvotes(song.getUpvotes() + 1);
        } else {
            song.setDownvotes(song.getDownvotes() + 1);
        }

        return songRepository.save(song);
    }
}
