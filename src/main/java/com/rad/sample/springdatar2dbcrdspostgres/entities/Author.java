package com.rad.sample.springdatar2dbcrdspostgres.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    private Long id;

    @NotBlank
    private String lastname;

    private String firstname;

}
