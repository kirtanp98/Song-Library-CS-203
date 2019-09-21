package SongLibrary.View;

import SongLibrary.Model.Song;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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
}
