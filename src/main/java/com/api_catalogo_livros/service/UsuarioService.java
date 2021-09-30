package com.api_catalogo_livros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api_catalogo_livros.model.Usuario;
import com.api_catalogo_livros.repository.UsuarioRepository;

public class UsuarioService {
	

	private UsuarioRepository usuario;

	public UsuarioService(UsuarioRepository usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> findAll() {
		return usuario.findAll();
	}

	public <S extends Usuario> S saveAndFlush(S entity) {

		return usuario.saveAndFlush(entity);
	}

	public Usuario getById(Long id) {
		return usuario.getById(id);
	}

	public Usuario save(Usuario entity) {
		usuario.save(entity);
		Long id = entity.getId();
		return usuario.getById(id);
		
	}
	
	public void deleteById(Long id) {
		usuario.deleteById(id);
	}
	
	

}
