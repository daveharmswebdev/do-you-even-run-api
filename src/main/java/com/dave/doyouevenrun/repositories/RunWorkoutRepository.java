package com.dave.doyouevenrun.repositories;

import com.dave.doyouevenrun.domain.RunWorkout;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: Dave Harms
 * Date: 2/19/22
 * Time: 10:57 AM
 */
public interface RunWorkoutRepository extends JpaRepository<RunWorkout, Long> {
}
