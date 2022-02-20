package Questao9;

import java.sql.Date;

public class Produtos {
	private int Id;
	private String nome;
	private String descricao;
	private double valor;
	private double desconto;
	private Date dataInicio;
		
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	private void menu() {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - para INSERIR uma nova oferta");
		System.out.println("2 - para ATUALIZAR uma nova oferta");
		System.out.println("3 - para DELETAR uma nova oferta");
		System.out.println("4 - para listar todas as ofertas cadastradas");
		System.out.println("5 - para listar ofertas que contém uma palavra");
		System.out.println("0 - para SAIR");
	}
	
	
	

}
