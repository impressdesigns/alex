package com.impressdesigns.alex.repositories;

import com.impressdesigns.alex.objects.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
