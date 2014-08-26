package modelo;
import java.io.Serializable;
import lombok.*;

public class User implements Serializable {
@Id
@GeneratedValue
private int id;
private String Nome;
private String Email;
private String Login;
private String Senha;
private String Data_Nascimento;

public void Usuario() {
}
 
public Usuario(int id, String Nome, String Email, String Login, String Senha, String Data_Nascimento)
this.id = id;
this.Nome = Nome;
this.Email = Email;
this.Login = Login;
this.Senha = Senha;
this.Data_Nascimento = Data_Nascimento;
}
	
}
