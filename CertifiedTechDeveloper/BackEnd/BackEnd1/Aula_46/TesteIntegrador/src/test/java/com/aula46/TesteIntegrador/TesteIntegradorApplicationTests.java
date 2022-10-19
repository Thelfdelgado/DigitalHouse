package com.aula46.TesteIntegrador;

import com.aula46.TesteIntegrador.controller.LinguagemController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)// Anotacao para habilitar recursos do spring
@WebMvcTest(LinguagemController.class)// Indica onde comeca o test
class TesteIntegradorApplicationTests {

	@Autowired
	private MockMvc mockMvc;// Recurso para permitir acessar URL

	@Test
	void buscarTodasLinguagensAPI() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens")
				.accept(MediaType.APPLICATION_JSON))// Aceita arquivos JSON
				.andDo(MockMvcResultHandlers.print())// Printa no console
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	void buscarLinguagemPorTipo() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens/{tipo}", "Java")
						.accept(MediaType.APPLICATION_JSON))// Aceita arquivos JSON
				.andDo(MockMvcResultHandlers.print())// Printa no console
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	void buscarLinguagensNaoExistentesPorTipoAPI() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens/{tipo}","Linguagem C")
						.accept(MediaType.APPLICATION_JSON))// Aceita arquivos JSON
				.andDo(MockMvcResultHandlers.print())// Printa no console
				.andExpect(MockMvcResultMatchers.status().isNotFound());
	}

	@Test
	void contextLoads() {
	}

}
