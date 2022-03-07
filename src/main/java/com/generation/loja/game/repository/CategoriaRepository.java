package com.generation.loja.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.loja.game.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}