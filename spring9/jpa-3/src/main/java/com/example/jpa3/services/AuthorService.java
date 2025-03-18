package com.example.jpa3.services;

import com.example.jpa3.entities.Address;
import com.example.jpa3.entities.Author;
import com.example.jpa3.entities.Book;
import com.example.jpa3.entities.Subjects;
import com.example.jpa3.repos.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.Arrays;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;


    public void saveAuthorSubjects() {

        // COMMON CODE STARTS

        Author a1 = new Author();
        Author a2 = new Author();
        Author a3 = new Author();
        a1.setAddress(new Address("123", "Delhi", "New Delhi"));
        a2.setAddress(new Address("12345", "Faridabad", "Haryana"));
        a3.setAddress(new Address("765", "XYZ", "ABC"));

        Subjects s1 = new Subjects();
        Subjects s2 = new Subjects();
        Subjects s3 = new Subjects();
        Subjects s4 = new Subjects();
        Subjects s5 = new Subjects();
        Subjects s6 = new Subjects();
        s1.setName("Science");
        s2.setName("Maths");
        s3.setName("Computer");
        s4.setName("Social");
        s5.setName("Philosophy");
        s6.setName("Java");

        List<Subjects> lista1 = Arrays.asList(s1, s2, s3);
        List<Subjects> lista2 = Arrays.asList(s1, s4, s5);
        List<Subjects> lista3 = Arrays.asList(s6, s1, s3);

        List<Author> lists1 = Arrays.asList(a1, a2);
        List<Author> lists2 = Arrays.asList(a1, a3);

        a1.setSubjectList(lista1);
        a2.setSubjectList(lista2);
        a3.setSubjectList(lista3);

        s1.setAuthors(lists1);
        s2.setAuthors(lists2);

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book b5 = new Book();
        Book b6 = new Book();
        b1.setBookName("Java Core");
        b2.setBookName("Spring");
        b3.setBookName("Spring Boot");
        b4.setBookName("cs");
        b5.setBookName("computer");
        b6.setBookName("CSE AIML");

        //  COMMON CODE TILL HERE

        // bidirectional one to many author to book
//        b1.setAuthor(a1);
//        b2.setAuthor(a1);
//        b3.setAuthor(a1);
//        b4.setAuthor(a2);
//        b5.setAuthor(a2);
//        b6.setAuthor(a3);
//
        List<Book> list1 = Arrays.asList(b1,b2,b3);
        List<Book> list2 = Arrays.asList(b4,b5);
        List<Book> list3 = Arrays.asList(b6);
        a1.setBook(list1);
        a2.setBook(list2);
        a3.setBook(list3);

        b1.setAuthors(Arrays.asList(a1,a2));
        b2.setAuthors(Arrays.asList(a1));
        b3.setAuthors(Arrays.asList(a1,a2));
        b4.setAuthors(Arrays.asList(a2));
        b5.setAuthors(Arrays.asList(a2));
        b6.setAuthors(Arrays.asList(a3));

        authorRepo.save(a1);
        authorRepo.save(a2);
        authorRepo.save(a3);
    }

}
