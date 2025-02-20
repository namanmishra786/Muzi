package com.example.muzi.controller;

import com.example.muzi.entity.Group;
import com.example.muzi.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping
    public Group addGroup(@RequestBody Group group) {
        return groupService.addGroup(group);
    }
}
