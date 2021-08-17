package Aula;

public class Carro {
	
	//Construtor - 1º Exemplo
	public Carro(int km) {
	  	if (km >=0 && km<=20000) {
			this.km = km;
		}else {
			System.out.println("Kilometragrm Alta!");
			System.exit(1);
		}
		
	}
	
	//Construtor Padrão (Default Construtor) 2º Exemplo
	public Carro() {
		
	}
	
	//Construtor - 3º Exemplo
	private String marca; 
	public Carro(String marca, String modelo, String cor, int km, int capacidadeTanque, int kmPorLitro, double preco, Vendedor vendedor, Comprador comprador) {
	this.marca = marca;
	this.modelo = modelo;
	this.cor = cor;
  	if (km >=0 && km<=20000) {
		this.km = km;
	}else {
		System.out.println("Kilometragrm Alta!");
		System.exit(1);
	} 
	this.capacidadeTanque = capacidadeTanque;
	this.kmPorLitro = kmPorLitro;
	this.preco = preco;
	this.vendedor = vendedor;
	this.comprador = comprador;
	Carro.totalCarros+=1; //Carro.totalCarros = Carro.totalCarros+1;
	Carro.precoTotal = Carro.precoTotal + this.preco;
}

	// Propriedade ou Atributos 

		private String modelo; 
		private String cor; 
		private int km; 
		private int capacidadeTanque; 
		private int kmPorLitro; 
		private double preco;
		double valorComDesconto;
		private Vendedor vendedor;
		private Comprador comprador;
		
		private static int totalCarros;
		private static double precoTotal;

		// Métodos 

		    int calcularkm(){ 
		    	return this.capacidadeTanque*this.kmPorLitro; 
	}
		    
		    double calcularDesconto(double percentualDescontoVendedor) {
		    	
		    	if(percentualDescontoVendedor>=0 && percentualDescontoVendedor<=4) {
		    		return this.preco * (percentualDescontoVendedor/100);
		    	}else if(percentualDescontoVendedor<0) {
		    		return 0.0;
		    	}else {
		    		return this.preco * 0.04;
		    	}
		    }
		    
		    double calcularDesconto(double percentualDescontoVendedor, double percentualDescontoGerente){
		    	
		    	//Alterar o percentual do Vendedor se a venda for menor que 0 ou maior que 4
		    	if(percentualDescontoVendedor<0) {
		    		percentualDescontoVendedor=0;
		    	}else if(percentualDescontoVendedor>4) {
		    		percentualDescontoVendedor=4;
		    	}
		    	
		    	//Alterar o percentual do Gerente se a venda for menor que 0 ou maior que 2
		    	if(percentualDescontoGerente<0) {
		    		percentualDescontoGerente=0;
		    	}else if(percentualDescontoGerente>2) {
		    		percentualDescontoGerente=2;
		    	}
		    	
		    	double desconto = this.preco * ((percentualDescontoVendedor/100) + (percentualDescontoGerente/100));
		    	this.setValorComDesconto(this.preco - desconto);
		    	
		    	return desconto;
		    	
		    }
		    
		    //Métodos getters setters
		    
		    public void setMarca(String marcaQueDesejaInserir){
		    	this.marca = marcaQueDesejaInserir;
		    }
		    
		    public String getMarca(){
		    	return this.marca;
		    }
		    
		    public void setModelo(String modeloQueDesejaInserir) {
		    	this.modelo = modeloQueDesejaInserir;
		    }
		    
		    public String getModelo() {
		    	return this.modelo;
		    }
		    
		    public void setCor(String CorQueDesejaInserir) {
		    	this.cor = CorQueDesejaInserir;
		    }
		    
		    public String getCor() {
		    	return this.cor;
		    }
		    
		    public void setKm(int Km, int km) {
		
		    }
		    
		    public int getkm() {
		    	return this.km;
		    }
		    
		    public void setcapacidadeTanque (int capacidadeTanqueQueDesejaInserir) {
		    	this.capacidadeTanque = capacidadeTanqueQueDesejaInserir;
		}
		    
			public int getcapacidadeTanque() {
			return this.capacidadeTanque;	
		}
			
		    public void setkmPorLitro (int kmPorLitroQueDesejaInserir) {
		    	this.kmPorLitro = kmPorLitroQueDesejaInserir;
		}
		    
			public int getkmporlitro() {
			return this.kmPorLitro;	
			}
			
		    public void setPreco (double PrecoQueDesejaInserir){
		    	this.preco = PrecoQueDesejaInserir;
		}
		    
			public double getpreco(){
			return this.preco;
			}
			
		    public void setvalorComDesconto (double valorcomdescontoQueDesejaInserir) {
		    	this.valorComDesconto = valorcomdescontoQueDesejaInserir;
		}
		    
			public double getvalorComDesconto() {
			return this.valorComDesconto;			    		    
		    }

			public double getValorComDesconto() {
				return valorComDesconto;
			}

			public void setValorComDesconto(double valorComDesconto) {
				this.valorComDesconto = valorComDesconto;
			}

			public static int getTotalCarros() {
				return totalCarros;
			}

			public static double getPrecoTotal() {
				return precoTotal;
			}

			public Vendedor getVendedor() {
				return vendedor;
			}

			public void setVendedor(Vendedor vendedor) {
				this.vendedor = vendedor;
			}

			public Comprador getComprador() {
				return comprador;
			}

			public void setComprador(Comprador comprador) {
				this.comprador = comprador;
			}	
			
}
	
