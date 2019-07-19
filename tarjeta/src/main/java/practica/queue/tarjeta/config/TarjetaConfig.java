package practica.queue.tarjeta.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import practica.queue.tarjeta.listenercola.TarjetaListener;

@Configuration
public class TarjetaConfig {
	
	@Bean
	TarjetaListener hh() {
		return new TarjetaListener();
		
	}
	@Bean
	public FanoutExchange fanoutExchange() {
		
		
		return new FanoutExchange("usercreated2.fanout");
	}
//	@Bean
//	public Queue userCreatedAccountQueue() {
//		return new Queue("usercreated.account.queue3",true);
//		
//	}
//	@Bean
//	public Binding binding1(FanoutExchange fanoutExchange,Queue userCreatedAccountQueue) {
//		
//		return BindingBuilder.bind(userCreatedAccountQueue).to(fanoutExchange);
//		
//	}
}
