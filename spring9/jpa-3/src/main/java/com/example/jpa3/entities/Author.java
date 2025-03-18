package com.example.jpa3.entities;


import jakarta.persistence.*;
import java.util.List;


@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Subjects> subjectList;

//    @OneToOne(cascade = CascadeType.PERSIST)
//    private Book book;

    /* bidirecional one to many author to books
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> books;
*/
    public List<Book> getBook() {
        return books;
    }

    public void setBook(List<Book> books) {
        this.books = books;
    }



    // unidirectional one to many author to books
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "author_id")
//    private List<Book> books;


    // many to many mapping Q8 author to book
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Subjects> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subjects> subjectList) {
        this.subjectList = subjectList;
    }
}
