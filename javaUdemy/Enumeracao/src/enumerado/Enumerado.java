package enumerado;

import java.util.Date;

public class Enumerado {

	public static void main(String[] args) {
		ClassePedido pedido = new ClassePedido(1010, new Date(), Pedido.AGURADANDO_PAGAMENTO);
		
		Pedido p1 =  Pedido.ENTREGUE;
		Pedido p2 =  Pedido.valueOf("ENTREGUE"); //caso entre uma string
		
		
		System.out.println(pedido.toString());

	}

}
