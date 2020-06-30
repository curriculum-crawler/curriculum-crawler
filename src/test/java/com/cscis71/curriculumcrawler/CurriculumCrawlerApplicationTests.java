package com.cscis71.curriculumcrawler;

import com.cscis71.curriculumcrawler.model.Curriculum;
import com.cscis71.curriculumcrawler.repository.CurriculumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class CurriculumCrawlerApplicationTests {

	@Test
	void contextLoads() {
	}

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
