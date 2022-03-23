package pl.Sebastian.pizza.domain.service;

import pl.Sebastian.pizza.domain.exception.UnauthorizedException;

public class AuthorizationService {
    public static void checkToken(String token){
        if(token==null || !token.equals("xzv")){
            throw new UnauthorizedException("bledny token");
        }
    }
}
