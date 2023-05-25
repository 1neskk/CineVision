package org.example.Movies;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.BorderLayout;

public class MoviesDashboard extends JFrame {


    public MoviesDashboard() {
        setTitle("Movies Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        String[] columnNames = {"Title", "Genre", "Year", "Director", "Rating", "Average Score"};
        tableModel = new DefaultTableModel(columnNames, 0);


        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);


        JButton addButton = new JButton("Add Movie");
        addButton.addActionListener(e -> {
            String title = JOptionPane.showInputDialog("Enter the movie title:");
            String genre = JOptionPane.showInputDialog("Enter the movie genre:");
            String year = JOptionPane.showInputDialog("Enter the movie year:");
            String director = JOptionPane.showInputDialog("Enter the movie director:");
            String rating = JOptionPane.showInputDialog("Enter the movie rating (1-10):");


            Object[] row = {title, genre, year, director, rating, ""};
            tableModel.addRow(row);


            updateAverageScores();
            sortTableByAverageScore();
        });
        add(addButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void updateAverageScores() {
        int rowCount = tableModel.getRowCount();
        int lastRowIndex = rowCount - 1;

        int ratingSum = 0;
        int ratingCount = 0;


        for (int j = 0; j < rowCount; j++) {
            String rating = (String) tableModel.getValueAt(j, 4);
            if (rating != null && !rating.isEmpty()) {
                ratingSum += Integer.parseInt(rating);
                ratingCount++;
            }
        }

        double averageScore = ratingCount > 0 ? (double) ratingSum / ratingCount : 0;
        tableModel.setValueAt(averageScore, lastRowIndex, 5);
    }


    private void sortTableByAverageScore() {
        if (sorter == null) {
            sorter = new TableRowSorter<>(tableModel);
            table.setRowSorter(sorter);
        }

        sorter.setComparator(5, (score1, score2) -> {
            if (score1 instanceof Double averageScore1 && score2 instanceof Double averageScore2) {
                return Double.compare(averageScore2, averageScore1);
            } else {
                int rowCount = tableModel.getRowCount();
                if (rowCount >= 2) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow >= 0) {
                        int index1 = table.convertRowIndexToModel(selectedRow);
                        int index2 = table.convertRowIndexToModel(selectedRow);
                        String ratingCount1 = (String) tableModel.getValueAt(index1, 4);
                        String ratingCount2 = (String) tableModel.getValueAt(index2, 4);

                        int count1 = ratingCount1 != null && !ratingCount1.isEmpty() ? Integer.parseInt(ratingCount1) : 0;
                        int count2 = ratingCount2 != null && !ratingCount2.isEmpty() ? Integer.parseInt(ratingCount2) : 0;

                        int result = Integer.compare(count2, count1);
                        if (result != 0) {
                            return result;
                        } else {
                            String movieName1 = (String) tableModel.getValueAt(table.convertRowIndexToModel(0), 0);
                            String movieName2 = (String) tableModel.getValueAt(table.convertRowIndexToModel(1), 0);
                            return movieName1.compareToIgnoreCase(movieName2);
                        }
                    }
                }
                return 0;
            }
        });

        sorter.toggleSortOrder(5);
    }



    public static void main(String[] args) {
        new MoviesDashboard();
    }

    private final DefaultTableModel tableModel;
    private TableRowSorter<DefaultTableModel> sorter;
    private final JTable table;
}
