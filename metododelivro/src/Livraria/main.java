package Livraria;

public class main {

	public static void main(String[] args) {
	 livraria liv=new livraria();
	 liv.ano=2007;
		liv.autor="J. K. Rowling";
		liv.preco=50.99;
		liv.nome="Harry Potter";
		liv.qtdpaginas=300;
		liv.edicao=3;
		liv.genero="fantasia";
		
		System.out.println(liv.ano);
		System.out.println(liv.autor);
		System.out.println(liv.nome);
		System.out.println(liv.preco);
		System.out.println(liv.qtdpaginas);
		System.out.println(liv.genero);
		System.out.println(liv.edicao);

	}

}
