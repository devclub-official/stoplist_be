package d.stoplist_be.domain.badge.entity;

import d.stoplist_be.domain.badge.dto.BadgeResponse;
import d.stoplist_be.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "badges")
@Getter
public class Badge extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public BadgeResponse toDto() {
        return new BadgeResponse(
                id,
                name
        );
    }
}
