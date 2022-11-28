package repository

import model.Book
import java.sql.Connection
import java.sql.DriverManager
import java.util.*

class LibraryRepository {
    fun connect(): Connection {
        val myurl = "jdbc:mysql://localhost:3306/bookstoredb"
        val connection = DriverManager.getConnection(myurl, "root", "Pranav1234#")
        println("connection successfully")
        return connection

    }

    var connection = connect()

    var scanner = Scanner(System.`in`)
    fun addBook(book: Book): Int {
        val addbook = connection.prepareStatement("Insert into BookStore value(?,?,?,?,?)")
        addbook.setString(1, book.bookID)
        addbook.setString(2, book.title)
        addbook.setString(3, book.author)
        addbook.setString(4, book.category)
        addbook.setDouble(5, book.price)

        val result = addbook.executeUpdate()
        return result

    }

    fun searchbyTitle(title: String) {
        val query = connection.prepareStatement("select * from bookstore WHERE title = ?")
        val result = query.execute()
        println("search successfully")
    }

    fun searchbyauthor(author: String) {
        val query = connection.prepareStatement("select * from bookstore WHERE author = ?")
        val result = query.execute()
        println("search successfully")
    }

    fun searchbycategory(category: String) {
        val query = connection.prepareStatement("select * from bookstore WHERE category = ?")
        val result = query.execute()
        println("search successfully")
    }

    fun updateBook(book: Book): Int {
        val updatebook = connection.prepareStatement("Insert into BookStore value(?,?,?,?,?)")
        updatebook.setString(1, book.bookID)
        updatebook.setString(2, book.title)
        updatebook.setString(3, book.author)
        updatebook.setString(4, book.category)
        updatebook.setDouble(5, book.price)

        val result = updatebook.executeUpdate()
        return result
    }

    fun deleteBook(deletebookID: String): Int {
        val result = deleteBook
        return result
    }
    fun displayAll():MutableList<Book>{
        val result = displayAll()
        return displayAll()
    }
}