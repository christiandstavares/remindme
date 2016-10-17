package com.rememberme.lembrete;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.rememberme.usuario.Usuario;
@Entity
public class Lembrete implements Serializable{
	@Id
	@GeneratedValue
	private Integer lembrete;
	private String descricao;
	private String loginLembrete;
	private String senhaLembrete;
	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JoinColumn(nullable = false)
	private Usuario usuario;
	public Integer getLembrete() {
		return lembrete;
	}
	public void setLembrete(Integer lembrete) {
		this.lembrete = lembrete;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLoginLembrete() {
		return loginLembrete;
	}
	public void setLoginLembrete(String loginLembrete) {
		this.loginLembrete = loginLembrete;
	}
	public String getSenhaLembrete() {
		return senhaLembrete;
	}
	public void setSenhaLembrete(String senhaLembrete) {
		this.senhaLembrete = senhaLembrete;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((lembrete == null) ? 0 : lembrete.hashCode());
		result = prime * result + ((loginLembrete == null) ? 0 : loginLembrete.hashCode());
		result = prime * result + ((senhaLembrete == null) ? 0 : senhaLembrete.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lembrete other = (Lembrete) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (lembrete == null) {
			if (other.lembrete != null)
				return false;
		} else if (!lembrete.equals(other.lembrete))
			return false;
		if (loginLembrete == null) {
			if (other.loginLembrete != null)
				return false;
		} else if (!loginLembrete.equals(other.loginLembrete))
			return false;
		if (senhaLembrete == null) {
			if (other.senhaLembrete != null)
				return false;
		} else if (!senhaLembrete.equals(other.senhaLembrete))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
}
