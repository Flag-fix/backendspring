package br.com.flag.application.dtos;

import br.com.flag.application.domain.Usuario;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class UsuarioDTO {

	private Integer id;
	private String telefone;
	@NotEmpty(message = "O Campo nome é Obrigatório")
	@Length(min= 3, max=200,message = "Máximo de Caracteres é 200")
	private String nome;
	@NotEmpty(message = "O Campo nome é Obrigatório")
	@Length(min= 11, max=11,message = "Máximo de Caracteres é 11")
	private String cpf;

	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(Usuario obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		this.telefone = obj.getTelefone();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
