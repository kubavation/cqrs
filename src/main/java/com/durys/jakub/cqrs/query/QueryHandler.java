package com.durys.jakub.cqrs.query;

public interface QueryHandler<T extends Query<R>, R> {
   R handle(T query);
}
