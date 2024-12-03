package com.apprh.apprh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apprh.apprh.Models.Candidato;
import com.apprh.apprh.Service.CandidatoService;


@SpringBootApplication(scanBasePackages = "com.apprh")//desativa configurações padrão do spring
public class AppRhApplication implements CommandLineRunner {
	/*O CommandLineRunner é uma interface do Spring Boot que permite executar código logo após a inicialização da aplicação.
O método run será chamado automaticamente após a aplicação ser iniciada, o que permite que você execute a lógica de salvar o candidato. */
	@Autowired
	private  CandidatoService cs;
	public static void main(String[] args) {
		SpringApplication.run(AppRhApplication.class, args);
	}

	public void run(String... args) throws Exception {
        Candidato c = new Candidato();
        c.setEmail("teste@gmail.com");
        c.setNomeCandidato("Kiuru");
        c.setRg("77-676372");// como o rg é unique vc precisa mudar  o rg da daqui

        // Agora o serviço é chamado corretamente pelo Spring
        cs.salvarCandidato(c);
    }

}
