package com.yugioh.fm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yugioh.fm.domain.Deck;
import com.yugioh.fm.domain.GameCharacter;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Integer> {

	@Transactional(readOnly = true)
	public Deck findByCharacter(GameCharacter character);
}