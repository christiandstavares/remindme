package com.rememberme.util;

import com.rememberme.lembrete.LembreteDAO;
import com.rememberme.lembrete.LembreteDAOHibernate;
import com.rememberme.usuario.UsuarioDAO;
import com.rememberme.usuario.UsuarioDAOHibernate;

public class DAOFactory {
	public static UsuarioDAO criarUsuarioDAO(){
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
	public static LembreteDAO criarLembreteDAO(){
		LembreteDAOHibernate lembreteDAO = new LembreteDAOHibernate();
		lembreteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return lembreteDAO;
	}
}
