package Model;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Getter
@Setter
@Named
@RequestScoped	
@ManagedBean
public class Usuario implements Serializable {
	



	private static final long serialVersionUID = 1L;

	@NonNull
	
	private String nome;
		
	private Date dataNascimento;
	
	@NonNull
	private String email;
	
	
	@NonNull
	
	private String login;
	
	@NonNull
	
	private String senha;
	
	@NonNull
	private String papel;
}