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
  - [Sprint 1 Forecast](#sprint-1-forecast)
  - [Sprint Forecast Rationale](#sprint-forecast-rationale)
  - [Sprint 1 Backlog](#sprint-1-backlog)
  - [Sprint 1 Backlog screenshot](#sprint-1-backlog-screenshot)
  - [Sprint 1 Story sizes](#sprint-1-story-sizes)
  - [Sprint 1 Burndown Chart](#sprint-1-burndown-chart)
  - [Daily Scrums](#daily-scrums)
    - [Friday July 3, 2020](#friday-july-3-2020)
  - [Impediment removal plan](#impediment-removal-plan)
  - [Sprint 1 review](#sprint-1-review)
    - [Sprint 1 Demo](#sprint-1-demo)
      - [Frontend Demo](#frontend-demo)
      - [Backend Demo](#backend-demo)
  - [Sprint 1 Retrospective](#sprint-1-retrospective)
- [Sprint 2](#sprint-2)
  - [Sprint 2 Forecast](#sprint-2-forecast)
  - [Sprint Forecast Rationale](#sprint-forecast-rationale-1)
  - [Sprint 2 Backlog](#sprint-2-backlog)
    - [Sprint Stories Pulled](#sprint-stories-pulled)
  - [Sprint 2 Backlog screenshot](#sprint-2-backlog-screenshot)
  - [Sprint 2 Story sizes](#sprint-2-story-sizes)
  - [Sprint 2 Burndown Chart](#sprint-2-burndown-chart)
  - [Sprint Review Rehearsal](#sprint-review-rehearsal)
  - [Daily Scrums](#daily-scrums-1)
    - [Monday July 6, 2020](#monday-july-6-2020)
  - [Impediment removal plan](#impediment-removal-plan-1)
- [Continuous Integration](#continuous-integration)
  - [Unit Tests](#unit-tests)
  - [Unit Test Run](#unit-test-run)
    - [Backend Unit Tests](#backend-unit-tests)
    - [Front End Unit Tests](#front-end-unit-tests)
    - [Pair programming](#pair-programming)
      - [Sprint 1](#sprint-1-1)
      - [Sprint 2](#sprint-2-1)
- [Continuous Deployment](#continuous-deployment)
  - [Backend Continuous Deployment Pipeline](#backend-continuous-deployment-pipeline)
  - [Backend Continuous Deployment Dashboard](#backend-continuous-deployment-dashboard)
  - [Frontend Continuous Deployment Pipeline](#frontend-continuous-deployment-pipeline)
  - [Frontend Continuous Deployment Dashboard](#frontend-continuous-deployment-dashboard)
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
  
# Sprint 1
The Sprint Kanban board is at https://trello.com/b/iLxDKgHT/curriculum-crawler

![Sprint Review Invitation](images/sprint-1-review-invite.jpg)

## Sprint 1 Forecast 
- Sprint 1 forecast was determined to be 11 points.

## Sprint Forecast Rationale 
- Ideally, we would have previous sprints with achievable points in a sprint to forecast appropriately.
- Team 1 identified the set of MVP functionality that can be completed in the 4 day sprint through this accelerated 3 week class. Keeping Sprint goal in mind, Team 1 described “what” and “how” of the sprint and its user stories. With that information, development team was able to forecast 11 points.

## Sprint 1 Backlog
- Three key tasks to provide search functionality were identified as MVP for Sprint 1. The tasks include Start page for stakeholder to log in, upload documents for management and review, and search functionality to identify overlaps of curriculum for teachers to optimize time. 
- The aggregate size of stories is 11 points, same as a the forecast.
- Our front-end developer had an unfortunate accident with bone fractures and another back-end developer had a conflict. For that reason, Edwin (PO) and Prity (SM) played development roles and sized the stories.

## Sprint 1 Backlog screenshot
![Sprint Backlog](images/Sprint_1_backlog.png)

## Sprint 1 Story sizes
- The 3 stories in Sprint 1 are sized: 1, 5 and 5 points respectively. They are less than half of our forecast velocity of 11 points. As on Trello Board - https://trello.com/b/iLxDKgHT/curriculum-crawler 

## Sprint 1 Burndown Chart
![alt text](https://docs.google.com/spreadsheets/u/1/d/e/2PACX-1vQNo-X2gjKdnmAugHCURJ6U1weBgBkl2yiznDoslvtjUQt-6ctWIpPscKXCm-eFjeZEYZc75cJ6JHRK/pubchart?oid=883135275&format=image)
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
      - created and configured the AWS account for backend deployment
      - Created a server to host the backend code. 
    - In the next 24 hours I
      - Setup the backed code to run on the server
    - Do I have any impediments
      - I don't have any impediments
- Wa'il Choudar
    - In the last 24 hours I
      - Created a Burndown Chart.
      - Revised the Kanban board. 
    - In the next 24 hours I
      - Pair program with Edwin Lagos.
      - Improve the UI design of the website.
    - Do I have any impediments
      - I don't have any impediments

## Impediment removal plan 
- Meeting scheduled for 11am July 5th with Professor to resolve impediments.

## Sprint 1 review
- Review was held on 5th July 2020 with Professor Richard
- ![Sprint 1 Review](images/Sprint_1_review_with_Richard_screenshot.png)

### Sprint 1 Demo
- The product was demonstrated to the client. The product in its current state can be found at https://curriculumcrawler.herokuapp.com/

#### Frontend Demo
![Landing Page 1](images/demo1-1.png)

![Landing Page 2](images/demo1-2.png)

#### Backend Demo
![Landing Page 3](images/demo1-3.png)

![Landing Page 4](images/demo1-4.png)

## Sprint 1 Retrospective

What worked well?
- The team met consistently on time for Scrum meetings
- The daily scrums were very helpful to remain aligned within team members, consistent with Agile principles and outcomes.
- Asked questions to clarify actions and keep accountability
- Team communicated well on Slack and in meetings
- Team members had a voice
- Well coordinated activities to develop software product	
- Good peer programming effort
- Back end and Front end development aligned well to develop product.
- Team was able to plan and deliver vertical thin slice of functional product.

What could be improved?
- The team took on more story points than able to complete in a 4 day sprint 1. This was due to it being the team's first sprint together, without a track record of throughput.

What will we commit to improving in the next Sprint?
- Team will have Sprint 1 to use as experience to reflect on Sprint 2's planning.

# Sprint 2
## Sprint 2 Forecast 
- Sprint 2 forecast was determined to be 6 points.

## Sprint Forecast Rationale 
- With only one sprint in our sprint history, we opted for a conservative estimate. 
-Using Yesterday's Weather, we saw that 1 story point was completed in the first sprint. After taking into consideration the partial stories that were previously completed and factoring in a sprint buffer for interruptions, we happened upon a final estimation of 6 story points.

## Sprint 2 Backlog
- Two key tasks to provide search functionality were identified as MVP for the final sprint. The tasks include: UI page which opens up file chooser, provide on-screen confirmation for files uploaded successfully, and implement search from REST API. 
- The aggregate size of stories is 6 points, same as a the forecast.

### Sprint Stories Pulled

You can see below that the stories that were pulled into the sprint backlog came directly from the top of the backlog. 

It is also clear that the size of the story does not exceed our forecast of 6. Each is 3 points, showing that we made sure that either one is not more than half of the total velocity of the sprint. It important to note that some refinedment to the size of the stories was needed from the initial estimation. After conducting our research we realized that we overestimated initially by choosing each of these stories are being 5 points, before our first sprint. During this sprint we re-estimated them to be 3 points each. 

Participating members: Development Team.

Before Adding to Sprint Backlog           |  After Adding to Sprint Backlog
:----------------------------------------:|:------------------------------------------:
![Sprint 2 Backlog](images/Sprint2-1.png) |  ![Sprint 2 Backlog](images/Sprint2-2.png)

## Sprint 2 Backlog screenshot 

This is the status of our board at the end of sprint 2:

![Sprint 2 Backlog](images/sprint_backlog.JPG)
![Sprint 2 tasks](images/sprint_tasks.JPG)

## Sprint 2 Story sizes
As on Trello Board - https://trello.com/b/iLxDKgHT/curriculum-crawler 

## Sprint 2 Burndown Chart
![alt text](https://docs.google.com/spreadsheets/d/e/2PACX-1vTJvzVh6TgLA5NhOi1Ss6NteqXMiAAWGSAoNBt-n6K7hprPFXBJ9t1ny-bQVMBFkyH11S_s41sK_1A0/pubchart?oid=883135275&format=image)

## Sprint Review Rehearsal
![!alt text](images/rehearsal.png)

## Daily Scrums
![Sprint Review Invitation](images/daily-scrum-invite.jpg)

### Monday July 6, 2020
- Keith Brown
    - In the last 24 hours I
        Worked on document upload REST API
        Created document upload branch
    - In the next 24 hours I
        Evaluate and strategize Continuous Delivery part of project part 3
    - Do I have any impediments
        Issue uploading to EC2 instance
- Prity Hutchinson
    - In the last 24 hours I
        Led Sprint review, Spring retrospective and Sprint planning
    - In the next 24 hours I
        Create Powerpoint for Spring 2 review for PO to present
    - Do I have any impediments
        None at this time
- Edwin Lagos
    - In the last 24 hours I
        - Added SSO with Google. Auth validated for uploading documents
        - Implement documents from Google drive and ability to upload documents to database
    - In the next 24 hours I
        - Add functionality to download documents
        - Evaluate method to search documents, that are uploaded to Google
    - Do I have any impediments
        - Unable to complete functional UI due to backend issues
- Hemal Shah
    - In the last 24 hours I
        Work on document REST API & evaluate multi-part option        
    - In the next 24 hours I
        Complete upload document testing
    - Do I have any impediments
        None at this time
- Wa'il Choudar
    - In the last 24 hours I
        Peer programming with Edwin for Website UI
        Align front end UX
    - In the next 24 hours I
        Improve UI
    - Do I have any impediments
        None at this time
## Impediment removal plan 
  Team will look into Heroku CD options - July 6, 2020
  Backend APIs need to be completed 

# Continuous Integration
All tests are run as part of the checkin/pull into the master branch.
- All Backend Server tests are executed on every checkin to Master at https://github.com/curriculum-crawler/curriculum-crawler-backend/actions (Java CI with Gradle) 
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
[edu.harvard.cscis71.curriculum.CurriculumApplicationTests.java](https://github.com/curriculum-crawler/curriculum-crawler-backend/src/test/java/edu/harvard/cscis71/curriculum/CurriculumApplicationTests.java) | Initial test to validate that the spring contexts load
[edu.harvard.cscis71.curriculum.HomeControllerTest.java](https://github.com/curriculum-crawler/curriculum-crawler-backend/src/test/java/edu/harvard/cscis71/curriculum/HomeControllerTest.java) | Unit test without starting server to validate Root Endpoint
[edu.harvard.cscis71.curriculum.HttpRequestTest.java](https://github.com/curriculum-crawler/curriculum-crawler-backend/src/test/java/edu/harvard/cscis71/curriculum//HttpRequestTest.java) | Mock test starting server asserting the behavior or the application
[edu.harvard.cscis71.curriculum.WebLayerTest.java](https://github.com/curriculum-crawler/curriculum-crawler-backend/src/test/java/edu/harvard/cscis71/curriculum/WebLayerTest.java) | Mock test starting server asserting the behavior of the REST endpoints
[edu.harvard.cscis71.curriculum.api.DocumentApiControllerTest.java](https://github.com/curriculum-crawler/curriculum-crawler-backend/src/test/java/edu/harvard/cscis71/curriculum/api/DocumentApiControllerTest.java) | Unit test testing document endpoint functionality
[sum.test.js](https://github.com/curriculum-crawler/cc_frontend/blob/master/tests/sum.test.js) | Initial validation that testing suite is able to find components. 
[frontend.test.js](https://github.com/curriculum-crawler/cc_frontend/blob/master/tests/frontend.test.js) | Unit tests that validate the correct rendering of React components for the UI


## Unit Test Run
### Backend Unit Tests
```bash
$> gradle clean build 
> Task :compileJava

> Task :test

executing gradlew instead of gradle
Starting a Gradle Daemon, 1 incompatible Daemon could not be reused, use --status for details

> Task :openApiGenerate
Successfully generated code to /Users/kbrown/OneDrive/college-docs/courses/Agile/curriculum-crawler-backend/build/generated

> Task :compileJava
Note: /Users/kbrown/OneDrive/college-docs/courses/Agile/curriculum-crawler-backend/src/main/java/edu/harvard/cscis71/curriculum/RFC3339DateFormat.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

> Task :test

HttpRequestTest > rootRequestShouldReturnRedirect() STARTED

HttpRequestTest > rootRequestShouldReturnRedirect() PASSED

HttpRequestTest > contextLoads() STARTED

HttpRequestTest > contextLoads() PASSED

HttpRequestTest > homeRequestWebClientShouldReturnRedirectResponse() STARTED

HttpRequestTest > homeRequestWebClientShouldReturnRedirectResponse() PASSED

CurriculumApplicationTests > contextLoads() STARTED

CurriculumApplicationTests > contextLoads() PASSED

DocumentApiControllerTest > deleteDocument() STARTED

DocumentApiControllerTest > deleteDocument() PASSED

DocumentApiControllerTest > testUploadDocument() STARTED

DocumentApiControllerTest > testUploadDocument() PASSED

DocumentApiControllerTest > testGetByDocumentId() STARTED

DocumentApiControllerTest > testGetByDocumentId() PASSED

DocumentApiControllerTest > getByDocumentId() STARTED

DocumentApiControllerTest > getByDocumentId() PASSED

DocumentApiControllerTest > testUpdateDocument() STARTED

DocumentApiControllerTest > testUpdateDocument() PASSED

DocumentApiControllerTest > testCreateDocument() STARTED

DocumentApiControllerTest > testCreateDocument() PASSED

DocumentApiControllerTest > getDocuments() STARTED

DocumentApiControllerTest > getDocuments() PASSED

DocumentApiControllerTest > updateDocument() STARTED

DocumentApiControllerTest > updateDocument() PASSED

DocumentApiControllerTest > createDocument() STARTED

DocumentApiControllerTest > createDocument() PASSED

DocumentApiControllerTest > testDeleteDocument() STARTED

DocumentApiControllerTest > testDeleteDocument() PASSED

DocumentApiControllerTest > testGetDocuments() STARTED

DocumentApiControllerTest > testGetDocuments() PASSED

HomeControllerTest > shouldReturnOKResponse() STARTED

HomeControllerTest > shouldReturnOKResponse() PASSED

WebLayerTest > shouldReturnOKResponse() STARTED

WebLayerTest > shouldReturnOKResponse() PASSED

WebLayerTest > deleteDocument() STARTED

WebLayerTest > deleteDocument() PASSED

WebLayerTest > getByDocumentId() STARTED

WebLayerTest > getByDocumentId() PASSED

WebLayerTest > getDocuments() STARTED

WebLayerTest > getDocuments() PASSED

WebLayerTest > updateDocument() STARTED

WebLayerTest > updateDocument() PASSED

WebLayerTest > createDocument() STARTED

WebLayerTest > createDocument() PASSED
2020-07-09 00:53:49.206  INFO 37742 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-09 00:53:49.209  INFO 37742 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-07-09 00:53:49.209  INFO 37742 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-07-09 00:53:49.209  INFO 37742 --- [extShutdownHook] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2020-07-09 00:53:49.209  INFO 37742 --- [extShutdownHook] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2020-07-09 00:53:49.217  INFO 37742 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-09 00:53:49.217  INFO 37742 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-09 00:53:49.217  INFO 37742 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Shutdown initiated...
2020-07-09 00:53:49.217  INFO 37742 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Shutdown initiated...
2020-07-09 00:53:49.224  INFO 37742 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Shutdown completed.
2020-07-09 00:53:49.224  INFO 37742 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Shutdown completed.
2020-07-09 00:53:49.230  INFO 37742 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-07-09 00:53:49.230  INFO 37742 --- [extShutdownHook] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2020-07-09 00:53:49.231  INFO 37742 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-09 00:53:49.232  INFO 37742 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-07-09 00:53:49.232  INFO 37742 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2020-07-09 00:53:51.264  INFO 37742 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-07-09 00:53:51.264  INFO 37742 --- [extShutdownHook] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2020-07-09 00:53:51.265  INFO 37742 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-07-09 00:53:51.265  INFO 37742 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Shutdown initiated...
2020-07-09 00:53:51.266  INFO 37742 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Shutdown completed.

BUILD SUCCESSFUL in 22s
```

Tests on CI

![Backend CI](images/backend-ci.png)

### Front End Unit Tests
```bash
> jest "--verbose"

 PASS  tests/sum.test.js
  ✓ adds 1 + 2 to equal 3 (2 ms)
  ✓ adds 5 + 2 to equal 7

 PASS  tests/frontend.test.js
  ✓ renders correct greeting (66 ms)
  ✓ will render a search bar as an input group (13 ms)
  ✓ will render a search bar with a placeholder message (18 ms)
  ✓ will render a field to upload files (12 ms)
  ✓ will show placeholder text in a custom file input field (11 ms)
  ✓ will render a field to upload files (10 ms)
  ✓ clear button renders (10 ms)
  ✓ search button renders (10 ms)
  ✓ search cards will show the author's name and email (3 ms)
  ✓ search card will show the the curriculum's description as text (2 ms)
  ✓ a sign out button is present and contains right title (2 ms)

Test Suites: 2 passed, 2 total
Tests:       13 passed, 13 total
Snapshots:   0 total
Time:        2.148 s
Ran all test suites.
```

Tests on CI

![Front End Unit Test](images/tests_fe_2.png)

Test on Command Line:

![Front End Unit Test](images/tests_fe_2_terminal.png)


### Pair programming
#### Sprint 1
- Backend was completed by Hemal and Keith following the peer programming principles. 
![Peir programming Sprint 1](images/Hemal_Keith_pair_programming.png)

- Frontend was completed by Edwin and Wa'il following the peer programming principles.
![Peir programming Sprint 1](images/peer_fe_1.png)

#### Sprint 2
- Backend was completed by Hemal and Keith following the peer programming principles. 
![Peir programming Sprint 2](images/Hemal_Keith_sprint_2.png)

- Frontend was completed by Edwin and Wa'il following the peer programming principles.


# Continuous Deployment
We deploy both the frontend and backend service on the Heroku Platform.
- For each check in or merge to the curriculum-crawler-backend repo master branch, we execute the tests and deploy the application ub the curriculum-crawler/curriculum-crawler-backend pipeline.
- For each check in or merge to the cc_frontend repository master branch, we execute the tests and deploy the application ub the curriculum-crawler/cc_frontend pipeline.

## Backend Continuous Deployment Pipeline
![Backend Continuous Deployment Pipeline](images/backend-pipeline.png)
## Backend Continuous Deployment Dashboard
![Backend Continuous Deployment Dashboar](images/backend-cd.png)

## Frontend Continuous Deployment Pipeline
![Frontend Continuous Deployment Pipeline](images/frontend-pipeline.png)
## Frontend Continuous Deployment Dashboard
![Frontend Continuous Deployment Dashboar](images/frontend-cd.png)

# More Info

We can also be found in Canvas [Project Group 1](https://canvas.harvard.edu/courses/72401/groups) and on our [Slack](https://agilesoftwarecourse.slack.com/archives/C015ND86AJ3) channel. Our Kanban board can be found at [Trello](https://trello.com/b/iLxDKgHT/agile-sprint-board).

***This is a final project for [Agile Software Development CSCI-E71](http://agilesoftwarecourse.org/) as part of degree requirements for  [Harvard Extension School](http://www.extension.harvard.edu/).***

***Built with love in Orlando, Hong Kong, Boston Area...***
