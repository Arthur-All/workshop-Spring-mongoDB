package com.arhur.workshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arhur.workshop.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User Maria = new User("1", "Maria Mendonsa", "MariaMendonsaContareli@gmail.com");
		User Alek = new User("2","Alekinho", "Alekinho@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(Maria,Alek));
		return ResponseEntity.ok().body(list);
	}
}
