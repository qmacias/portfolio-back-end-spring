package org.example.portfolio.domain.data;

import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
public class ImageDto {

    private Long id;

    private String path;

    public ImageDto(Long id, String path) {
        this.id = id;
        this.path = path;
    }

}
