/*
package restUtils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


public class BookTest {

private static RequestSpecification spec;

@BeforeClass
public static void initSpec() {	
spec = new RequestSpecBuilder()
		.setContentType(ContentType.JSON)
		.setAccept(ContentType.JSON)
		.setBaseUri("http://api.flutrack.org/")
		.addFilter(new ResponseLoggingFilter())
		.addFilter(new RequestLoggingFilter())
		.build();
}
@Test
public void useSpec() {
	JsonPath response = given()
	.spec(spec)
	.when()
	.get("?limit=3")
	.then()
	.statusCode(200)
	.extract()
	.jsonPath();
	
	System.out.println(response.getList("user_name").get(0));
}
//@Test
//public void createBookAndCheckExistence() {
//	BookDTO bookdto = new BookDTO()
//			.setId(93)
//			.setTitle("Animal Farm")
//			.setAuthor("George Orwell")
//			.setPublicationDate("2012-06-16")
//			.setIsbn("9781849688406");
//	
//	BookDTO retrievedBook = given()
//			.spec(spec)
//			.body(bookdto)
//			.when()
//			.post("/books")
//			.then()
//			.statusCode(200)
//			.and()
//			.time(lessThan(1000L))
//			.extract()
//			.body()
//			.as(BookDTO.class);
//	
//	assertThat(retrievedBook.getTitle()).isEqualTo(bookdto.getTitle());
//	assertThat(retrievedBook.getAuthor()).isEqualTo(bookdto.getAuthor());
//	assertThat(retrievedBook.getCreatedAt()).isNotNull();
//	assertThat(retrievedBook.getUpdatedAt()).isEqualTo(retrievedBook.getCreatedAt());
//	assertThat(retrievedBook).isEqualToIgnoringGivenFields(bookdto, "createdAt","updatedAt");
//}
//@Test 
//public void createBookAndVerifyExistence() {
//	BookDTO bookdto = createDummyBook();
//	BookDTO retrievedBook = createAndGetResource("books", bookdto, BookDTO.class);
//	assertEqualBook(bookdto,retrievedBook);
//}
//private BookDTO createDummyBook() {
//	return new BookDTO()
//			.setId(94)
//			.setTitle("Effective Java")
//			.setAuthor("Joshua Bloch")
//			.setPublicationDate("2001-04-13")
//			.setIsbn("0134685997");
//}
//private <T> T createAndGetResource(String path, Object bodypayload, Class<T> responseClass) {
//	return given()
//			.spec(spec)
//			.body(bodypayload)
//			.when()
//			.post(path)
//			.then()
//			.statusCode(200)
//			.extract()
//			.as(responseClass);
//		
//}
//private void assertEqualBook(BookDTO bookdto, BookDTO retrievedBook) {
//	assertThat(retrievedBook.getTitle()).isEqualTo(bookdto.getTitle());
//	assertThat(retrievedBook.getAuthor()).isEqualTo(bookdto.getAuthor());
//}
//@Test
//public void getAllBooksWithJsonPath() {
//	JsonPath retrievedBooks = given()
//			.spec(spec)
//			.when()
//			.get("books")
//			.then()
//			.statusCode(200)
//			.extract().jsonPath();
//	assertThat(retrievedBooks.getList("author")).isNotEmpty();
//}
}
*/
