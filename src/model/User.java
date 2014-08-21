package model;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Named
@SessionScoped
public class User implements Serializable {
	
	private static final long serialVersionUID = 6185173587860633317L;

	@NonNull
	@Size(max = 10)
	private String login;
	
	@NonNull
	@Size(max = 20)
	private String password;
	
	@NonNull
	private String role;
}
