package com.idat.pe.EFVICTORCHUMACEROPIZERRIA.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.pe.EFVICTORCHUMACEROPIZERRIA.entity.Pizerria;
import com.idat.pe.EFVICTORCHUMACEROPIZERRIA.service.PizerriaService;

@RestController
@RequestMapping("/exa/pizerria")
public class PizerriaController {

	@Autowired
	private PizerriaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardarPizerria(@RequestBody Pizerria pizerria) {
		service.guardarPizerria(pizerria);
	}
	@GetMapping("/listar")
	public @ResponseBody List<Pizerria> listarPizerria(){
		return service.listarPizerria();
	}
}
