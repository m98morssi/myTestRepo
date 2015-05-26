package com.herokuapp.potus

import geb.spock.GebReportingSpec

class PresidentsSpec extends GebReportingSpec {

    API api
    Util util


    def setup() {
        api = new API()
        util = new Util()

    }

    def "Should test that API returns a list of presidents and the UI displays them"() {
        when:
        to IndexPage

        then:
        at IndexPage

        when:
        def apiPresidents = api.listPresidents()

        then:
        apiPresidents.each { president ->
            def uiPresident = $("a[href='/president/$president._id']")
            assert uiPresident
            assert president.name == uiPresident.text()
        }
    }

    def "Should be able to search by first name or last name"() {
        when:
        to PresidentsByNamePage

        then:
        at PresidentsByNamePage

        when:
        def apiPresidents = api.listPresidents()

        then:
        apiPresidents.each { president ->
            validatePresidentName(util.getFirstName(president.name)) // 1-enter firstName, 2-click search, 3-validate
            validatePresidentName(util.getLastName(president.name)) // 1-enter lastName, 2-click search, 3-validate

        }
    }

    // ToDo move the following methods to PresidentByNamePage
    def searchPresidentByName(def name) {
        waitFor {$ (PresidentsByNamePage.searchField).isDisplayed()}
        $(PresidentsByNamePage.searchField).value(name)
        $(PresidentsByNamePage.searchBtn).click()
        waitFor { $("li").isDisplayed() }
        $(PresidentsByNamePage.presidentsList)

    }

    def validatePresidentName(def name) {
        def UI_presidentsList = searchPresidentByName(name)
        def API_presidentsList = api.getPresidentByName(name)
        assert API_presidentsList.size() == UI_presidentsList.size()
        for (int i; i < API_presidentsList.size(); i++) {
            assert API_presidentsList[i].name == UI_presidentsList[i].text()
        }
        to PresidentsByNamePage
    }

}
