package com.iamsireesh.moviecatalogservice.rest;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamsireesh.moviecatalogservice.modals.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatalogService {

	@GetMapping("/list")
	public List<CatalogItem> listMovies() {
		return Collections.singletonList(new CatalogItem("Bahubali", "Great Indian Movie", 4));

	}

}
