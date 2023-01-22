package io.nology.pokemonHighScore.HighScore;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HighScoreService {

	@Autowired
	private HighScoreRepository repository;
	
	public HighScore create(HighScoreDTO data) {
		HighScore newHighScore = new HighScore(data.getName(), data.getScore());
		
		this.repository.save(newHighScore);
		return newHighScore;
	}

	public List<HighScore> getAll() {
		return this.repository.findAll().stream().sorted((a,b) -> b.getScore().compareTo(a.getScore())).collect(Collectors.toList());
	}


	
}
