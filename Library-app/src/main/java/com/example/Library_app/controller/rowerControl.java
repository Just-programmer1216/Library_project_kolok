package com.example.Library_app.controller;

import com.example.Library_app.model.Rower;
import com.example.Library_app.repository.RowerRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rowers")
public class rowerControl {
    private final RowerRep rowerRep;


    @Autowired
    public rowerControl(RowerRep rowerRep) {
        this.rowerRep = rowerRep;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rower> getRower(@PathVariable("id") Long id) {
        Optional<Rower> rowers = rowerRep.findById(id);
        if (rowers.isPresent()) {
            return ResponseEntity.ok(rowers.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
