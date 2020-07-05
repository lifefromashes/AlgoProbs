package Command;

import Command.FX.Button;

public class Main {
    public static void main(String[] args) {
        var composite  = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        // var service = new CustomerService();
        // var command = new AddCustomerCommand(service);
        // var button = new Button(command);
        // button.click();
    }
}