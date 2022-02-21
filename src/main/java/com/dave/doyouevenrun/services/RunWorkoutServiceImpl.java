package com.dave.doyouevenrun.services;

import com.dave.doyouevenrun.domain.RunWorkout;
import com.dave.doyouevenrun.repositories.RunWorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/20/22
 * Time: 3:10 PM
 */
@Service
public class RunWorkoutServiceImpl implements RunWorkoutService {

    private final RunWorkoutRepository runWorkoutRepository;

    public RunWorkoutServiceImpl(RunWorkoutRepository runWorkoutRepository) {
        this.runWorkoutRepository = runWorkoutRepository;
    }

    @Override
    public List<RunWorkout> getAllRunWorkouts() {
        return runWorkoutRepository.findAll();
    }

    @Override
    public RunWorkout getRunWorkoutById(Long workoutId) {
        return runWorkoutRepository.findById(workoutId).orElseThrow(RuntimeException::new);
    }

    @Override
    public RunWorkout createNewRunWorkout(RunWorkout workout) {
        return runWorkoutRepository.save(workout);
    }

    @Override
    public RunWorkout updateRunWorkout(RunWorkout workout) {
        return runWorkoutRepository.save(workout);
    }

    @Override
    public void deleteRunWorkout(Long id) {
        runWorkoutRepository.deleteById(id);
    }
}
