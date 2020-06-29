package com.cscis71.curriculumcrawler.repository;

import com.cscis71.curriculumcrawler.config.Config;
import com.cscis71.curriculumcrawler.model.Curriculum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class CurriculumRepositoryTest {
    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;

    @Autowired
    private CurriculumRepository curriculumRepository;

    @Test
    public void addNewCurriculum() {
        Curriculum curriculum = new Curriculum();
        curriculum.setId("test_id");
        curriculum.setTitle("Test Curriculum");
        curriculumRepository.save(curriculum);

        Optional<Curriculum> retrieved = curriculumRepository.findById("test_id");
        if(retrieved.isPresent()) {
            assert curriculum.getTitle().equals(retrieved.get().getTitle());
        }
    }
}
