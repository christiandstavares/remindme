package com.rememberme.lembrete;

import java.util.List;

import com.rememberme.usuario.Usuario;

public interface LembreteDAO {
	
	public void salvar(Lembrete lembrete);
	public void excluir(Lembrete lembrete);
	public Lembrete carregar(Integer lembrete);
	public List<Lembrete> listar(Usuario usuario);
}
