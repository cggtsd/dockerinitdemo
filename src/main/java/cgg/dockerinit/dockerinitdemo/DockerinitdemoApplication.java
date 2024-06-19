package cgg.dockerinit.dockerinitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerinitdemoApplication {

	@GetMapping("/message")
	public String message() {
		return "Testing Docker Init...";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerinitdemoApplication.class, args);
	}

}
