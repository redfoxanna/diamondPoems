package com.redfoxanna.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;

/**
 * The Poem class
 *
 * @author redfoxanna
 */
@Entity(name="Poem")
@Table(name = "poem")
public class Poem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    private int id;
    @Column(name="poem_content")
    private String content;
    @Column(name="poem_image")
    private String poemImage; // TODO: how handle images?
    @ManyToOne
    private User user = new User();
    @Column(name="created_at") // TODO how work with submit form
    private Timestamp createdAt;


    /**
     * No arg constructor
     */
    public Poem() {
    }

    /**
     * Constructor for a poem with parameters
     */
    public Poem(String content, String poemImage, User user) {
        this.content = content;
        this.poemImage = poemImage;
        this.user = user;

    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets poem image.
     *
     * @return the poem image
     */
    public String getPoemImage() {
        return poemImage;
    }

    /**
     * Sets poem image.
     *
     * @param poemImage the poem image
     */
    public void setPoemImage(String poemImage) {
        this.poemImage = poemImage;
    }

    /**
     * Gets the user id of poem author
     * @return the user's id
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user's id
     * @param user the user object
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets created at.
     *
     * @return the created at
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets created at.
     *
     * @param createdAt the created at
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gives all poem variables and values
     * @return all the params
     */
    @Override
    public String toString() {
        return "Poem{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", poemImage='" + poemImage + '\'' +
                ", userId=" + user +
                ", createdAt=" + createdAt +
                '}';
    }
}

