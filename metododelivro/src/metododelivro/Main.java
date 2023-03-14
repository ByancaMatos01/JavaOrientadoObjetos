package metododelivro;

public class Main {

	public static void main(String[] args) {
		livro l=new livro();
		l.ano=2003;
		l.autor="Collen Hoover";
		l.preco=50.99;
		l.nome="É assim que começa";
		l.qtdpaginas=300;
		
		System.out.println(l.ano);
		System.out.println(l.autor);
		System.out.println(l.nome);
		System.out.println(l.preco);
		System.out.println(l.qtdpaginas);
		
		
		
	}

}
