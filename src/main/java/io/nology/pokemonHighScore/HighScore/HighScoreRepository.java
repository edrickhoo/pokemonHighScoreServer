package io.nology.pokemonHighScore.HighScore;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HighScoreRepository extends JpaRepository<HighScore, Long> {

}
