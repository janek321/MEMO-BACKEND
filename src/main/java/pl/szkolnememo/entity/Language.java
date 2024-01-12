package pl.szkolnememo.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="mm_language")
@Getter
@Setter
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="language_name")
    private String languageName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "language1")
    private Set<WordPair> wordPair1s = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "language2")
    private Set<WordPair> wordPair2s = new HashSet<>();
}
