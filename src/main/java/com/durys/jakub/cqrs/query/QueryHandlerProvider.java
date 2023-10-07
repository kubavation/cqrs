package com.durys.jakub.cqrs.query;

public interface QueryHandlerProvider {
    <T extends Query<R>, R> QueryHandler<T, R> queryHandlerFor(T query);
}
