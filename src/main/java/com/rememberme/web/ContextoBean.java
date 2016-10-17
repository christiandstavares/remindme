package com.rememberme.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="contextoBean")
@SessionScoped
public class ContextoBean implements Serializable{
	
	private boolean renderizado;
	
	public boolean isRenderizado() {
		return renderizado;
	}
	public void setRenderizado(boolean renderizado) {
		this.renderizado = renderizado;
	}
}
