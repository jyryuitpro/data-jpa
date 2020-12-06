package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

    //Open Projections
    @Value("#{target.username + ' ' + target.age}")
    String getUsername();
}
