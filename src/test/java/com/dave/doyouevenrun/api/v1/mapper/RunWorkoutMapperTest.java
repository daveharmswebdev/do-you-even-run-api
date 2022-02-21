package com.dave.doyouevenrun.api.v1.mapper;

import com.dave.doyouevenrun.api.mapper.RunWorkoutMapper;
import com.dave.doyouevenrun.api.mapper.RunWorkoutMapperImpl;
import com.dave.doyouevenrun.api.model.RunWorkoutDto;
import com.dave.doyouevenrun.domain.RunWorkout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Dave Harms
 * Date: 2/21/22
 * Time: 6:53 AM
 */
public class RunWorkoutMapperTest {

    RunWorkoutMapper runWorkoutMapper;

    @BeforeEach
    public void setUp() throws Exception {
        runWorkoutMapper = new RunWorkoutMapperImpl();
    }

    @Test
    public void runWorkoutToRunWorkoutDto() throws Exception {
        RunWorkout workout = RunWorkout.builder()
                .id(1L)
                .title("test").distance(8.2f).time("1:01")
                .build();

        RunWorkoutDto dto = runWorkoutMapper.runWorkoutToRunWorkoutDto(workout);

        assertEquals(1L, dto.getId());
        assertEquals("test", dto.getTitle());
        assertEquals(8.2f, dto.getDistance());
        assertEquals("1:01", dto.getTime());
    }

    @Test
    public void runWorkoutDtoToRunWorkout() throws Exception {
        RunWorkoutDto dto = RunWorkoutDto.builder()
                .id(1L)
                .title("test").distance(8.2f).time("1:01")
                .build();

        RunWorkout workout = runWorkoutMapper.runWorkoutDtoToRunWorkout(dto);

        assertEquals(1L, workout.getId());
        assertEquals("test", workout.getTitle());
        assertEquals(8.2f, workout.getDistance());
        assertEquals("1:01", workout.getTime());
    }
}
