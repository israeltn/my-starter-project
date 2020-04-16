package com.gmail.tyokaha.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.tyokaha.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
