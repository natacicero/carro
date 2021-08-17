package Aula;

public class TesteCriarObjeto {

	public static void main(String[] args) {
		
		Vendedor vendedor1 = new Vendedor(); 
		vendedor1.setNome("Roberto Carlos");
		vendedor1.setRg("111");
		vendedor1.setCpf("111.111");
		
		Vendedor vendedor2 = new Vendedor();
		vendedor2.setNome("Carlos Almeida");
		vendedor2.setRg("222");
		vendedor2.setCpf("222.222");
		
		Comprador comprador1 = new Comprador();
		comprador1.setNome("Marcos Rocha");
		comprador1.setIdade("35");
		
		Comprador comprador2 = new Comprador();
		comprador2.setNome("Lucca Silva");
		comprador2.setIdade("20");
		
		Comprador comprador3 = new Comprador();
		comprador3.setNome("Natã Silva");
		comprador3.setIdade("18");
		
		Comprador comprador4 = new Comprador();
		comprador4.setNome("Nycolas Mendes");
		comprador4.setIdade("25");


		Carro[] carros = new Carro[4];
		
		carros[0] = new Carro("VM","Fox","Azul",15560,50,12,28500.00,vendedor1,comprador2); 
		carros [1] = new Carro("Chevrolet","Onix","Preto",9350,45,10,30000,vendedor2,comprador1);
		carros [2] = new Carro("Fiat","Palio","Prata",0,47,14,33650,vendedor1,comprador4);
		carros [3] = new Carro("Ford","Fiesta","Prata",7500,15,600,23380,vendedor2,comprador3);
		
		System.out.println("***********************************************************************");
		System.out.println("                  RELATÓRIO DE VENDAS");
		System.out.println("***********************************************************************");

		
		for(int i=0;i<carros.length;i++){
			System.out.println("marca: " + carros[i].getMarca()); 
			System.out.println("modelo:"+ carros[i].getModelo()); 
			System.out.println("cor:" + carros[i].getCor()); 
			System.out.println("kilometragem de rodagem:" + carros[i].getkm()); 
			System.out.println("Rodagem de Veículo:" + carros[i].calcularkm());
			System.out.println("Preço: " + carros[i].getpreco());
			System.out.println("Desconto: " + carros[i].calcularDesconto(2.5,2));
			System.out.println("Valor do Carro com Desconto " + carros[i].getvalorComDesconto());
			System.out.println("************************DADOS DO VENDEDOR**************************");
			System.out.println("Vendedor: " + carros[i].getVendedor().getNome());
			System.out.println("RG: " + carros[i].getVendedor().getRg());
			System.out.println("CPF: " + carros[i].getVendedor().getCpf());
			System.out.println();
			System.out.println("*********************DADOS DO COMPRADOR****************************");
			System.out.println("Comprador: " + carros[i].getComprador().getNome());
			System.out.println("Idade: " + carros[i].getComprador().getIdade());
			System.out.println();
		}
		
		System.out.println("============================================================");
		System.out.println("Quantidade de Carros: " + Carro.getTotalCarros());
		System.out.println("Preço Total (valor bruto): " + Carro.getPrecoTotal());

	}
}	
	
