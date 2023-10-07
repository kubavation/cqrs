package com.durys.jakub.cqrs.query;

public interface Queries {
   <T extends Query<R>, R> R find(T query);
}
