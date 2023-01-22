package io.nology.pokemonHighScore.HighScore;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class HighScoreDTO {
	
	@NotBlank
	private String name;
	@NotNull
	private Integer score;

	public HighScoreDTO(String name, Integer score) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	

}
