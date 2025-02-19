package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
//	@GetMapping(path="/", produces = "text/xml")
	@GetMapping(path="/", produces = "text/html")
//	@GetMapping(path="/", produces = "text/plain")
	public String great() {
		return "<h1> Welcome to Rest Api Application Get</h1>";
	}
	@PostMapping(path="/", produces = "text/plain")
	public String greatPost() {
		return "<h1> Welcome to Rest Api Application Post</h1>";
	}
	@PutMapping(path="/", produces = "text/plain")
	public String greatPut() {
		return "<h1> Welcome to Rest Api Application Put</h1>";
	}
	@PatchMapping(path="/", produces = "text/plain")
	public String greatPatch() {
		return "<h1> Welcome to Rest Api Application Patch</h1>";
	}
	@DeleteMapping(path="/", produces = "text/plain")
	public String greatDelete() {
		return "<h1> Welcome to Rest Api Application Delete</h1>";
	}
}
