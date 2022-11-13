package org.example.portfolio.domain.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@JsonInclude(
        JsonInclude.Include.NON_NULL
)
public class ImageDto {

    private Long id;

    private String path;

    public ImageDto(Long id, String path) {
        this.id = id;
        this.path = path;
    }

}
