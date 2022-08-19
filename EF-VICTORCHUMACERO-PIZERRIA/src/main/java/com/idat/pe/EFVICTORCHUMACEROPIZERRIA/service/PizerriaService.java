package com.idat.pe.EFVICTORCHUMACEROPIZERRIA.service;

import java.util.List;

import com.idat.pe.EFVICTORCHUMACEROPIZERRIA.entity.Pizerria;

public interface PizerriaService {
	public List<Pizerria> listarPizerria();
	public void guardarPizerria(Pizerria pizerria);

}
