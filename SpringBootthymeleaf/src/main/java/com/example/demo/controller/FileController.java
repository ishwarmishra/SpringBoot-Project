package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/files")

public class FileController {
	
	@GetMapping("/add")
	public String fileForm() {
		return "fileForm";
	}
	@PostMapping("/add")
	public String fileUpload(@RequestParam("image") MultipartFile file) throws IOException {
		if(!file.isEmpty()) {
		String destination =new ClassPathResource("/static/images/").getFile().getAbsolutePath();
		Files.copy(file.getInputStream(),Paths.get(destination+"/"+file.getOriginalFilename()));
		
		}
		return "fileForm";
	}

}
