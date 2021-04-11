package command;

import canteens.Canteen;
import ui.Ui;

import java.util.ArrayList;
import java.util.Map;

/**
 * Represents an executor that will exit the application
 */
public class ExitCommand extends Command {

    public ExitCommand() {
        this.exit = true;
    }

    @Override
    public void execute(ArrayList<Canteen> canteens, Ui ui) {
        ui.showGoodbye();
        System.exit(0);
    }

}
