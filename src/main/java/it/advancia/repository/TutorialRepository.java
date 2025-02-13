package it.advancia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.advancia.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
	  List<Tutorial> findByIsPublished(boolean isPublished);
	  List<Tutorial> findByTitleContaining(String title);
}