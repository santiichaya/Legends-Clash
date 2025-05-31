package com.LegendsClash.project.DTO;

import javax.management.relation.Role;

public record UserRegister(String username, String email, String password, String password2) {
}