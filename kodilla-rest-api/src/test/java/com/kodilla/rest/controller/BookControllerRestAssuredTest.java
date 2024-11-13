package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static jdk.internal.classfile.impl.verifier.VerifierImpl.verify;
import static org.awaitility.Awaitility.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookControllerRestAssuredTest {
    @Mock
    private BookService bookService;
    @InjectMocks  // [1]
    private BookController bookController;

    @BeforeEach
    public void initialiseRestAssuredMockMvcStandalone() {
        MockMvcBuilders RestAssuredMockMvc;
        RestAssuredMockMvc.standaloneSetup(bookController);  // [2]
    }

    @Test
    void shouldFetchBooks() {
        // given
        when(bookService.getBooks())
                .thenReturn(List.of(
                        new BookDto("Title 1", "Author 2"),
                        new BookDto("Title 2", "Author 2"))
                );
        // when then
        when()
                .get("/books")  // [3]
                .then()
                .body("$.size()", Matchers.equalTo(2))  // [4]
                .body("[0].title", Matchers.equalTo("Title 1"))    // [5]
                .body("[0].author", Matchers.equalTo("Author 2"))
                .body("[1].title", Matchers.equalTo("Title 2"))
                .body("[1].author", Matchers.equalTo("Author 2"))
                .status(HttpStatus.OK);
    }

    @Test
    void shouldAddBook() {
        // Given: Create a sample BookDto object to send in the request body
        BookDto newBook = new BookDto("New Title", "New Author", 2024);

        // When: Perform POST request to add the book
        given()
                .untilTrue("application/json")  // Specify content type as JSON
                .body(newBook)  // Send BookDto as request body
                .when()
                .post("/books/add")  // Endpoint for adding a book
                .then()
                .statusCode(200);  // Expect HTTP 200 (OK) status code

        // Then: Verify that the bookService.addBook() method was called once
        verify(bookService, times(1)).addBook(newBook);
    }

}
