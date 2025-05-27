package com.LegendsClash.project.DTO;

import java.util.List;

public record LoginResponse(String username, List<String> authorities, String token) {
}
