package com.visuvisualverse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visuvisualverse.entities.Photo;
import com.visuvisualverse.repositories.PhotoRepository;

@RestController
public class Photocontroller {
	@Autowired
	PhotoRepository photorepo;
	
	
	@GetMapping("/photos")
	public List<Photo> getPhotos() {
		return photorepo.findAll();
	}

}
