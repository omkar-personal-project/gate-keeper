package com.gatekeeper.entity;

import com.gatekeeper.entity.enums.ContactType;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Entity
@Table(name = "contacts")
@Data
public class Contact {

    @Id
    @GeneratedValue
    private UUID id;

    private String contactDetail;

    @Enumerated(EnumType.STRING)
    private ContactType contactType;

    private boolean verified;

    private boolean primary;

    private boolean verificationRequired;
}
