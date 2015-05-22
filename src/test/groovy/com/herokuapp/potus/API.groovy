package com.herokuapp.potus

import groovyx.net.http.RESTClient

class API {
  static final String ROOT = System.getProperty('API_URL').toString()

  def listPresidents() {
    def http = new RESTClient(ROOT)
    def res = http.get(
      path: '/presidents'
    )
    res.data
  }
}
