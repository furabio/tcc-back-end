package br.edu.fatecjahu.classroom.application.exceptions;

import java.time.LocalDateTime;

public class ErrorDetails {
    private String title;
    private int status;
    private String detail;
    private LocalDateTime timestamp;
    private String developerMessage;

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetail() {
        return detail;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    private ErrorDetails(Builder builder) {
        title = builder.title;
        status = builder.status;
        detail = builder.detail;
        timestamp = builder.timestamp;
        developerMessage = builder.developerMessage;
    }

    public static final class Builder {
        private String title;
        private int status;
        private String detail;
        private LocalDateTime timestamp;
        private String developerMessage;

        public static Builder builder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }


        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }


        public ErrorDetails build() {
            return new ErrorDetails(this);
        }
    }
}
