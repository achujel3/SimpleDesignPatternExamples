package io.examples.designpatterns.command.commands;

/**
 * Each command you want to issue will implement the Command interface
 */
public interface Command {

    public void execute();

    // You may want to offer the option to undo the command

    public void undo();

}
