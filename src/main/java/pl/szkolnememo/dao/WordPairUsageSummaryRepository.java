package pl.szkolnememo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.szkolnememo.entity.WordPairUsageSummary;

@RepositoryRestResource(collectionResourceRel = "WordPairUsageSummary", path="word-pair-usage-summaries")
public interface WordPairUsageSummaryRepository extends JpaRepository<WordPairUsageSummary, Long> {
}
