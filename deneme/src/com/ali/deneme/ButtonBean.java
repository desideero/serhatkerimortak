package com.ali.deneme;

import java.io.Serializable;

//import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.faces.bean.ViewScoped;
//import java.util.UUID;

@ManagedBean
@SessionScoped
public class ButtonBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -942987062301500605L;
	
	/**
	 * my ButtonBean class file - Ali Kerim Erkan
	 */
	
	private Integer number = 1;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
