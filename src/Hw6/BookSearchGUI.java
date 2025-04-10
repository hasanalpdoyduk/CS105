package Hw6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class BookSearchGUI extends JFrame implements ActionListener {
	private List<Book> bookList;
	private JTextField authorTextField;
	private JTextField yearTextField;
	private JTextField keywordTextField; 
	private JButton searchButton;
	private JButton clearButton;
	private JTable resultTable;
	
	public BookSearchGUI() {
		
		bookList = new ArrayList<>();
		bookList.add(new Book("Book 1", "Author 1", 2000, "Java; Programming")); 
		bookList.add(new Book("Book 2", "Author 2", 2010, "Python; Data Science"));
	
		setTitle("Book Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel searchPanel = new JPanel(); 
		searchPanel.setLayout(new GridLayout(4, 2)); 
		searchPanel.add(new JLabel("Author: "));
		authorTextField = new JTextField(); 
		searchPanel.add(authorTextField);
		searchPanel.add(new JLabel("Year:")); yearTextField = new JTextField(); 
		searchPanel.add(yearTextField);
		searchPanel.add(new JLabel ("Keywords: ")); keywordTextField = new JTextField(); 
		searchPanel.add(keywordTextField); searchButton = new JButton("Search"); searchButton.addActionListener(this); 
		searchPanel.add(searchButton);
		clearButton = new JButton("Clear"); clearButton.addActionListener(this); 
		searchPanel.add(clearButton);
		
		resultTable = new JTable();
		JScrollPane scrollPane = new JScrollPane(resultTable);
		
		getContentPane().setLayout(new BorderLayout()); 
		getContentPane().add(searchPanel, BorderLayout.NORTH); 
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}
		
	
		public void actionPerformed(ActionEvent e) {
		if (e.getSource() == searchButton) {
			performSearch();
		} 
		else if (e.getSource() == clearButton) { 
			clearSearchFields();
		}

	}


		private void performSearch() {
			String author = authorTextField.getText(); 
			String yearString = yearTextField.getText(); 
			String keywords = keywordTextField.getText();

			DefaultTableModel model = new DefaultTableModel(); 
			model.addColumn("Title");
			model.addColumn("Author"); 
			model.addColumn("Year"); 
			model.addColumn("Keywords");

			
			for (Book book : bookList) {
	            if ((author.isEmpty() || book.getAuthor().equalsIgnoreCase(author)) &&
	                    (yearString.isEmpty() || book.getYear() == Integer.parseInt(yearString)) &&
	                    (keywords.isEmpty() || book.containsKeyword(keywords))) {
	                model.addRow(new Object[]{book.getTitle(), book.getAuthor(), book.getYear(), book.getKeywords()});
	            }
	        }

	        resultTable.setModel(model);
	    }

	    private void clearSearchFields() {
	        authorTextField.setText("");
	        yearTextField.setText("");
	        keywordTextField.setText("");
	        DefaultTableModel model = new DefaultTableModel();
	        resultTable.setModel(model);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new BookSearchGUI();
	            }
	        });
	    }
	}

	class Book {
	    private String title;
	    private String author;
	    private int year;
	    private String keywords;

	    public Book(String title, String author, int year, String keywords) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	        this.keywords = keywords;
	    }

	    public String getTitle() { 
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public int getYear() {
	        return year;
	    }

	    public String getKeywords() {
	        return keywords;
	    }

	    public boolean containsKeyword(String keyword) {
	        String[] keywordArray = keywords.split(";");
	        for (String k : keywordArray) {
	            if (k.equalsIgnoreCase(keyword)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}