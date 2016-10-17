package com.rememberme.lembrete;

import java.util.List;

import com.rememberme.usuario.Usuario;
import com.rememberme.util.DAOFactory;

public class LembreteRN {
	private LembreteDAO lembreteDAO;
	public LembreteRN(){
		this.lembreteDAO = DAOFactory.criarLembreteDAO();
	}
	public void salvar(Lembrete lembrete){
		this.lembreteDAO.salvar(lembrete);
	}
	public void excluir(Lembrete lembrete){
		this.lembreteDAO.excluir(lembrete);
	}
	public Lembrete carregar(Integer lembrete){
		return this.lembreteDAO.carregar(lembrete);
	}
	public List<Lembrete> listar(Usuario usuario){
		return this.lembreteDAO.listar(usuario);
	}
}
