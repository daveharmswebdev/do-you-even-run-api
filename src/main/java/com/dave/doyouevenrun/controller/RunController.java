package com.dave.doyouevenrun.controller;

import com.dave.doyouevenrun.domain.RunWorkout;
import com.dave.doyouevenrun.services.RunWorkoutService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/19/22
 * Time: 11:12 AM
 */
@RestController
@RequestMapping("/api/v1/runs")
public class RunController {

    private final RunWorkoutService runWorkoutService;

    public RunController(RunWorkoutService runWorkoutService) {
        this.runWorkoutService = runWorkoutService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<RunWorkout> getRuns() {
        return runWorkoutService.getAllRunWorkouts();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RunWorkout getWorkoutById(@PathVariable Long id) {
        return runWorkoutService.getRunWorkoutById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RunWorkout createNewRun(@RequestBody RunWorkout workout) {
        return runWorkoutService.createNewRunWorkout(workout);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteRunWorkout(@PathVariable Long id) {
        runWorkoutService.deleteRunWorkout(id);
    }

}
