package org.example.portfolio.data;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    private Long id;

    private String name;

    private Integer age;

    private String degree;

    private String email;

    private String summary;

    private String image;

}
