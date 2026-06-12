package com.lucileudo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucileudo.workshopmongo.domain.Post;
import com.lucileudo.workshopmongo.repository.PostRepository;
import com.lucileudo.workshopmongo.services.excepton.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public List<Post> findAll() {
		return repo.findAll();
	}
}