package com.herokuapp.potus

import geb.spock.GebReportingSpec

class PresidentsSpec extends GebReportingSpec {

  API api

  def setup() {
    api = new API()
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

}
