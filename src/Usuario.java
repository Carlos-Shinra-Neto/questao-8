
public class Usuario {

	private String login;
	private String senha;

	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean validaSenha(String senha) {
		return this.senha.equals(senha);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			if (obj instanceof String)
				return login.equalsIgnoreCase((String) obj);
			return false;
		}
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equalsIgnoreCase(other.login))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return login;
	}
}