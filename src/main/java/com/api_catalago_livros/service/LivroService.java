package com.api_catalago_livros.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_catalago_livros.repository.LivroRepository;
import com.api_catalago_livros.model.*;

@Service
@Transactional
public class LivroService {
	
	@Autowired
	private LivroRepository livro;
	
	public List<Livro> findAll() {
		return livro.findAll();
	}

	public <S extends Livro> S saveAndFlush(S entity) {

		return livro.saveAndFlush(entity);
	}

	public Livro getById(Long id) {
		return livro.getById(id);
	}

	public Livro save(Livro entity) {
		livro.save(entity);
		Long id = entity.getId();
		return livro.getById(id);
		
	}
	
	public void deleteById(Long id) {
		livro.deleteById(id);
	}
	
	

}