package com.pk48.BourseIntercommunale.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthentificationResponse {
    private String token;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
}
