package com.dave.doyouevenrun.services;

import com.dave.doyouevenrun.domain.RunWorkout;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/20/22
 * Time: 3:07 PM
 */
public interface RunWorkoutService {

    List<RunWorkout> getAllRunWorkouts();

    RunWorkout getRunWorkoutById(Long id);

    RunWorkout createNewRunWorkout(RunWorkout workout);

    RunWorkout updateRunWorkout(RunWorkout workout);

    void deleteRunWorkout(Long id);
}
