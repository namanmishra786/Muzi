package com.example.muzi.controller;

import com.example.muzi.entity.Song;
import com.example.muzi.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups/{groupId}/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public List<Song> getSongs(@PathVariable Long groupId) {
        return songService.getSongsByGroup(groupId);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping
    public Song addSong(@PathVariable Long groupId, @RequestBody Song song) { // ✅ Pass groupId
        return songService.addSong(groupId, song); // ✅ Fix argument mismatch
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/{songId}/vote")
    public Song voteSong(@PathVariable Long songId, @RequestParam boolean upvote) {
        return songService.voteSong(songId, upvote);
    }
}
