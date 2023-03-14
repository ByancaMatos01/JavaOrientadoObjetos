package contacorrente;

public class Main {

	public static void main(String[] args) {
		contacorrente con=new contacorrente();
		 con.especial="sim";
		 con.limite=2000;
		 con.numero=420;
		 con.saldo=10.90;
		 con.status="ATIVO";
		 
		 System.out.println("O status da sua conta é: "+con.status);
		 System.out.println("Sua conta é especial? "+con.especial);
		 System.out.println("Seu limite é "+con.limite);
		 System.out.println("O numero da sua conta é "+ con.numero);
		 System.out.println("O seu saldo atual é "+ con.saldo);
		 

	}

}
