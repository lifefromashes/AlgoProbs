package Command;

import Command.FX.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Print Black And White");
    }
    
}