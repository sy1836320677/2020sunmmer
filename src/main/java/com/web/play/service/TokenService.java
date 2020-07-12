package com.web.play.service;

import com.auth0.jwt.algorithms.Algorithm;
import com.web.play.entity.User;
import org.springframework.stereotype.Service;
import com.auth0.jwt.JWT;
import java.util.Date;

@Service("TokenService")
public class TokenService {

    public String getToken(User user) {
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token = "";

        token = JWT.create().withAudience(Integer.toString(user.getUserId())).withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}