package com.faleite.finance_sitter.security.config;

public record JWTUserData(Long userId, String email) {

    public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private Long userId;
            private String email;

            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Builder email(String email) {
                this.email = email;
                return this;
            }

            public JWTUserData build() {
                return new JWTUserData(userId, email);
            }
        }
}
