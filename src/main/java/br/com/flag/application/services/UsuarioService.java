package br.com.flag.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flag.application.domain.Usuario;
import br.com.flag.application.dtos.UsuarioDTO;
import br.com.flag.application.repositories.UsuarioRepository;
import br.com.flag.application.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario findById(Integer id){
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não Encontrado!!! Id: "+id));
	}
	
	public List<Usuario> findAll(){
		return repository.findAll();
	}
	
	public Usuario create(Usuario obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Usuario update(Integer id, UsuarioDTO objDTO) {
		Usuario obj = findById(id);
		obj.setNome(objDTO.getNome());
		obj.setTelefone(objDTO.getTelefone());
		obj.setCpf(objDTO.getCpf());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}

}
