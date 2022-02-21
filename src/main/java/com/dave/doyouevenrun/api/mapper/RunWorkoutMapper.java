package com.dave.doyouevenrun.api.mapper;

import com.dave.doyouevenrun.api.model.RunWorkoutDto;
import com.dave.doyouevenrun.domain.RunWorkout;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * User: Dave Harms
 * Date: 2/21/22
 * Time: 6:42 AM
 */
@Mapper(componentModel = "spring")
public interface RunWorkoutMapper {

    @Mapping(target = "id")
    RunWorkoutDto runWorkoutToRunWorkoutDto(RunWorkout workout);

    @Mapping(target = "id")
    RunWorkout runWorkoutDtoToRunWorkout(RunWorkoutDto dto);
}
