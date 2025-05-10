package com.mmartin.cqrs.command;

public interface CommandBus {

    <R> R send(CommandRequest<R> command);
}
