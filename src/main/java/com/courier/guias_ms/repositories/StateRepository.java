package com.courier.guias_ms.repositories;

import com.courier.guias_ms.models.State;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StateRepository extends MongoRepository <State, String> {
    List<State> findStateByIdGuide(String idGuide);
}
