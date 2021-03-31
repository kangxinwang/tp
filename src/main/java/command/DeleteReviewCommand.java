package command;

import canteens.Canteen;
import exceptions.DukeExceptions;
import reviews.Review;
import stores.Store;
import ui.Ui;

import java.util.ArrayList;
import java.util.Map;


public class DeleteReviewCommand extends Command {
    private int storeIndex;
    private int review;
    private int canteenIndex;

    public DeleteReviewCommand(int canteenIndex, int storeIndex, int review) {
        this.canteenIndex = canteenIndex;
        this.storeIndex = storeIndex;
        this.review = review;
    }

    public void execute(ArrayList<Canteen> canteens, Ui ui) throws DukeExceptions {
        Canteen currentCanteen = canteens.get(canteenIndex);
        Store store = currentCanteen.getStore(storeIndex);
        store.deleteReview(review);
        ui.reviewDeleted();

    }

}