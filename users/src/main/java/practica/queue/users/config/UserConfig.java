package practica.queue.users.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	@Bean
	public FanoutExchange fanoutExchange() {
		
		
		return new FanoutExchange("usercreated2.fanout");
	}
	
	@Bean
	public Queue userCreatedAccountQueue() {
		return new Queue("usercreated.account.queue2",true);
		
	}
	@Bean
	public Binding binding1(FanoutExchange fanoutExchange,Queue userCreatedAccountQueue) {
		
		return BindingBuilder.bind(userCreatedAccountQueue).to(fanoutExchange);
		
	}

}
