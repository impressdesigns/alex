package com.impressdesigns.alex.repositories;

import com.impressdesigns.alex.objects.Design;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignRepository extends JpaRepository<Design, Integer> {
}
