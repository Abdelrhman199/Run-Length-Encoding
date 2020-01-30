package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {
    @FXML
    TextField txt1 = new TextField();
    @FXML
    TextField txt2 = new TextField();
    @FXML
    Label lbl2 = new Label();
    @FXML
    Label lbl3 = new Label();
    @FXML
    void compress()
    {
        RunLengthEncoding obj = new RunLengthEncoding();
        String inputStream = txt1.getText();
        obj.setInputStream(inputStream);
        obj.generateTags();
        System.out.println("Input Stream: ");
        System.out.println(inputStream);
        System.out.println("------------------------------------------------------");
        System.out.println("Tags: ");
        System.out.println(obj.getTags());
        System.out.println("------------------------------------------------------");
        System.out.println("Huffman table: ");
        obj.generateHuffmanTable();
        ArrayList<HuffmanNode> list=obj.getHuffmanTable();
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).getTag()+" "+list.get(i).getProbability());
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Tags with its huffman codes: ");
        obj.HuffmanCompression();
        ArrayList<HuffmanNode>list2=obj.getHuffmanTable();
        for (int i = 0; i <list2.size() ; i++) {
            System.out.println(list2.get(i).getTag()+" "+list2.get(i).getCode());
        }
        System.out.println("------------------------------------------------------");
        obj.generateCompressedStream();
        String x = obj.getCompressedStream();
        System.out.println("Compressed stream: ");
        System.out.println(obj.getCompressedStream());
        lbl2.setText("Compressed Stream: "+obj.getCompressedStream());
        System.out.println("------------------------------------------------------");
        System.out.println("Decompressed stream: ");
        String decompressedStream = obj.decompress();
        System.out.println(decompressedStream);
        lbl3.setText("Decompressed Stream: "+decompressedStream);
        System.out.println("------------------------------------------------------");
    }

}
