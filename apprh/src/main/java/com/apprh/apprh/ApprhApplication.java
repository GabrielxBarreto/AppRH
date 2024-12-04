package com.apprh.apprh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.apprh.apprh.Models.Colaborador;


import com.apprh.apprh.Service.ColaboradorService;


@SpringBootApplication(scanBasePackages = "com.apprh")//desativa configurações padrão do spring
public class ApprhApplication implements CommandLineRunner {
	/*O CommandLineRunner é uma interface do Spring Boot que permite executar código logo após a inicialização da aplicação.
O método run será chamado automaticamente após a aplicação ser iniciada, o que permite que você execute a lógica de salvar o candidato. */
	@Autowired
	private  ColaboradorService cs;
	public static void main(String[] args) {
		SpringApplication.run(ApprhApplication.class, args);
	}

	public void run(String... args) throws Exception {
        Colaborador c = new Colaborador();
        c.setNome("JJahjgf");
        c.setCpf("111781918gre983");
        
        // Agora o serviço é chamado corretamente pelo Spring
        cs.salvarColaborador(c);
    }

}
