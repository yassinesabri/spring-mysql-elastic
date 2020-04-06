package com.example.springmysqlelastic.repo.elastic;

import com.example.springmysqlelastic.model.UserModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IUserESRepo extends ElasticsearchRepository<UserModel, Long> {
}
