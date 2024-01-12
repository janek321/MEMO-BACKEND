package pl.szkolnememo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "mm_word_pair")
@Getter
@Setter
public class WordPair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String word1;

    @Column
    private String word2;

    @Column(name = "date_created")
    @CreationTimestamp
    private LocalDateTime dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private LocalDateTime lastUpdated;

    @ManyToOne
    @JoinColumn(name = "language1_id")
    private Language language1;

    @ManyToOne
    @JoinColumn(name = "language2_id")
    private Language language2;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usage_summary_id", referencedColumnName = "id")
    private WordPairUsageSummary wordPairUsageSummary;
}
