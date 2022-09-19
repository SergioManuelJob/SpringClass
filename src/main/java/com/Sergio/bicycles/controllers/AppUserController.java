package com.Sergio.bicycles.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sergio.bicycles.entity.model.AppUser;
import com.Sergio.bicycles.entity.service.IAppUserService;

@RestController
public class AppUserController {
	
	@Autowired
	IAppUserService appUserService;
	
	@GetMapping("/appuser")
	public List< AppUser > getAll() {
		return appUserService.getAll();
	}
	
	public AppUser getOne(long id) {
		return appUserService.getOne(id);
	}
	
}
