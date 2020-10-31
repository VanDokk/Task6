package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class Controller {

    @FXML
    public TextArea textAreaJSON;

    @FXML
    public Button btnSortName;

    @FXML
    public Button btnSortRarity;

    @FXML
    public Button btn;

    getJSON gj = new getJSON();
    Cards cards = new Cards();

    public void getJSON(ActionEvent actionEvent) throws InterruptedException, IOException {
        gj.start();
        String json = gj.getJson();

        do {
            Thread.sleep(100);
        } while ((json = gj.getJson()) == null);

        cards = Cards.fromJSONToObjects(json);
        textAreaJSON.setText(cards.getCards().toString());

        btnSortName.setDisable(false);
        btnSortRarity.setDisable(false);
        btn.setDisable(true);


    }

    public void btnSortRarity(ActionEvent actionEvent) {
        cards.getCards().sort(Card.byRarityAsc);
        textAreaJSON.setText(cards.getCards().toString());
    }

    public void btnSortName(ActionEvent actionEvent) {
        cards.getCards().sort(Card.byNameDesc);
        textAreaJSON.setText(cards.getCards().toString());
    }
}
