environments {

    dev {
        ui {
          url = 'http://localhost:3001'
        }

        api {
          url = 'http://localhost:3000'
        }
    }

    test {
      ui {
        url = 'http://potus-ui.herokuapp.com'
      }

      api {
        url = 'http://potus-api.herokuapp.com'
      }
    }

}
