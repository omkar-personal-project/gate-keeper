package com.gatekeeper.entity;

import com.gatekeeper.entity.enums.AuthProvider;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Entity
@Table(name = "logins")
@Data
public class Login {

    @Id
    private UUID id;

    private String userName;
    private String password;
    private AuthProvider authProvider;
    private int attempts;
    private int allowedAttempts;
    private boolean active;
    private boolean isDeleted;
    private boolean contactVerificationRequired;
    private String deactivationReason;
    private String domain;
}
