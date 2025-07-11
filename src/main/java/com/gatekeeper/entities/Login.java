package com.gatekeeper.entities;

import com.gatekeeper.entities.enums.AuthProvider;
import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(
        name = "logins",
        uniqueConstraints = @UniqueConstraint(columnNames = {"domain", "user_name"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Login extends SoftDeletableEntity {

    @Column(nullable = false)
    private UUID userId;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String password;

    @Column(nullable = false)
    private String domain;

    @Enumerated(EnumType.STRING)
    private AuthProvider authProvider;

    private OffsetDateTime lastLogin;

    @Builder.Default
    private Integer attempts = 0;

    private Integer allowedAttempts;

    @Builder.Default
    private Boolean active = true;

    @Column(columnDefinition = "TEXT")
    private String deactivationReason;
}
