package com.dave.doyouevenrun.services;

import com.dave.doyouevenrun.api.mapper.RunWorkoutMapper;
import com.dave.doyouevenrun.api.model.RunWorkoutDto;
import com.dave.doyouevenrun.domain.RunWorkout;
import com.dave.doyouevenrun.repositories.RunWorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Dave Harms
 * Date: 2/20/22
 * Time: 3:10 PM
 */
@Service
public class RunWorkoutServiceImpl implements RunWorkoutService {

    private final RunWorkoutRepository runWorkoutRepository;
    private final RunWorkoutMapper runWorkoutMapper;

    public RunWorkoutServiceImpl(RunWorkoutRepository runWorkoutRepository, RunWorkoutMapper runWorkoutMapper) {
        this.runWorkoutRepository = runWorkoutRepository;
        this.runWorkoutMapper = runWorkoutMapper;
    }

    @Override
    public List<RunWorkoutDto> getAllRunWorkouts() {

        return runWorkoutRepository.findAll()
                .stream()
                .map(runWorkoutMapper::runWorkoutToRunWorkoutDto).collect(Collectors.toList());
    }

    @Override
    public RunWorkoutDto getRunWorkoutById(Long workoutId) {
        return runWorkoutRepository.findById(workoutId)
                .map(runWorkoutMapper::runWorkoutToRunWorkoutDto)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public RunWorkoutDto createNewRunWorkout(RunWorkoutDto dto) {
        RunWorkout workout = runWorkoutMapper.runWorkoutDtoToRunWorkout(dto);
        return saveAndReturnDto(workout);
    }

    @Override
    public RunWorkoutDto updateRunWorkout(Long id, RunWorkoutDto dto) {
        getRunWorkoutById(id);
        RunWorkout workoutToUpdate = runWorkoutMapper.runWorkoutDtoToRunWorkout(dto);
        return saveAndReturnDto(workoutToUpdate);
    }

    @Override
    public void deleteRunWorkout(Long id) {
        getRunWorkoutById(id);
        runWorkoutRepository.deleteById(id);
    }

    private RunWorkoutDto saveAndReturnDto(RunWorkout workout) {
        RunWorkout savedWorkout = runWorkoutRepository.save(workout);

        return runWorkoutMapper.runWorkoutToRunWorkoutDto(workout);
    }
}
