package com.skm.algo.generics;

/**
 * @author saroj on 2/3/2020
 */
public class RestConnection {
    /*public <S,T> S send(T t, Class<S> responseClasss,String url, String systemToken){
        HttpHeaders headers = new HttpHeaders();
        headers.set(CommonConstants.AUTHORIZATION,"Bearer "+systemToken);
        HttpEntity<T> entity = new HttpEntity<T>(t,headers);
        ResponseEntity<S> response = restTemplate.exchange(url, HttpMethod.POST, entity,responseClasss);
        //logger.info("response String {}",response);
        return responseClasss.cast(response.getBody());
    }*/
}
