package pl.szkolnememo.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="mm_word_pair_usage_summary")
@Getter
@Setter
public class WordPairUsageSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="last_success")
    private LocalDateTime lastSuccess;

    @Column(name="last_fail")
    private LocalDateTime lastFail;

    @Column(name="successes")
    private Integer successes;

    @Column(name="successes_since_last_fail")
    private Integer successesSinceLastFail;

    @Column(name="fails")
    private Integer fails;

    @Column(name="trials_at_fail")
    private Integer trialsAtFail;

    @Column(name="trials_per_day")
    private Integer trialsPerDay;

    @OneToOne
    @PrimaryKeyJoinColumn
    private WordPair wordPair;
}
