package com.herokuapp.potus

import groovyx.net.http.RESTClient

class Util {
    static final String ROOT = System.getProperty('API_URL').toString()

    def getFirstName(def fullName) {
        def NameArray = fullName.split(' ')
        NameArray[0]
    }

    def getLastName(def fullName) {
        def NameArray = fullName.split(' ')
        NameArray[NameArray.size()-1]
    }

    def getPresidentByName(def name) {
        def http = new RESTClient(ROOT)
        def res = http.get(
                path: '/presidents/name-like/' + name
        )
        res.data
    }
}
