package com.apprh.apprh;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.apprh.apprh.Models.Colaborador;
import com.apprh.apprh.Models.Tarefas;
import com.apprh.apprh.Service.ColaboradorService;
import com.apprh.apprh.Service.TarefasService;


@SpringBootApplication(scanBasePackages = "com.apprh")//desativa configurações padrão do spring
public class ApprhApplication implements CommandLineRunner {
	/*O CommandLineRunner é uma interface do Spring Boot que permite executar código logo após a inicialização da aplicação.
O método run será chamado automaticamente após a aplicação ser iniciada, o que permite que você execute a lógica de salvar o candidato. */
	@Autowired
	private  ColaboradorService cs;
	@Autowired
	private  TarefasService tr;
	public static void main(String[] args) {
		SpringApplication.run(ApprhApplication.class, args);
	}

	public void run(String... args) throws Exception {

		// Testando as 2 classes pedidas
        Colaborador c = new Colaborador();
        c.setNome("Vinicius");
        c.setCpf("244356666");// o cpf deve ser diferente comando : @column (unique = true)
		c.setCargo("gestor de equipe");   
		c.setSalario(18);  
		Date data = new Date();
		c.setDataDeContratacao(data);
		 // Agora o serviço é chamado corretamente pelo Spring
		 Tarefas t =  new Tarefas();
		 t.setNomeTarefa("Fazer o trabalho");
		 t.setDescricao("os produtos estão alocados");
		t.setDatainicio(data);
		 tr.salvarTarefa(t);
        cs.salvarColaborador(c);
    }

}
