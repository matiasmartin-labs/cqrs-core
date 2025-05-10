package com.mmartin.cqrs.command;

public interface CommandHandler<C extends CommandRequest<R>, R> {

    R execute(C command);

}
