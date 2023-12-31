package spring.oauth.restapi.domain.auth.handler;

import org.springframework.http.ResponseEntity;

public interface SocialOAuthHandler {

    /**
     * 각 Social Login 페이지로 Redirect 처리할 URL Build
     * 사용자로부터 로그인 요청을 받아 Social Login Server 인증용 code 요청
     */
    String getOauthRedirectURL();

    /**
     * API Server로부터 받은 code를 활용하여 Access Token 요청
     *
     * @param code API Server 에서 받아온 code
     * @return API 서버로 부터 응답받은 Json 형태의 결과를 string으로 반환
     */
    ResponseEntity<String> requestAccessToken(String code);

    Object getAccessToken(ResponseEntity<String> response);

    Object getUserInfoFromJson(ResponseEntity<String> response);
}
