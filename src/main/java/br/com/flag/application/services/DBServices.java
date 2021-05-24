package br.com.flag.application.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.flag.application.domain.Usuario;
import br.com.flag.application.repositories.UsuarioRepository;

@Service
public class DBServices {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void instanceBD(){
		Usuario user =  new Usuario(null, "Isac","06497033912", "4499804-7761");
		Usuario user1 =  new Usuario(null, "Raul", "06497033912","4499804-7761");
		Usuario user2 =  new Usuario(null, "José", "06497033912","4499804-7761");
		Usuario user3 =  new Usuario(null, "Suzana","06497033912", "4499804-7761");
		
		this.usuarioRepository.saveAll(Arrays.asList(user,user1,user2,user3));
	}

}
