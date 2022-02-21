package com.dave.doyouevenrun.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User: Dave Harms
 * Date: 2/19/22
 * Time: 10:53 AM
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class RunWorkout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private Long distance;
    private String time;
}
