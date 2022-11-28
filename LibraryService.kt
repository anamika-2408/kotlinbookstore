package service

import model.Book
import repository.LibraryRepository

class LibraryService {
    var repo = LibraryRepository()
    //addBook,searchByTitle,searchByAuthor,fetchBooks,deleteBook,updateBook

    fun addBook(book: Book){
        repo.addBook(book)
    }

    fun searchByTitle(title: String) {
        repo.searchbyTitle(title)
    }

    fun searchByAuthor(author: String) {
        repo.searchbyauthor(author)
    }
    fun updateBook(book: Book){
        repo.updateBook(book)
    }
    fun deleteBook(book: String) {
        repo.deleteBook(book:bookID)
    }
    fun displayAll(book: String) {
        val displayAll = repo.displayAll(book:bookID)
    }
}