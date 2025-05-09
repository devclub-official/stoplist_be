package d.stoplist_be.global.enums;

import lombok.Generated;
import org.springframework.http.HttpStatus;

public enum ErrorCode {
    USER_DUPLICATION(HttpStatus.CONFLICT, "이미 있는 닉네임입니다."),
    AUTHENTICATE_FAIL(HttpStatus.UNAUTHORIZED, "인증에 실패하였습니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 유저 정보를 찾을 수 없습니다"),
    ;

    private final HttpStatus httpStatus;
    private final String detail;

    private ErrorCode(final HttpStatus httpStatus, final String detail) {
        this.httpStatus = httpStatus;
        this.detail = detail;
    }

    @Generated
    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    @Generated
    public String getDetail() {
        return this.detail;
    }
}