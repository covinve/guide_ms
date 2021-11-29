package com.courier.guias_ms.repositories;

import com.courier.guias_ms.models.Guide;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GuideRepository extends MongoRepository <Guide, String> { }
