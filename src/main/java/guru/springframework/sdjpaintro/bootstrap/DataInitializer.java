package guru.springframework.sdjpaintro.bootstrap;

import guru.springframework.sdjpaintro.domain.Book;
import guru.springframework.sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {

    private BookRepository  bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse");
        System.out.println("Id: " +  bookDDD.getId());
        Book savedDDD = bookRepository.save(bookDDD);
        System.out.println("Id: " +  savedDDD.getId());

        Book bookSia = new Book("Spring in Action", "456", "Oriley");
        Book savedSia = bookRepository.save(bookSia);
        System.out.println("Id: " +  savedSia.getId());

        bookRepository.findAll().forEach(book -> {
            System.out.println("Id: " + savedSia.getId());
            System.out.println("Title: " +  savedSia.getTitle());
        });
    }
}
