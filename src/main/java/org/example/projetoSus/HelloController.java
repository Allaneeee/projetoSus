package org.example.projetoSus;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML
    Label veiculoLabel = new Label();

    @FXML
    Label modeloLabel = new Label();

    @FXML
    Label placaLabel = new Label();

    @FXML
    Label lugarLabel = new Label();

    @FXML
    private TextField modeloTextField;

    @FXML
    private TextField placaTextField;

    @FXML
    private TextField lugarTextField;

    @FXML
    TableView<Veiculo> userTable;

    @FXML
    private TableColumn<Veiculo, String> modeloCollum;

    @FXML
    private TableColumn<Veiculo, String> placaCollum;

    @FXML
    private TableColumn<Veiculo, Integer> lugarCollum;

    @FXML
    private ObservableList<Veiculo> VeiculoList = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        VeiculoList = FXCollections.observableArrayList();

        modeloCollum.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        placaCollum.setCellValueFactory(new PropertyValueFactory<>("placa"));
        lugarCollum.setCellValueFactory(new PropertyValueFactory<>("lugar"));

        userTable.setItems(VeiculoList);
    }

    @FXML
    public void Adicionar(ActionEvent actionEvent) {
        String modelo = modeloTextField.getText();
        String placa = placaTextField.getText();
        int lugar = Integer.parseInt(lugarTextField.getText());

        if (modelo.isEmpty() || placa.isEmpty() || String.valueOf(lugar).isEmpty()){
            System.out.println("Favor preencher todos os campos.");
            return;
        }

        VeiculoList.add(new Veiculo(modelo,placa, lugar));

        modeloTextField.clear();
        placaTextField.clear();
        lugarTextField.clear();
    }

    @FXML
    public void Remover (ActionEvent actionEvent){
        Veiculo veiculoSelect = userTable.getSelectionModel().getSelectedItem();

        if (veiculoSelect != null){
            VeiculoList.remove(veiculoSelect);
        }
    }


}