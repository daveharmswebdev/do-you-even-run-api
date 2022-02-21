package com.dave.doyouevenrun.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

/**
 * User: Dave Harms
 * Date: 2/21/22
 * Time: 6:31 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RunWorkoutDto {

    private Long id;
    private String title;
    private float distance;
    private String time;
}
