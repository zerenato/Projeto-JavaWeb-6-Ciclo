package modelo;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.Date;

@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Named
@SessionScoped
public class Usuario implements Serializable {
	private static final long serialVersionUID = 6185173587860633318L;

	@NonNull
	@Size(max = 10, message = "{login.tamanho.maximo}")
	private String login;
	
	@NonNull
	@Size(max = 20, message = "{senha.tamanho.maximo}")
	private String senha;
	
	@NonNull
	private String papel;
	
	@NonNull
	private String nome;
	
	@NonNull
	private String email;
	
	@NonNull
	private Date dataNasc;
}