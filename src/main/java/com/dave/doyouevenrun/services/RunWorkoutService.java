package com.dave.doyouevenrun.services;

import com.dave.doyouevenrun.api.model.RunWorkoutDto;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/20/22
 * Time: 3:07 PM
 */
public interface RunWorkoutService {

    List<RunWorkoutDto> getAllRunWorkouts();

    RunWorkoutDto getRunWorkoutById(Long id);

    RunWorkoutDto createNewRunWorkout(RunWorkoutDto dto);

    RunWorkoutDto updateRunWorkout(Long id, RunWorkoutDto dto);

    void deleteRunWorkout(Long id);
}
