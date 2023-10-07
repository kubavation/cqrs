package com.durys.jakub.cqrs.configuration;


import com.durys.jakub.cqrs.command.CommandGateway;
import com.durys.jakub.cqrs.command.CommandHandlerProvider;
import com.durys.jakub.cqrs.query.Queries;
import com.durys.jakub.cqrs.query.QueryHandlerProvider;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CqrsConfiguration {

    @Bean
    CommandHandlerProvider commandHandlerProvider(ConfigurableListableBeanFactory factory) {
        return new SpringCommandHandlerProvider(factory);
    }

    @Bean
    CommandGateway commandGateway(CommandHandlerProvider commandHandlerProvider) {
        return new SpringCommandGateway(commandHandlerProvider);
    }

    @Bean
    QueryHandlerProvider queryHandlerProvider(ConfigurableListableBeanFactory factory) {
        return new SpringQueryHandlerProvider(factory);
    }

    @Bean
    Queries queries(QueryHandlerProvider handlerProvider) {
        return new SpringQueryGateway(handlerProvider);
    }
}
