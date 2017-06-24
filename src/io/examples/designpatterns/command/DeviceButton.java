package io.examples.designpatterns.command;

import io.examples.designpatterns.command.commands.Command;

/**
 * This is known as the invoker
 * <p>
 * It has a method press() that when executed cause the execute method to be called
 * <p>
 * The execute method for the Command interface then calls the method assigned in the class that implements the
 * Command interface
 */
public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }

    // Now the remote can undo past theCommands

    public void pressUndo() {
        theCommand.undo();
    }

}
