package SongLibrary.View;

import SongLibrary.Model.Song;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Controller {
    @FXML ListView<Song> songList;
    @FXML Button add;
    @FXML Button edit;
    @FXML Button delete;
    @FXML Text name;
    @FXML Text artist;
    @FXML Text album;
    @FXML Text year;
    @FXML TextField nameField;
    @FXML TextField artistField;
    @FXML TextField albumField;
    @FXML TextField yearField;

    private ObservableList<String> obsList;

    public void add(ActionEvent e) {
        System.out.println("add");
  }

    public void edit(ActionEvent e) {
        System.out.println("edit");
    }

    public void delete(ActionEvent e) {
        System.out.println("delete");
    }
}
