package io.nology.pokemonHighScore.HighScore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/highscore")
public class HighScoreContoller {
	
	@Autowired
	private HighScoreService service;
	
	@CrossOrigin
	@PostMapping
	public ResponseEntity<HighScore> create(@RequestBody HighScoreDTO data) {
	HighScore newHighScore = this.service.create(data);
	return new ResponseEntity<>(newHighScore, HttpStatus.CREATED);
	}

	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<HighScore>> getAll() {
	List<HighScore> allHighScores = this.service.getAll();
	
	return new ResponseEntity<>(allHighScores, HttpStatus.FOUND);
	}

}
