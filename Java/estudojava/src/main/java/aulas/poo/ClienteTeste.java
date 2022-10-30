package aulas.poo;

import java.time.LocalDate;
// CRIAÇÃO DO OBJETO DA CLASSE CLIENTE
public class ClienteTeste {

        public static void main(String[] args) {
            Cliente cliente1 = new Cliente(1,"Diego","Martins",
                    LocalDate.of(1993,12,27),1.90,80.0);
            //TERMINO DA CRIAÇÃO DO OBJETO DA CLASSE CLIENTE

            System.out.println(cliente1.getNomeSobrenome());

            cliente1.setAltura(2.6);



        }
}
