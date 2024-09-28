package pe.edu.cibertec.T1LandaP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class T1LandaP1Application {

	public static void main(String[] args) {
		SpringApplication.run(T1LandaP1Application.class, args);
	}

}
