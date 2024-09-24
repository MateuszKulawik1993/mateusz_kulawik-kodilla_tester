package com.kodilla;

public class Book {


        private String author;
        private String title;

        Book(String author, String title) {
            this.author = author;
            this.title = title;

        }

        public static Book of(String author, String title) {
            return new Book(author, title);
        }


        private String getBooksOfauthor() {
            return title;
        }


        private String getAuthorOfbooks() {
            return author;
        }

        public static void main(String[] args) {
            Book book = Book.of("J.R.R. Tolkien", "The Hobbit");
        }
    }


