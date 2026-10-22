import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends JFrame implements ActionListener {

    JTextArea textArea;
    JMenuItem newFile, openFile, saveFile, exit;
    JMenuItem cut, copy, paste, selectAll;

    Notepad() {
        setTitle("Simple Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu file = new JMenu("File");

        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.addSeparator();
        file.add(exit);

        // Edit Menu
        JMenu edit = new JMenu("Edit");

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        menuBar.add(file);
        menuBar.add(edit);
        setJMenuBar(menuBar);

        // Register Action Listeners
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == newFile) {
            textArea.setText("");
        }
        else if (source == openFile) {
            JFileChooser fc = new JFileChooser();
            if (fc.showOpenDialog(this) ==
                    JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedReader br = new BufferedReader(
                            new FileReader(fc.getSelectedFile()));
                    textArea.read(br, null);
                    br.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Error opening file");
                }
            }
        }
        else if (source == saveFile) {
            JFileChooser fc = new JFileChooser();
            if (fc.showSaveDialog(this) ==
                    JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedWriter bw = new BufferedWriter(
                            new FileWriter(fc.getSelectedFile()));
                    textArea.write(bw);
                    bw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Error saving file");
                }
            }
        }
        else if (source == cut) {
            textArea.cut();
        }
        else if (source == copy) {
            textArea.copy();
        }
        else if (source == paste) {
            textArea.paste();
        }
        else if (source == selectAll) {
            textArea.selectAll();
        }
        else if (source == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}