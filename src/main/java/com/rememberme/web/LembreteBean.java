package com.rememberme.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.rememberme.lembrete.Lembrete;
import com.rememberme.lembrete.LembreteRN;
import com.rememberme.usuario.Usuario;
import com.rememberme.usuario.UsuarioRN;

@ManagedBean(name="lembreteBean")
@RequestScoped
public class LembreteBean {
	
	private Lembrete selecionado = new Lembrete();
	private List<Lembrete> lista = null;
	private Usuario usuarioLogado = this.getUsuarioLogado();
	
	public Lembrete getSelecionado() {
		return selecionado;
	}
	public void setSelecionado(Lembrete selecionado) {
		this.selecionado = selecionado;
	}
	public List<Lembrete> getLista() {
		if(this.lista == null){
			LembreteRN lembreteRN = new LembreteRN();
			this.lista = lembreteRN.listar(this.getUsuarioLogado());
		}
		return lista;
	}
	public void setLista(List<Lembrete> lista) {
		this.lista = lista;
	}
	public Usuario getUsuarioLogado() {
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext external = context.getExternalContext();
		String email = external.getRemoteUser();
		UsuarioRN usuarioRN = new UsuarioRN();
		this.usuarioLogado = usuarioRN.buscarPorEmail(email);
		return usuarioLogado;
	}
	public String salvar(){
		this.selecionado.setUsuario(this.getUsuarioLogado());
		if(selecionado.getDescricao().equals("")){
			selecionado.setDescricao("-----");
		}
		LembreteRN lembreteRN = new LembreteRN();
		lembreteRN.salvar(this.selecionado);
		this.selecionado = new Lembrete();
		this.lista = null;
		return null;
	}
	public String excluir(){
		LembreteRN lembreteRN = new LembreteRN();
		lembreteRN.excluir(this.selecionado);
		this.selecionado = new Lembrete();
		this.lista = null;
		return null;
	}
}
