package com.example.muzi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;
    private String youtubeUrl;
    private int upvotes;
    private int downvotes;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    // Default Constructor
    public Song() {}

    // Parameterized Constructor
    public Song(String title, String artist, String youtubeUrl, Group group) {
        this.title = title;
        this.artist = artist;
        this.youtubeUrl = youtubeUrl;
        this.group = group;
        this.upvotes = 0;
        this.downvotes = 0;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    // Method to calculate net votes
    public int getVoteCount() {
        return upvotes - downvotes;
    }
}
