package com.company;

public class Frame extends JFrame {

    public Frame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JTable table;

        Person person = new Person();
        setLayout(new FlowLayout());
        String[] col = {"Id", "Name", "Lname", "Age"};

        String[][] data = {{String.valueOf(person.id), person.fName, person.lName, String.valueOf(person.age)}};

        for (int i = 0; i < 20; i++) {
            //тут нужна помощь
        }

        table = new JTable(data, col);
        table.setPreferredScrollableViewportSize(new Dimension(500, 500));
        table.setFillsViewportHeight(true);
        add(table);

        setVisible(true);
    }
}
