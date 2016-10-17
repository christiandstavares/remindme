package com.rememberme.lembrete;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.rememberme.usuario.Usuario;

public class LembreteDAOHibernate implements LembreteDAO{
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Lembrete lembrete) {
		this.session.saveOrUpdate(lembrete);
	}

	@Override
	public void excluir(Lembrete lembrete) {
		this.session.delete(lembrete);
	}

	@Override
	public Lembrete carregar(Integer lembrete) {
		return (Lembrete) this.session.get(Lembrete.class, lembrete);
	}

	@Override
	public List<Lembrete> listar(Usuario usuario) {
		Criteria criteria = this.session.createCriteria(Lembrete.class);
		criteria.add(Restrictions.eq("usuario", usuario));
		return criteria.list();
	}

}
