package com.example.tennis.repository;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tennis.entity.TennisMatch;

// @Repository
public interface TennisMatchRepository extends JpaRepository<TennisMatch, Long> {

    // private final Map<Long, TennisMatch> storage = new HashMap<>();
    // private Long idCounter = 1L;
    // public List<TennisMatch> findAll() {
    //     return new ArrayList<>(storage.values());
    // }
    // public Optional<TennisMatch> findById(Long id) {
    //     return Optional.ofNullable(storage.get(id));
    // }
    // public TennisMatch save(TennisMatch match) {
    //     if (match.getId() == null) {
    //         match.setId(idCounter++);
    //     }
    //     storage.put(match.getId(), match);
    //     return match;
    // }
    // public void deleteById(Long id) {
    //     storage.remove(id);
    // }
}
