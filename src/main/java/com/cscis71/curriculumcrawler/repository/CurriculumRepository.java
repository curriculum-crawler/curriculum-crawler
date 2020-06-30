package com.cscis71.curriculumcrawler.repository;

import com.cscis71.curriculumcrawler.model.Curriculum;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CurriculumRepository extends ElasticsearchRepository<Curriculum, String> {

}
