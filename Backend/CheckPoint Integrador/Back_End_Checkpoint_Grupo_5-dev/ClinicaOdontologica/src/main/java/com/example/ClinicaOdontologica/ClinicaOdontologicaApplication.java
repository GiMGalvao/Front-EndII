package com.example.ClinicaOdontologica;
import com.example.ClinicaOdontologica.entity.dto.DentistaDTO;
import com.example.ClinicaOdontologica.enums.Roles;
<<<<<<< HEAD
import com.example.ClinicaOdontologica.repository.impl.DentistaServiceImpl;
=======
import com.example.ClinicaOdontologica.service.impl.DentistaServiceImpl;
import com.example.ClinicaOdontologica.service.impl.EnderecoServiceImpl;
>>>>>>> 195489bf3aa125d384774c08dc0f9b16a9bce7a4
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
public class ClinicaOdontologicaApplication implements CommandLineRunner {
	@Autowired
	private DentistaServiceImpl dentistaService;

	@Override
	public void run(String... args) throws Exception {
		DentistaDTO d = new
				DentistaDTO("Tawan", "Silva",
				"1231-5", 123, "tawan@gmail.com", "12345678", Roles.ADMIN);
		dentistaService.cadastrar(d);
	}

	public static void main(String[] args) {
		SpringApplication.run(ClinicaOdontologicaApplication.class, args);
	}

}
