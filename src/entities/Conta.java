package entities;

import model.exceptions.DomainException;

public class Conta {
	
	Integer numero;
	String usuario;
	Double saldo;
	Double limite;
			
	public Conta() {
	}

	public Conta(Integer numero, String usuario, Double saldo, Double limite) {
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Double getSaldo() {
		return saldo;
	}


	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void deposito(Double quantidade) {
		saldo += quantidade;
		
	}
	
	public void saque(Double quantidade) {
		if (limite < quantidade) {
			throw new DomainException("Limite excedido para saque");
		}
		if (saldo < quantidade) {
			throw new DomainException("Saldo insuficiente");
		} 
		saldo -= quantidade;

	}
	

}
