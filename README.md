# Curriculum Crawler

## Stakeholders
* __Teachers:__ Teachers face competing priorities and time management to cover all relevant curriculum within a school year.
* __Dean of curriculum:__ Reducing overlapping topics through multiple curriculums can help optimize teachers' time, and add value to students' learning calendar.
* __Principal:__ All of the above allows Principals to strategize staffing and allow parents to follow clear learning projections.
* __Students:__ Students gain knowledge in order of learning, which keeps prequisites in check through cross curriculums, without wasting time on duplicated topics through multiple classes
* __Parents:__ Parents can feel confident knowing that the children have organized education levels of learning.

## Stakeholder Persona
### Jennifer Brown

* _Age:_ 43
* _Gender:_ female
* _Location:_ Dedham, Massachusetts 
* _Technical Comfort:_ Advanced
* _Job Title:_ AP Biology Teacher

__Backstory:__ Jennifer is married to Keith Brown. She is the Department Chair of the Science Department and teaches Biology and AP Biology. Jennifer has a post-graduate degree in education, working with curriculum design. She leads the redesign of the Seventh and Eighth-grade Science curriculum as an ongoing project at the school. Her job requires her to work closely with the Dean of Curriculum and coordinate with other departments at the school

__Motivations:__ She would have found the service by a search after working with competing products that don't deliver features she requires. Additionally, alternative products would are cost-prohibitive to use.    

__Goals:__ A prime requirement for her is cross-discipline alignment. Cross-discipline alignment is essential so that there is an understanding of what topics the other departments teach. She would recommend our service to all the departments at her school, leading to the school maximizing coordination amongst the departments.

__Barriers:__ A significant barrier will be importing data, having to copy/paste from one application to another can become tedious and lead to rage-quit. 

__Quote:__ "That will work" or "That works." or "That doesn't suck."

## Product Iteration (Summer 2020)
* __Name:__ Curriculum Crawler
* __Product Iteration Far Vision:__ Empowering Interdisciplinary Learning. 
* __Product Iteration Near Vision:__ The Curriculum Crawler is a search engine for teachers and curriculum coordinators that empowers interdisciplinary learning.
Unlike Managebac and Canvas, our product will find connections between subject’s written curriculum and connect teachers to allow them to collaborate. 
* __Key Architecture:__ 
  * Infrastructure: Google Cloud?
  * Persistence: [missing]
  * [missing]

## Product Backlog
Curriculum Crawler current product backlog is available to our Scrum Team members and management at [Trello](https://trello.com/b/iLxDKgHT/agile-sprint-board).
The user stories are found in the description of each Trello backlog item. 
### Rationale for Backlog Order
The product backlog is ordered with items critical for starting development on top. They are listed in descending priority on Trello.  

## Definition of Ready
  * Every Backlog Item has a title
  * Every Backlog Item has a opening sentence
  * Every Backlog Item has been Estimated in story points
  * All external dependencies have been resolved, whether the dependency was on another team or on an outside vendor.

## Definition of Done
  * Tests passed
  * Code reviewed
  * Acceptance criteria met
  
## Initial Estimation
  The team performed a Poker Point Activity on June 30, 2020. Only the development team members participated in the Poker Point Activity. Prity and Edwin participated as development team members while participating in point estimation while offering Scrum Master and Product Owner duties during Estimation. On each item in the backlog there is an Estimation field with the story points associated.
  
## Scrum Team
- Scrum Master / Developer (Back End) / DevOps: Prity Hutchinson
- Product Owner / Developer (Front End): Edwin Lagos
- Developer (Back end) / Meeting Facilitator / DevOps: Keith Brown
- Developer (Back end) : Hemal Shah
- Developer (Front End) / UX Designer: Wa'il Choudar

# Daily Scrum
## Friday July 2, 2020
- Keith Brown
-- In the last 24 hours I
--- Completed the base implementation for receiving REST calls
--- Started implemention of the Upload Document API
-- In the next 24 hours I
--- Complete the Upload Document API
-- Do I have any impediments
--- I do not have any impediments.
- Prity Hutchinson
-- In the last 24 hours I
-- In the next 24 hours I
-- Do I have any impediments
- Edwin Lagos
-- In the last 24 hours I
-- In the next 24 hours I
-- Do I have any impediments
- Hemal Shah
-- In the last 24 hours I
-- In the next 24 hours I
-- Do I have any impediments
- Wail Hermes
-- In the last 24 hours I
-- In the next 24 hours I
-- Do I have any impediments

# Test First Strategy
- All Backend Server tests are executed on every checkin to Master at https://github.com/curriculum-crawler/curriculum-crawler/actions (Java CI with Gradle) 
- To view the tests executions 
    1. Select the "Java CI with Gradle" workflow
    2. Select a commit
    3. Select the "build" which will populate a tree structure in the center of the page
    4. Expand the "Build with Gradle" to view the Gradle build log which will display the Unit Tests output (output will be similar as displayed below in the [Unit Test Run](#unit-test-run) Section)
- The API Backend Server was build using a TDD Stragegy. 
-- Created first were the for the initial infrastructure work to prove the Server was working.
-- The second set of tests were the Upload Document tests.

## Unit Tests
Test Class | Behavior Tested
---------- | ---------------
[edu.harvard.cscis71.curriculum.CurriculumApplicationTests.java](backend/src/test/java/edu/harvard/cscis71/curriculum/CurriculumApplicationTests.java) | Initial test to validate that the spring contexts load
[edu.harvard.cscis71.curriculum.api.HomeControllerTest.java](backend/src/test/java/edu/harvard/cscis71/curriculum/api/HomeControllerTest.java) | Unit test without starting server to validate Root Endpoint
[edu.harvard.cscis71.curriculum.api.HttpRequestTest.java](backend/src/test/java/edu/harvard/cscis71/curriculum/api//HttpRequestTest.java) | Unit test starting server asserting the behavior or the application
[edu.harvard.cscis71.curriculum.api.WebLayerTest.java](backend/src/test/java/edu/harvard/cscis71/curriculum/api/WebLayerTest.java) | Unit test validating Spring application context starts but without server

## Unit Test Run[](#unit-test-run)
```shell script
gradle clean build                                                                                                                                                                                                                                                                                                                                                   ST 1   master
executing gradlew instead of gradle

> Task :test

CurriculumApplicationTests > contextLoads() STARTED

CurriculumApplicationTests > contextLoads() PASSED

HttpRequestTest > rootRequestShouldReturnOK() STARTED

HttpRequestTest > rootRequestShouldReturnOK() PASSED

HttpRequestTest > homeRequestWebClientShouldReturnOKResponse() STARTED

HttpRequestTest > homeRequestWebClientShouldReturnOKResponse() PASSED

HttpRequestTest > contextLoads() STARTED

HttpRequestTest > contextLoads() PASSED

HomeControllerTest > shouldReturnOKResponse() STARTED

HomeControllerTest > shouldReturnOKResponse() PASSED

WebLayerTest > shouldReturnOKResponse() STARTED

WebLayerTest > shouldReturnOKResponse() PASSED
2020-07-03 14:19:47.087  INFO 14798 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-03 14:19:47.088  INFO 14798 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-03 14:19:47.131  INFO 14798 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-03 14:19:49.159  INFO 14798 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'

BUILD SUCCESSFUL in 12s
6 actionable tasks: 6 executed
```
## More Info

We can also be found in Canvas [Project Group 1](https://canvas.harvard.edu/courses/72401/groups) and on our [Slack](https://agilesoftwarecourse.slack.com/archives/C015ND86AJ3) channel. Our Kanban board can be found at [Trello](https://trello.com/b/iLxDKgHT/agile-sprint-board).

##### This is a final project for [Agile Software Development CSCI-E71](http://agilesoftwarecourse.org/) as part of degree requirements for  [Harvard Extension School](http://www.extension.harvard.edu/).

###### Built with love in Orlando, Hong Kong, Boston Area...
