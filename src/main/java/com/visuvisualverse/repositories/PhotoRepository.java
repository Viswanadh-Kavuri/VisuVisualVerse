package com.visuvisualverse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.visuvisualverse.entities.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
