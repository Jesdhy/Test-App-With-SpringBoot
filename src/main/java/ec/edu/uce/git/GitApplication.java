package ec.edu.uce.git;

import ec.edu.uce.git.srv.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
		Test test = new Test();
		test.saludo();
	}
}
