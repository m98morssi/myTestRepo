package com.herokuapp.potus

import geb.Page

class IndexPage extends Page {
  static url = '/'

  static at = {
    title == 'Presidents of the United States'
  }

  static content = {
    navigation { module NavigationModule, $('#navigation', 0) }
  }
}
