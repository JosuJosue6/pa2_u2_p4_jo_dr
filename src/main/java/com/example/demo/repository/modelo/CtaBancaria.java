package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "cuentabancaria")
@Entity
public class CtaBancaria {
		
	@GeneratedValue(generator = "seq_ctab",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_ctab", sequenceName = "seq_ctab",allocationSize = 1)
	@Id
	@Column(name = "cta_id")
	private Integer id;
	
	@Column(name = "cta.numero")
	private String numero;
	
	@Column(name = "cta.tipo")
	private String tipo;
	
	@Column(name = "cta.fechaapertura")
	private LocalDate fechaApertura;
	
	@Column(name = "cta.saldo")
	private BigDecimal saldo;
	
	@Column(name = "cta.cedulapropietario")
	private String cedulaPropietario;
	
	//SET Y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedulaPropietario() {
		return cedulaPropietario;
	}
	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	@Override
	public String toString() {
		return "CtaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura
				+ ", saldo=" + saldo + ", cedulaPropietario=" + cedulaPropietario + "]";
	}
	
	

}
