package com.durys.jakub.cqrs.configuration;


import com.durys.jakub.cqrs.query.Queries;
import com.durys.jakub.cqrs.query.Query;
import com.durys.jakub.cqrs.query.QueryHandlerProvider;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SpringQueryGateway implements Queries {

    private final QueryHandlerProvider queryHandlerProvider;

    @Override
    public <T extends Query<R>, R> R find(T query) {
        return (R) queryHandlerProvider.queryHandlerFor(query).handle(query);
    }
}
