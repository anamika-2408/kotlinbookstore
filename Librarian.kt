package driver

import model.Book
import service.LibraryService
fun main() {
    val libraryService = LibraryService()
    val bookID = "BK123"
    val title = "book title"
    val author = "cheetah"
    val category = "comics"
    val price = 10.50
    val book = Book(bookID, title, author, category, price)
    //libraryService.addBook(book)

    // libraryService.searchByTitle("book title")

    //libraryService.searchByAuthor("cheetah")
   // libraryService.updateBook(book)
   // libraryService.deleteBook(book)
    //libraryService.displayAll(book)

}


