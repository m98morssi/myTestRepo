# Testing the Presidents of the United States

Your mission, should you choose to accept, is to write functional tests to ensure that acceptance criteria has been met for the three [attached user stories](UserStories.md). Below is the documentation for everything you need to complete the mission. This should take about an hour to do and no more than 2 hours total.

## Requirements

- Each test needs to prove that the acceptance criteria for the related story is either met or not met.
- Each test should validate the associated UI and the API components.

## Notes

- UI: [https://potus-ui.herokuapp.com](https://potus-ui.herokuapp.com)
- API: [https://potus-api.herokuapp.com](https://potus-api.herokuapp.com)
  - **Endpoints**
    - [GET] /presidents
    - [GET] /presidents/parties
    - [GET] /presidents/:id
      - id: numeric value
    - [GET] /presidents/name-like/:name
      - name: string value
    - [GET] /presidents/with-year/:year
      - year: numeric value

## Usage

Clone, fork or download a copy of this repository. A sample test has been created in the src/groovy directory. Run the tests by executing the gradlew binary.

Windows

    gradlew.bat -Penv=test chromeTest

Linux / Mac OS

    ./gradlew -Penv=test chromeTest

You will need to use a machine that can access the URLs in the notes section above.

## Status

[![Build Status](https://travis-ci.org/stevegood/potus-tests.svg?branch=master)](https://travis-ci.org/stevegood/potus-tests)
