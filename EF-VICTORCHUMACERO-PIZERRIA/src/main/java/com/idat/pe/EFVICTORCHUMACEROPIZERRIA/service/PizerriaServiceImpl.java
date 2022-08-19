package com.idat.pe.EFVICTORCHUMACEROPIZERRIA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.EFVICTORCHUMACEROPIZERRIA.entity.Pizerria;
import com.idat.pe.EFVICTORCHUMACEROPIZERRIA.repository.PizerriaRepository;

@Service
public class PizerriaServiceImpl implements PizerriaService {

	@Autowired
	private PizerriaRepository repository;
	
	@Override
	public List<Pizerria> listarPizerria() {
		return repository.findAll();
	}
	@Override
	public void guardarPizerria(Pizerria pizerria) {
		repository.save(pizerria);
	}
}
