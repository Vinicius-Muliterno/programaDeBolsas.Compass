package br.com.compass.api.estados.controller.form;

import java.time.LocalDate;
import java.time.Period;

import br.com.compass.api.estados.config.validacao.MismatchInformationException;
import br.com.compass.api.estados.entities.Estado;
import br.com.compass.api.estados.entities.Regioes;

public class EstadoForm {

	private String nome;
	private Regioes regiao;
	private int populacao;
	private String capital;
	private double area;
	private LocalDate dataDeFundacao;
	private int tempoDesdeFundacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Regioes getRegiao() {
		return regiao;
	}

	public void setRegiao(Regioes regiao) {
		this.regiao = regiao;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public LocalDate getDataDeFundacao() {
		return dataDeFundacao;
	}

	public void setDataDeFundacao(LocalDate dataDeFundacao) {
		this.dataDeFundacao = dataDeFundacao;
	}

	public int getTempoDesdeFundacao() {
		return tempoDesdeFundacao;
	}

	public void setTempoDesdeFundacao(int tempoDesdeFundacao) {
		this.tempoDesdeFundacao = tempoDesdeFundacao;
	}

	public Estado converter() {
		if (Period.between(this.dataDeFundacao, LocalDate.now()).getYears() == this.tempoDesdeFundacao) {
			return new Estado(nome, regiao, populacao, capital, area, dataDeFundacao, tempoDesdeFundacao);
		} else {
			throw new MismatchInformationException();
		}
	}
}
