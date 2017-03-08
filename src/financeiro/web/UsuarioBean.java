package financeiro.web;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class UsuarioBean {
	private String nome;
	private String email;
	private String senha;
	private String confirmarSenha;

	public UsuarioBean() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}

	public String operação() {
		return "resultado";
	}

	public String novo() {//
		return "usuario";
	}

	public String salvar() {// este método verifica se asenha foi digitada
							// corretamente
		// allé de salvar o usuario no banco
		FacesContext context = FacesContext.getCurrentInstance();
		if (this.senha.equalsIgnoreCase(this.confirmarSenha)) {
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha confirmada com sucesso", ""));
		
		}else{
			context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha incorreta",""));
		}

		return "sucesso";
	}

}
