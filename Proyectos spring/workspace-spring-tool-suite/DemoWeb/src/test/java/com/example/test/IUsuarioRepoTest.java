package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.model.Usuario;
import com.example.repo.IUsuarioRepo;

@SpringBootTest
class IUsuarioRepoTest {
	
	@Autowired
	IUsuarioRepo usuRepo;
	
	@Autowired
	BCryptPasswordEncoder encoder;

	
	@Test
	void testAgregar() {
		Usuario usu = new Usuario(0, encoder.encode("admin"), "admin");
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals(usu.getClave(), usuRetorno.getClave());
	}
	

}
