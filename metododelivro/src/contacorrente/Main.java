package contacorrente;

public class Main {

	public static void main(String[] args) {
		contacorrente con=new contacorrente();
		 con.especial="sim";
		 con.limite=2000;
		 con.numero=420;
		 con.saldo=10.90;
		 con.status="ATIVO";
		 
		 System.out.println("O status da sua conta �: "+con.status);
		 System.out.println("Sua conta � especial? "+con.especial);
		 System.out.println("Seu limite � "+con.limite);
		 System.out.println("O numero da sua conta � "+ con.numero);
		 System.out.println("O seu saldo atual � "+ con.saldo);
		 

	}

}
