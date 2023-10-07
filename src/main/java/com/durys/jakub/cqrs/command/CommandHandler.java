package com.durys.jakub.cqrs.command;

public interface CommandHandler<T extends Command<R>, R> {
    R handle(T command);
}
