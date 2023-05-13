package com.example.demo;

import com.example.demo.services.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Resultado = " + payService.finalPrice(300.0, "SC"));
	}
}


 /*
@Component ou @Service : Prepara a classe para ser um componente gerenciado pelo framework
Obs: fazendo isso o próprio framework instância o objeto pra você, não precisando do "new ..."
ex: https://prnt.sc/PzYSqv2Hlcny

@Autowired : Automaticamente o framework instância o objeto pra você, não precisando do "new ..."
Obs: ele automaticamente injeta a dependência
ex: https://prnt.sc/27jAybPpuW6P


Padrão de projeto Singleton : Quando utilizado essas notations o framework reaproveita os componentes,
se você utilizar o @Autowired por exemplo, o framework utilizará a mesma instância.


@Autowired vs Construtor
Se você utilizar o @Autowired da seguinte maneira (https://prnt.sc/ZsOFVcxWxBBo) não é necessário criar um construtor.
Em questão de performace não interfere quase em nada.
 */
