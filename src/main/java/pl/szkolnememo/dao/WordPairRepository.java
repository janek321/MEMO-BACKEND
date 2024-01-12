package pl.szkolnememo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.szkolnememo.entity.WordPair;

import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "word-pairs")
public interface WordPairRepository extends JpaRepository<WordPair, Long> {
    Page<WordPair> findByWord1ContainingOrWord2Containing(@Param("word1") String word1,
                                                          @Param("word2") String word2,
                                                          Pageable pageable);
    @Query("SELECT wp " +
           "FROM WordPair wp " +
           "INNER JOIN wp.wordPairUsageSummary wpus " +
           "ORDER BY wpus.lastSuccess LIMIT 1")
    Optional<WordPair> getWordPairForPractice();

}
