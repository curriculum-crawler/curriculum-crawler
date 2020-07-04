- [Curriculum Crawler](#curriculum-crawler)
- [Project Information](#project-information)
  - [Scrum Team](#scrum-team)
  - [Stakeholders](#stakeholders)
  - [Stakeholder Persona](#stakeholder-persona)
    - [Jennifer Brown](#jennifer-brown)
  - [Product Iteration (Summer 2020)](#product-iteration-summer-2020)
  - [Product Backlog](#product-backlog)
    - [Rationale for Backlog Order](#rationale-for-backlog-order)
  - [Definition of Ready](#definition-of-ready)
  - [Definition of Done](#definition-of-done)
  - [Initial Estimation](#initial-estimation)
  - [Sprint 1](#sprint-1)
  - [Daily Scrums](#daily-scrums)
    - [Friday July 2, 2020](#friday-july-2-2020)
- [Test Driven Development](#test-driven-development)
  - [Unit Tests](#unit-tests)
  - [Unit Test Run](#unit-test-run)
    - [Backend Unit Tests](#backend-unit-tests)
    - [Front End Unit Tests](#front-end-unit-tests)
- [More Info](#more-info)

# Curriculum Crawler

# Project Information
## Scrum Team
- Scrum Master / Developer (Back End) / DevOps: Prity Hutchinson
- Product Owner / Developer (Front End): Edwin Lagos
- Developer (Back end) / Meeting Facilitator / DevOps: Keith Brown
- Developer (Back end) : Hemal Shah
- Developer (Front End) / UX Designer: Wa'il Choudar

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
  * Infrastructure: 
    * Heroku AWS 
    * EC2
  * Persistence:
    * Elasticsearch

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
  
## Sprint 1
The Sprint Kanban board is at https://trello.com/b/BEeWOpo7/curriculum-crawler-sprint-kanban-board

![Sprint Review Invitation](images/sprint-1-review-invite.jpg)

## Sprint 1 Forecast 
- Sprint 1 forecast was determined to be 11 points.

## Sprint Forecast Rationale 
- Team 1 identified the set of MVP functionality that can be completed in the 4 day sprint through this accelerated 3 week class. Keeping Sprint goal in mind, Team 1 described “what” and “how” of the sprint and its user stories. With that information, development team was able to forecast 11 points.

## Sprint 1 Backlog
- Three key tasks to provide search functionality were identified as MVP for Sprint 1. The tasks include Start page for stakeholder to log in, upload documents for management and review, and search functionality to identify overlaps of curriculum for teachers to optimize time. 
- The aggregate size of stories is 11 points, same as a the forecast.
- Our front-end developer had an unfortunate accident with bone fractures and another back-end developer had a conflict. For that reason, Edwin (PO) and Prity (SM) played development roles and sized the stories.

## Sprint 1 Story sizes
- The 3 stories in Sprint 1 are sized: 1, 5 and 5 points respectively. They are less than half of our forecast velocity of 11 points. As on Trello Board - https://trello.com/b/iLxDKgHT/curriculum-crawler 


## Daily Scrums
![Sprint Review Invitation](images/daily-scrum-invite.jpg)


### Friday July 3, 2020
- Keith Brown
    - In the last 24 hours I
        - Completed the base implementation for receiving REST calls
        - Started implemention of the Upload Document API
    - In the next 24 hours I
        - Complete the Upload Document API
    - Do I have any impediments
        - I do not have any impediments.
- Prity Hutchinson
    - In the last 24 hours I
      - Created Powerpoint for Sprint Review, shared with PO to present.
      - Facilitated daily scrum meeting and evaluated spring backlog.
    - In the next 24 hours I
      - Facilitate Sprint Review meeting
      - Facilitate Sprint Retrospective meeting
      - Faciliate Sprint 2 planning
    - Do I have any impediments
      - Based on Professor Kasperowski's feedback, I've requested a timeslot for the team to review user stories but have not heard back. This guidance will be critical for Team 1 to submit Part 2 of the project, with the validation that documentation of user stories/tasks meet his expectations.
- Edwin Lagos
    - In the last 24 hours I
        - Completed the base implementation of the UI for the searching functionality.
        - Completed the creation of the UI for the search results UI.
        - Completed the tests for the UI components. 
    - In the next 24 hours I
        - Will finish documentation for the UI. 
        - Implement the upload API within the UI, if available. 
    - Do I have any impediments
        - I don't have any impediments. 
- Hemal Shah
    - In the last 24 hours I
    - In the next 24 hours I
    - Do I have any impediments
- Wail Hermes
    - In the last 24 hours I
    - In the next 24 hours I
    - Do I have any impediments

# Test Driven Development
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
[sum.test.js](frontend/cc_frontend/tests/sum.test.js) | Initial validation that testing suite is able to find components. 
[frontend.test.js](frontend/cc_frontend/tests/frontend.test.js) | Unit tests that validate the correct rendering of React components for the UI


## Unit Test Run
### Backend Unit Tests
```bash
$> gradle clean build 
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
### Front End Unit Tests
```bash
jest "--verbose"

 PASS  tests/sum.test.js
  ✓ adds 1 + 2 to equal 3 (2 ms)
  ✓ adds 5 + 2 to equal 7

 PASS  tests/frontend.test.js
  ✓ renders correct greeting (29 ms)
  ✓ will render a search bar as an input group (5 ms)
  ✓ will render a search bar with a placeholder message (5 ms)
  ✓ will render a field to upload files (4 ms)
  ✓ will show placeholder text in a custom file input field (3 ms)
  ✓ will render a field to upload files (4 ms)
  ✓ search cards will show the author's name and email (3 ms)
  ✓ search card will show the the curriculum's description as text (5 ms)

Test Suites: 2 passed, 2 total
Tests:       10 passed, 10 total
Snapshots:   0 total
Time:        1.873 s, estimated 2 s
Ran all test suites.
```

# More Info

We can also be found in Canvas [Project Group 1](https://canvas.harvard.edu/courses/72401/groups) and on our [Slack](https://agilesoftwarecourse.slack.com/archives/C015ND86AJ3) channel. Our Kanban board can be found at [Trello](https://trello.com/b/iLxDKgHT/agile-sprint-board).

***This is a final project for [Agile Software Development CSCI-E71](http://agilesoftwarecourse.org/) as part of degree requirements for  [Harvard Extension School](http://www.extension.harvard.edu/).***

***Built with love in Orlando, Hong Kong, Boston Area...***
