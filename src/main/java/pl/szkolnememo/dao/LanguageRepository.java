package pl.szkolnememo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szkolnememo.entity.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
