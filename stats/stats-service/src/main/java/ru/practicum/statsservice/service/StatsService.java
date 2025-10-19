package ru.practicum.statsservice.service;

import java.time.LocalDateTime;
import java.util.List;

public interface StatsService {
    void saveRequest(HitDto dto);

    List<Stat> getHits(LocalDateTime start, LocalDateTime end, List<String> uris, boolean unique);
}